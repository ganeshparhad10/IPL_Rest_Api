	package com.gan.IPL_Restapi.dao;
	
	import java.util.ArrayList;
	import java.util.List;
	
	import org.springframework.stereotype.Repository;
	
	import com.gan.IPL_Restapi.model.Team;
	
	
	@Repository	
	
	public class TeamDao {
		
		
			
		List<Team> teams= new ArrayList<Team>();
		
		
		public String addTeam(Team team) {
		
		teams.add(team);
		
		
		return "addeded Successfully";
		
		
		}
		
		
		public List<Team> getAllTeams() {
			
			return teams;
		}
		
		
		
		public Team getTeamById(int id ){
			for (Team team : teams) {
				if (team.getTeamId()==id) {
					
					return team;
				}	
			}
			return null;
		}
		
		
		public String updateTeam(Team updatedTeam) {
	        for (Team team : teams) {
	            if (team.getTeamId() == updatedTeam.getTeamId()) {
	                team.setName(updatedTeam.getName());
	                team.setCity(updatedTeam.getCity());
	                team.setCoach(updatedTeam.getCoach());
	                return "Team updated successfully";
	            }
	        }
	        return "Team not found";
	    }

		 public String deleteTeam(int id) {
		        for (Team team : teams) {
		            if (team.getTeamId() == id) {
		                teams.remove(team);
		                return "Team deleted successfully";
		            }
		        }
		        return "Team not found";
		    }
		
	
	
	}
