package com.ranjeet.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService frotuneService;
	
	public TennisCoach() {
		System.out.println("hello default constructor!!!!!");
	}

//	@Autowired
//	public void AnyFrotuneService(FortuneService frotuneService) {
//		this.frotuneService = frotuneService;
//	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hello Tennis Coach!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return frotuneService.getFortuneService();
	}

}
