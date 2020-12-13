package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class PerfermanceMonitorTest {

	public static void main(String[] args) {
		ApplicationContext ctx= null;
		BankService service= null;
		//create IOC Container
		ctx= new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
		//get targetClass Object through proxy class
		service=ctx.getBean("service",BankService.class);
		//calling taget method
		    System.out.println(service.calculateSimpleInterest(12000, 2,5));
		//close IOC Container
		    ((AbstractApplicationContext) ctx).close();

	}

}
