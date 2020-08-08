package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Nursery_Constructor;
import com.nt.beans.Nursery_Normal;
import com.nt.beans.Nursery_byName;
import com.nt.beans.Nursery_byType;


public class AutoWiringTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Nursery_Normal nursery=null;
		Nursery_byName byname=null;
		Nursery_byType bytype=null;
		Nursery_Constructor cons=null;
//Create ioc Container
		factory= new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//Calling factory method
		System.out.println("Normal Injection");
		nursery= factory.getBean("nursery",Nursery_Normal.class);
		nursery.sellingPlant();
		System.out.println("----------------------");
		byname=factory.getBean("green",Nursery_byName.class);
		System.out.println("   AutoWiring byName    ");
		byname.sellingPlant();
		System.out.println("----------------------");
		bytype=factory.getBean("green1",Nursery_byType.class);
		System.out.println("   AutoWiring byType    ");
		bytype.sellingPlant();
		System.out.println("----------------------");
		cons=factory.getBean("yy",Nursery_Constructor.class);
		System.out.println("   AutoWiring Constructor    ");
		bytype.sellingPlant();
		

	}

}
