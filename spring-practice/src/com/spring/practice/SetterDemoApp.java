package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress() + " "+ theCoach.getTeam());
	}

}
