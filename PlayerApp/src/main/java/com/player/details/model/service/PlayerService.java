package com.player.details.model.service;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.player.details.dto.PlayerInfoDTO;
import com.player.details.model.Player;
import com.player.details.repository.PlayerMatchRepository;
import com.player.details.resource.PlayerDetailsController;

@Component
public class PlayerService {
	
	private static final Logger logger = LogManager.getLogger(PlayerDetailsController.class);
	
	@Autowired
	private PlayerMatchRepository playerMatchRepository;
	
	
	public PlayerInfoDTO getPlayerInfo(int id)
	{
		
		logger.info("Entered into PlayerService class getPlayerInfo method and Id is "+id);
		//get player info from repository
		Optional<Player> players = playerMatchRepository.findById(id);
		
		final PlayerInfoDTO PlayerInfoDTO = new PlayerInfoDTO();
		
		if(players.isPresent())
		{
			logger.info("PlayerService class getPlayerInfo method in the if block player is present");
			//set player info to PlayerInfoDTO
			PlayerInfoDTO.setName(players.get().getName());
			PlayerInfoDTO.setId(players.get().getPlayerId());
			PlayerInfoDTO.setCricketTeam(players.get().getCricketTeam());
			
			players.get().getPlayerMatchs().stream().forEach(
						e->{
							e.getCricketMatch().setScore(e.getScore());
							PlayerInfoDTO.getMatches().add(e.getCricketMatch());
							PlayerInfoDTO.setTotal(PlayerInfoDTO.getTotal()+e.getScore());
						}
					);
			PlayerInfoDTO.getMatches();
			return PlayerInfoDTO;
		}
		else
		{
			//if given player is not present for given id
			logger.info("PlayerService class getPlayerInfo method in the else block player is not present");
			throw new NullPointerException("Player Not Found for given Id : "+id);
		}
	}
	
}
