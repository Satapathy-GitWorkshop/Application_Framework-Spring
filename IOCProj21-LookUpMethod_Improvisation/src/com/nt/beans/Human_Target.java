package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Human_Target {
	private String beanid;
	
	public Human_Target(String beanid) {
		super();
		this.beanid = beanid;
	}
	public void Talking() {
		System.out.println("I am Talking my friend");
	}
	public void Slipping() {
		System.out.println("I am sleeping plz don't distrub");
	}
	public void Stdying() {
		System.out.println("I have to study hard  !!!");
	}
    public void Eating() {
    	DefaultListableBeanFactory factory=null;
    	XmlBeanDefinitionReader reader=null;
    	Water_Dependent water=null;
 //Create IOC(extra) container
    	factory= new DefaultListableBeanFactory();
    	reader= new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
    	water=factory.getBean(beanid,Water_Dependent.class);
         water.water();
    }
    
}
