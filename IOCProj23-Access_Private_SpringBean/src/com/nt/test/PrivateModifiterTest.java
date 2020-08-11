package com.nt.test;



import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Private_Constructor;;

public class PrivateModifiterTest {

	public static void main(String[] args) {
		XmlBeanDefinitionReader  reader=null;
		DefaultListableBeanFactory factory=null;
		Private_Constructor tb=null;
		Object obj=null;
		   //create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean
		tb=factory.getBean("tb",Private_Constructor.class);
		System.out.println(tb);
		System.out.println("--------------------------------------");
		 obj=factory.getBean("db",Object.class);
		 System.out.println(obj);
		

	}

}

