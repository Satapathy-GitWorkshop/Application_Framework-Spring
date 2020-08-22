package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bean.Customer;

public class Instanciation_Test1 {
public static void main(String[] args) {
	Customer cust=null;
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	//Create IOC Container
	factory= new DefaultListableBeanFactory();
	reader= new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	//calling getBean(-) method
	
	//cust=factory.getBean("cust",Customer.class);
    //cust.placeOrder();
}
}
//when we call factory.getBean()then object is created and this called lazy instanciation