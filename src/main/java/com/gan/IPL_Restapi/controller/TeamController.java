package com.gan.IPL_Restapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gan.IPL_Restapi.model.Team;
import com.gan.IPL_Restapi.service.TeamService;

@RestController
@RequestMapping("api")

public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	
	
	@PostMapping("/teams")
	public String addteam(@RequestBody Team team ) {
		
		String msg= teamService.addTeam(team);

		return msg;
	}
	
	
	
	
	@GetMapping("/teams/all")
	public List<Team> getAllTeams(){
		
		List<Team> allTeams= teamService.getAllTeams();
		
		return allTeams;
		
	}
	
	@GetMapping("/team")
	public Object getTeamById(@RequestParam int id) {
		Team team=teamService.getTeamById(id);
		
		if (team!=null) {	
			
			return team;
		}	
		else {
			return "Team Not Found";
		}
		
	}

	@PutMapping("/team/update")
    public String updateTeam(@RequestBody Team team) {
        String msg = teamService.updateTeam(team);
        return msg;
    }
	
	
	@DeleteMapping("/team/delete")
    public String deleteTeam(@RequestParam int id) {
        String msg = teamService.deleteTeam(id);
        return msg;
    }
	
	
	
	}
	
	


