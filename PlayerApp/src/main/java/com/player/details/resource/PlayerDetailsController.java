package com.player.details.resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.player.details.model.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerDetailsController {
	
	private static final Logger logger = LogManager.getLogger(PlayerDetailsController.class);
	
	@Autowired
	private PlayerService playerService;
	
	
	@GetMapping("/info/{id}")
	public ResponseEntity<?> getPlayerInfo(@PathVariable("id") int id)
	{
		logger.debug("PlayerDetailsController :: getPlayerInfo:: value of ID : "+ id);
		return new ResponseEntity<>(playerService.getPlayerInfo(id), HttpStatus.OK);
	}
	
	
}
