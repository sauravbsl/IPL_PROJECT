package com.client;

import java.util.List;

import com.entity.Player;
import com.service.ControlLayer;
public class ClientLayer {

	public static void main(String[] args) {
		ControlLayer allplayer = new ControlLayer();
		List<Player> allPlayers = allplayer.getAllPlayer2();

	}

}
