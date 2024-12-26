package com.gan.IPL_Restapi.dao;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gan.IPL_Restapi.model.Match;


@Repository

public class MatchDao {
	
	 List<Match> matchs=new ArrayList<Match>();
	 public String addMatch(Match match) {
		 matchs.add(match);
		 return "addeded Successfully";
	 }
	 

	 
	 public List<Match> getAllMatches(){
		 
		 return matchs;
	
		 
	 }
	 
	 public Match getMatchById(int id ){
			for (Match match : matchs) {
				if (match.getMatchId()==id) {
					
					return match;
				}	
			}
			return null;
		}
	 
	 
	 public String deleteMatch(int id) {
	        for (Match match : matchs) {
	            if (match.getMatchId() == id) {
	                matchs.remove(match);
	                return "Match deleted successfully";
	            }
	        }
	        return "Match not found";
	    }

	 
	 
}
