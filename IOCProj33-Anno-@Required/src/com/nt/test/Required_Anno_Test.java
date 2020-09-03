package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.PlantInfo;

public class Required_Anno_Test {
	public static void main(String[] args) {
		ApplicationContext context=null;
		PlantInfo info=null;
		//Create IOC container
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//Calling getBean(-) method
		info=context.getBean("info",PlantInfo.class);
		//Displaying the value (Without @Required)
		System.out.println(info);//PlantInfo [name=Snake Plant, water=Water Partially, sunlight=null, compost_ratio=0.0]
		//Displaying the value (With @Required)
		System.out.println(info);
		//PlantInfo [name=Snake Plant, water=Water Partially, sunlight=shady Area, compost_ratio=2.1]
	}
	 }
