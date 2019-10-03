package com.ranjeet.springannotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"String 1",
			"String 2",
			"String 3"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
