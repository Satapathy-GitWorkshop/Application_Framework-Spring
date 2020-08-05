package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


import com.nt.bean.JobApplicationResult;

public class DetailsTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
	    JobApplicationResult result=null;
//creating the IOC Container
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//Calling the factory method
		result=factory.getBean("result",JobApplicationResult.class);
//Displaying the package and Aditional 
		System.out.println(result.appliedMessage());

	}

}
