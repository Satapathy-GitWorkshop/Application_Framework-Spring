package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.AdharDetails;
import com.nt.beans.ResturantDetails;

public class Null_Injection_Test {

	public static void main(String[] args) {
           DefaultListableBeanFactory factory=null;
           XmlBeanDefinitionReader reader=null;
           AdharDetails details=null;
           ResturantDetails rdetails=null;
		//Create Bean factory Container
		    factory=new DefaultListableBeanFactory();
		    reader=new XmlBeanDefinitionReader(factory);
		    reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//Calling factory method
		    details=factory.getBean("details",AdharDetails.class);
		    rdetails=factory.getBean("resturant",ResturantDetails.class);
		//Dispalying the Data
		    System.out.println(details);
		    System.out.println(rdetails);

	}

}
