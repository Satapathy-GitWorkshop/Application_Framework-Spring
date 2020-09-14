package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component(value = "human")
@Lazy
public class Human_Target implements ApplicationContextAware {
	
	ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}
	
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
    	Water_Dependent water=null;
    	//no need of creating extra container...
    	water=ctx.getBean("water",Water_Dependent.class);
         water.water();
    }
	
    
}
