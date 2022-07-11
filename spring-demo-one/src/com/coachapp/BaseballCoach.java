package com.coachapp;

public class BaseballCoach implements Coach {
	//define private field
	private FortuneService fortuneService;
	public BaseballCoach()
	{
		
	}
	public BaseballCoach(FortuneService theFortuneService)
	{
		this.fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 min on baseball";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
}
