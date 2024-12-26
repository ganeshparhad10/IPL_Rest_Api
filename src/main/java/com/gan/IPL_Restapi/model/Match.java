package com.gan.IPL_Restapi.model;

public class Match {
	
	
	
	private int matchId;
	
	private String teamOne;
	
	private String teamtwo;
	
	private String date;
	
	private String venue;
	
	private String result;
	
	
	public Match() {
		// TODO Auto-generated constructor stub
	}


	public Match(int matchId, String teamOne, String teamtwo, String date, String venue, String result) {
		super();
		this.matchId = matchId;
		this.teamOne = teamOne;
		this.teamtwo = teamtwo;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}


	public int getMatchId() {
		return matchId;
	}


	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}


	public String getTeamOne() {
		return teamOne;
	}


	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}


	public String getTeamtwo() {
		return teamtwo;
	}


	public void setTeamtwo(String teamtwo) {
		this.teamtwo = teamtwo;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getVenue() {
		return venue;
	}


	public void setVenue(String venue) {
		this.venue = venue;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", teamOne=" + teamOne + ", teamtwo=" + teamtwo + ", date=" + date
				+ ", venue=" + venue + ", result=" + result + "]";
	}
	
	
	

}
