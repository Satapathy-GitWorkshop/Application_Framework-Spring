package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Customer;

public class SterioAnno_Test {
public static void main(String[] args) {
	ApplicationContext ctx=null;
	Customer cust=null;
	//create IOC Container
	ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//Calling getBean()
	cust=ctx.getBean("cust",Customer.class);
	//calling business method
	cust.Transaction();
}
}
