package com.player.details.dto;

import java.util.ArrayList;
import java.util.List;

import com.player.details.model.CricketMatch;

public class PlayerInfoDTO {
	private int id;
	private String name;
	private String cricketTeam;
	private int total;
	
	private List<CricketMatch> matches = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setCricketTeam(String cricketTeam) {
		this.cricketTeam = cricketTeam;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<CricketMatch> getMatches() {
		return matches;
	}

	public void setMatches(List<CricketMatch> matches) {
		this.matches = matches;
	}

	@Override
	public String toString() {
		return "PlayerInfoDTO [id=" + id + ", name=" + name + ", cricketTeam=" + cricketTeam + ", total=" + total
				+ ", matches=" + matches + "]";
	}
	
	
}
