package com.service;

import java.util.ArrayList;
import java.util.List;

import com.controller.ServiceLayer;
import com.dao.dao;
import com.entity.Player;

public class ControlLayer {
	public List<Player> getAllPlayer2() {
		ServiceLayer allplayer = new ServiceLayer();
		List<Player> allPlayers = allplayer.getAllPlayer2();
		return allPlayers;
	}
}
