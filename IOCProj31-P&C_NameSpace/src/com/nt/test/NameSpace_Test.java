package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Resturant;

public class NameSpace_Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Resturant res=null;
	//Crete Application Context Container
		ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//Calling getBeab method
		res=ctx.getBean(Resturant.class,res);
		System.out.println(res);

	}

}
