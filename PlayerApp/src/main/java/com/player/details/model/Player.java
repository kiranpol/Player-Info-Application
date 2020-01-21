package com.player.details.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Player {
	
	@Id
	private Integer playerId;
	private String name;
	private String cricketTeam;
	@JsonIgnore
	@OneToMany(mappedBy="player",fetch=FetchType.LAZY)
	private List<PlayerMatch> playerMatchs;
	
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCricketTeam() {
		return cricketTeam;
	}
	public List<PlayerMatch> getPlayerMatchs() {
		return playerMatchs;
	}
	public void setPlayerMatchs(List<PlayerMatch> playerMatchs) {
		this.playerMatchs = playerMatchs;
	}
	public void setCricketTeam(String cricketTeam) {
		this.cricketTeam = cricketTeam;
	}
	
	
	
	
}
