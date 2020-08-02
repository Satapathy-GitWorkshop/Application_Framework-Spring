package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.BikeDetails;
import com.nt.beans.CarDetails;

public class InheritanceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		BikeDetails details1,details2,details3,details4=null;
		CarDetails cdetails=null;
		//Creating ioc Container
		factory= new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//Calling the Factory Method
		details1=factory.getBean("bike1",BikeDetails.class);
		details2=factory.getBean("bike2",BikeDetails.class);
		details3=factory.getBean("bike3",BikeDetails.class);
		
		
		cdetails=factory.getBean("basecar",CarDetails.class);
//details4=factory.getBean("base",BikeDetails.class);   Error creating bean with name 'base': Bean definition is abstract
		System.out.println("--------------BikeInfo");
		System.out.println(details1);
		System.out.println(details2);
		System.out.println(details3);
		System.out.println("----------------CarInfo");
		System.out.println(cdetails);
		
	}

}
