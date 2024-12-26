package com.gan.IPL_Restapi.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gan.IPL_Restapi.dao.TeamDao;
import com.gan.IPL_Restapi.model.Team;

@Service
public class TeamService {
	@Autowired
	
	private TeamDao teamDao;
	public String addTeam(Team team) {
		
		String msg=teamDao.addTeam(team);
		return msg;
	}
	
	
	public List<Team> getAllTeams() {
		
		
		List<Team> allTeams= teamDao.getAllTeams();
		
		return allTeams;
		
	}


	public Team getTeamById(int id) {
		Team team=teamDao.getTeamById(id);
		
		return team;
	}
	
	
	
	
	public String updateTeam(Team team) {
		
		String msg=teamDao.updateTeam(team);
		return msg;
		
		
		
	}
	
	
	public String deleteTeam(int id) {
		
		String msg=teamDao.deleteTeam(id);
		
		return msg;
	}
	
	
	
	

	
	
	
}
