package com.gan.IPL_Restapi.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gan.IPL_Restapi.dao.MatchDao;
import com.gan.IPL_Restapi.model.Match;


@Service
public class MatchService {
	@Autowired
	private MatchDao matchDao;
	
	public String addMatch(Match match) {
		
		String msg=matchDao.addMatch(match);
		
		return msg;
	}
	
	public List<Match> getAllMatches(){
		
		List<Match> allMatches=matchDao.getAllMatches();
		
		return allMatches;
		
	}
	
	public Match getMatchById(int id) {
		Match match=matchDao.getMatchById(id);
		
		return match;
	}
	
	

	public String deleteMatch(int id) {
		
		String msg=matchDao.deleteMatch(id);
		
		return msg;
	}
	
	
	
	
	
	
	
}
