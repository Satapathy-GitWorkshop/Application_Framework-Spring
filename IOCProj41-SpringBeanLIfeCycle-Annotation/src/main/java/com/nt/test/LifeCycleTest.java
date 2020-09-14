package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VottingEligibility;

public class LifeCycleTest {
public static void main(String[] args) {
	ApplicationContext ctx=null;
	VottingEligibility votting=null;
	//Create IOC Container
	ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//Calling getBean Method
	votting=ctx.getBean("voter",VottingEligibility.class);
	//dispalying the value
	System.out.println(votting);
}
}
