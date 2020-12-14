package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.IBankService;

public class ProxyInterfaceTest {
   public static void main(String[] args) {
	//Create IOC Container
	   ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	//Getting proxy class Object using Interface reference
	   IBankService service=ctx.getBean("service",IBankService.class);
	//calling B.method 
	    System.out.println(service.calculateSimpleInterest(15000,5,12));
    //close Container
	    ((AbstractApplicationContext) ctx).close();
}
}
