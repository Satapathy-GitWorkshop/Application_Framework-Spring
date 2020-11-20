package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		WishMessageGenerator generator=null;
		ApplicationContext ctx= null;
		//create IOC Container having class name
		  ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		//get dependent class Object
		  generator=ctx.getBean("wmg", WishMessageGenerator.class);
		  //calling b.method
		  System.out.println(generator.generateWishMessage("saurav"));
		  
	}

}
