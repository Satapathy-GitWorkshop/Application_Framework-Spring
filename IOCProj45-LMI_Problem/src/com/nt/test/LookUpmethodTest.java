package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Human_Target;
import com.nt.beans.Water_Dependent;

public class LookUpmethodTest {

	public static void main(String[] args) {
	     Human_Target human=null;
	    ApplicationContext ctx=null;
//Create Real IOC container
	    ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
//Calling get bean method
	     human= ctx.getBean("human",Human_Target.class);
//Calling Target class B.method
	     human.Talking();
	     human.Stdying();
	     human.Eating();
	     human.Slipping();
	     

	}

}
