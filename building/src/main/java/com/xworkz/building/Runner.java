package com.xworkz.building;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("configure.xml");
		System.out.println(applicationContext);
		Building bean = applicationContext.getBean(Building.class);
		System.out.println(bean);
	}

}
