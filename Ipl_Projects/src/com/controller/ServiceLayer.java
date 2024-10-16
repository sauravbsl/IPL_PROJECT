package com.controller;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.dao;
import com.entity.Player;

public class ServiceLayer {
	public List<Player> getAllPlayer2() {
		dao allplayer = new dao();
		List<Player> allPlayers = allplayer.getAllPlayer();

		System.out.println("Enter the player name: ");
		Scanner sc = new Scanner(System.in);
		String enterName = sc.nextLine();

		boolean playerFound = false;
		Player matchedPlayer = null;

		for (Player player : allPlayers) {
			if (player.getName().equalsIgnoreCase(enterName)) {
				System.out.println("Player Information: " + player);
				playerFound = true;
				matchedPlayer = player;
				break;
			}
		}

		if (!playerFound) {
			System.out.println("Player not found with the name: " + enterName);
		} else {
			try {
				if (matchedPlayer.getRuns() > matchedPlayer.getWickets() && matchedPlayer.getWickets() == 0) {
					System.out.println(matchedPlayer.getName() + " is a Batsman");
				} else if (matchedPlayer.getRuns() == matchedPlayer.getWickets()) {
					System.out.println(matchedPlayer.getName() + " is an All-rounder");
				} else if (matchedPlayer.getRuns() < matchedPlayer.getWickets()) {
					System.out.println(matchedPlayer.getName() + " is a Bowler");
				}
			} catch (ClassCastException e) {
				e.printStackTrace();
			}
		}
		return allPlayers;
	}
}