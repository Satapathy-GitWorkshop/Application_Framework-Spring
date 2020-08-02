package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bean.JavaPackage;

public class MergingTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		JavaPackage broucher=null;
//creating the IOC Container
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//Calling the factory method
		broucher=factory.getBean("Student",JavaPackage.class);
//Displaying the package and Aditional data
		System.out.println(broucher);

	}

}
