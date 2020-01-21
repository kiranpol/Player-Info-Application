package com.player.details.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;


@Entity
public class PlayerMatch {
	
	@EmbeddedId
	PlayerMatchId id;
 	
    @ManyToOne
    @MapsId("player_id")
    @JoinColumn(name = "player_id")
    private Player player;

    
    @ManyToOne
    @MapsId("match_id")
    @JoinColumn(name ="match_id")
    private CricketMatch cricketMatch;
    
    private int score;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public CricketMatch getCricketMatch() {
		return cricketMatch;
	}

	public void setCricketMatch(CricketMatch cricketMatch) {
		this.cricketMatch = cricketMatch;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
}
