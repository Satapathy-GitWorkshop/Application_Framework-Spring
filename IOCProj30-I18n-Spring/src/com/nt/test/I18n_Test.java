package com.nt.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18n_Test {
 public static void main(String[] args) {
	ApplicationContext ctx=null;
	Locale locale= null;
	String cap1=null,cap2=null,cap3=null,cap4=null;
	//create ApplicationContext Container
	ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//Create Locale Object
	locale= new Locale(args[0],args[1]);//args[0]-language,args[1]-country
//caliing getMessage method
		/*
		 * cap1=ctx.getMessage("btn1.cap",null, locale);
		 * cap2=ctx.getMessage("btn2.cap",null, locale);
		 * cap3=ctx.getMessage("btn3.cap",null, locale);
		 * cap4=ctx.getMessage("btn4.cap",null, locale);
		 */
//If we want some extra message-----
     cap1=ctx.getMessage("btn1.cap",new String[] {"hi"},"moring-",locale);
     cap2=ctx.getMessage("btn2.cap",null,"noon-",locale);
     cap3=ctx.getMessage("btn3.cap",null,"evening-",locale);
     cap4=ctx.getMessage("btn4.cap",null,"night-",locale);
    System.out.println(cap1);
    System.out.println(cap2);
    System.out.println(cap3);
    System.out.println(cap4);
    
 }//main
}//class
