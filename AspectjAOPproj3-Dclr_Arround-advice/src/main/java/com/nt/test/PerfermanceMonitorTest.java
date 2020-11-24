package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class PerfermanceMonitorTest {
public static void main(String[] args) {
	//create IOC Container
	ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
	//get Target class Object
	BankService service=ctx.getBean("service",BankService.class);
	//calling b.method of target class
	System.out.println(service.calculateSimpleinterest(150000,5,12));
	//close the container
	((AbstractApplicationContext) ctx).close();
}
}
