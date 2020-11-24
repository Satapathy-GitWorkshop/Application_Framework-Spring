package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IBankService;

public class ProxyInterfaceTest {
   public static void main(String[] args) {
	//Create IOC Container
	   ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//Getting proxy class Object using Interface reference
	   IBankService service=ctx.getBean("bankservice",IBankService.class);
	//calling B.method 
	    System.out.println(service.calculateSimpleInterest(15000,5,12));
    //close Container
	    ((AbstractApplicationContext) ctx).close();
}
}
