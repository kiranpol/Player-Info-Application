package com.player.details.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class CricketMatch {
	@Id
	private Integer matchId;
	private String seriesName;
	private String location;
	@Transient
	@JsonProperty
	private int score;
	@JsonIgnore
	@OneToMany(mappedBy="cricketMatch",fetch=FetchType.LAZY)
	private List<PlayerMatch> playerMatch;
	
	
	
	public Integer getMatchId() {
		return matchId;
	}
	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<PlayerMatch> getPlayerMatch() {
		return playerMatch;
	}
	public void setPlayerMatch(List<PlayerMatch> playerMatch) {
		this.playerMatch = playerMatch;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
}
