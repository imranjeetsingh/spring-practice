package com.spring.practice;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("email setter!!!!!!");
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("team setter!!!");
	}

	public CricketCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("inside setter function");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Great Batsman M.S.Dhoni";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
