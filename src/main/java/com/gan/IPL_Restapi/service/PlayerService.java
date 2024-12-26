package com.gan.IPL_Restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.gan.IPL_Restapi.dao.PlayerDao;
import com.gan.IPL_Restapi.model.Player;

@Service

public class PlayerService {
	
	@Autowired
	private PlayerDao playerDao;
	
	public String addPlayer(@RequestBody Player player ) {
		String msg=playerDao.addPlayer(player);
			
			return msg;

}
	
	public List<Player> getAllPlayers(){
		List<Player> allPlayers=playerDao.getAllPlayers();
		
		return allPlayers;
	}
	
	
	public Player getPlayerById(int id){
		
		
		Player player=playerDao.getPlayerById(id);
		
		return player;
	}
	
	
	public String updatePlayer(@RequestBody Player player) {
		
		String msg=playerDao.updatePlayer(player);
		
		return msg;
	}

	public String deletePlayer(int id) {
		String msg =playerDao.deletePlayer(id);
		return msg;
	}
	
	}
	
	
	
	
	
	
	
	
	

