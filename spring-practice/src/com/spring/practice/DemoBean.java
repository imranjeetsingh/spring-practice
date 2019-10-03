package com.spring.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println(result);
		
		context.close();
	}

}
