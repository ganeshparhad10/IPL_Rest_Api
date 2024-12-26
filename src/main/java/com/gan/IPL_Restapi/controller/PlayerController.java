package com.gan.IPL_Restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gan.IPL_Restapi.model.Player;
import com.gan.IPL_Restapi.service.PlayerService;

@RestController
@RequestMapping("api")

public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	
	@PostMapping("/players")
	public String addPlayer(@RequestBody Player player ) {
	String msg=playerService.addPlayer(player);
		
		return msg;
		
	}
	
	@GetMapping("/players/all")
	
	public List<Player> getAllPlayer(){
		
		List<Player> allPlayers=playerService.getAllPlayers();
		
		return allPlayers;
	}
	
	
	@GetMapping("players")
	
	public Object getPlayerById(@RequestParam int id){
		Player player=playerService.getPlayerById(id);
		
		if (player!=null) {
		return player;
		}
		else {
			return "Player Not Found";
		}
		}
	
	@PostMapping("/players/update")
	public String updatePlayer(@RequestBody Player player) {
		
		String msg=playerService.updatePlayer(player);
		
		return msg;
	
	}
	
	@PostMapping("/players/delete")
	public String deletePlayer(@RequestParam int id) {
		
		
		String msg=playerService.deletePlayer(id);
		
		return msg ;		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
