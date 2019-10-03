package com.spring.practice;

import org.springframework.context.annotation.ConditionContext;

public class TrackCoach implements Coach {
	
	public FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run at least 15KM";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Hello "+ fortuneService.getFortune();
	}
	
	public void startapp() {
		System.out.println("start app");
	}
	
	public void cleanapp() {
		System.out.println("cleaning up!!!!!!!!!");
	}
	
	
}
