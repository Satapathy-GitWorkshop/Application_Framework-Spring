package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Human_Target;
import com.nt.beans.Water_Dependent;

public class LookUpmethodTest {

	public static void main(String[] args) {
	     Human_Target human=null;
	     DefaultListableBeanFactory factory=null;
	     XmlBeanDefinitionReader reader =null;
//Create Real IOC container
	     factory= new DefaultListableBeanFactory();
	     reader = new XmlBeanDefinitionReader(factory);
	     reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//Calling get bean method
	     human= factory.getBean("human",Human_Target.class);
//Calling Target class B.method
	     human.Talking();
	     human.Stdying();
	     human.Eating();
	     human.Slipping();
	     

	}

}
