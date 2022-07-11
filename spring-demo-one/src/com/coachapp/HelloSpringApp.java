package com.coachapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args)
	{
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContex.xml");
		
		//retrive bean from spring container
		Coach bcoach=context.getBean("myCoach",Coach.class);
		//call method on bean
		System.out.println(bcoach.getDailyWorkout());
		System.out.println(bcoach.getDailyFortune());
		//close the context
			context.close();
	}
	

}
