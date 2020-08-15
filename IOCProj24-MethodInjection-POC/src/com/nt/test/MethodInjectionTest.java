package com.nt.test;

import java.sql.DriverManager;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class MethodInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Class c=null;
		DriverManager d=null;
		String s1=null,s2=null;
		 String s3=null;
	Calendar c1=null;
		//create IOC Container
		factory= new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//calling getBean(-) method
		c=factory.getBean("c1",Class.class);
		System.out.println("c obj class name"+c.getClass().getName()+"  c obj data::"+c.toString());
		c1=factory.getBean("c2",Calendar.class);
		System.out.println("c1 obj class name"+c1.getClass().getName()+"  c1 obj data::"+c1.toString());
		//d=factory.getBean("c3",DriverManager.class);
		//System.out.println("d obj class name"+d.getClass().getName()+"  d obj data::"+d.toString());
		s1=factory.getBean("c4",String.class);
		System.out.println("s1 obj class name"+s1.getClass().getName()+"  s1 obj data::"+s1.toString());
		s2=factory.getBean("c5",String.class);
		System.out.println("s2 obj class name"+s2.getClass().getName()+"  s2 obj data::"+s2.toString());
		s3=factory.getBean("c7",String.class);
		System.out.println("s3 obj class name"+s3.getClass().getName()+"  s3 obj data::"+s3.toString());
		

	}

}
