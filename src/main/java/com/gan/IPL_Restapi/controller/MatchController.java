package com.gan.IPL_Restapi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gan.IPL_Restapi.model.Match;

import com.gan.IPL_Restapi.service.MatchService;

@RestController
@RequestMapping("api")

public class MatchController {
	@Autowired
	private MatchService matchService;
	
	@PostMapping("/match")
	public String addMatch(@RequestBody Match match) {
		
		String msg=matchService.addMatch(match);
		
		return msg;
		
	}
	
	
	@GetMapping("match/all")
	
	public List<Match> getAllMatches(){
		List<Match> allMatches=matchService.getAllMatches();
		return allMatches;
	}
	
	@GetMapping("/matchid")
	public Object getMatchById(@RequestParam int id) {
		Match match=matchService.getMatchById(id);
		
		if (match!=null) {	
			
			return match;
		}	
		else {
			return "Team Not Found";
		}
		
	}
	
	@DeleteMapping("/match/delete")
    public String deleteMatch(@RequestParam int id) {
        String msg = matchService.deleteMatch(id);
        return msg;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
