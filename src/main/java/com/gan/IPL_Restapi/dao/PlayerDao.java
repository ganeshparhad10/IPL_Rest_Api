package com.gan.IPL_Restapi.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gan.IPL_Restapi.model.Player;


@Repository
public class PlayerDao {

	
	
	List<Player> players= new ArrayList<Player>();
	public String addPlayer(Player player) {
	
	players.add(player);
	return "Added Successfuly";
}
	
	
public List<Player> getAllPlayers(){
	
	
	return players;

}

public Player getPlayerById(int id) {
	
	
	for (Player player : players) {
		if(player.getPlayerId()==id) {
			
			return player;
		}
		}
	return null;
		
	}
public String updatePlayer(Player updatedPlayer) {
    for (Player player : players) {
        if (player.getPlayerId() == updatedPlayer.getPlayerId()) {
            player.setName(updatedPlayer.getName());
            player.setAge(updatedPlayer.getAge());
            player.setTeamName(updatedPlayer.getTeamName());
            player.setTeamName(updatedPlayer.getTeamName());
            return "Team updated successfully";
        }
    }
    return "Team not found";
}


public String deletePlayer(int id) {
	for (Player player : players) {
		if(player.getPlayerId()==id) {
			players.remove(player);
			return "Team deleted successfully";
			
			
		}
		
	}
	return "Team Not Found" ;
}








}
	
	
	
	
	
	
	
	
	

