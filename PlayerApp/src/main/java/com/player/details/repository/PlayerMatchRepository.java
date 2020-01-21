package com.player.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.player.details.model.CricketMatch;
import com.player.details.model.Player;
import com.player.details.model.PlayerMatch;


public interface PlayerMatchRepository extends JpaRepository<Player, Integer> {
}
