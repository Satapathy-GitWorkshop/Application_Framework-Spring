package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bean.BeanScope;

public class BeanScope_Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		BeanScope scope1=null,scope2=null,scope3=null;
		// Create IOC Container
		factory= new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//calling factory method & Checking the Scope  (SINGLETON)
		scope1=factory.getBean("bean",BeanScope.class);
		System.out.println(scope1.hashCode());	
		scope2=factory.getBean("bean",BeanScope.class);
		System.out.println(scope2.hashCode());
		scope3=factory.getBean("bean",BeanScope.class);
		System.out.println(scope3.hashCode());
		//Checking equality
		System.out.println("scope1==scope2:?"+(scope1==scope2));
		System.out.println("scope1==scope3:?"+(scope1==scope3));

	}//main
}//class
