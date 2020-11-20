package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Human_Target {
	public Human_Target() {
      System.out.println("Human:0-param Constructor");
	}
	public void Talking() {
		System.out.println("I am Talking my friend");
	}
	public void Slipping() {
		System.out.println(" i am sleeping plz don't distrub");
	}
	public void Stdying() {
		System.out.println("i have to study hard  !!!");
	}
	
	
	//Traditional Lookup method Code
    public void Eating() {
    	ApplicationContext ctx=null;
    	Water_Dependent water=null;
 //Create IOC(extra) container
    	ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	water=ctx.getBean("water",Water_Dependent.class);
         water.water();
    }
    
}
