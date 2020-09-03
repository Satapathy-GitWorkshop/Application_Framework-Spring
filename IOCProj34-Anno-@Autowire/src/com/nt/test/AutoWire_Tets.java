package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.HardWare_Store;

public class AutoWire_Tets {
public static void main(String[] args) {
	ApplicationContext ctx=null;
	HardWare_Store store =null;
	//create Container
	ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//Calling get Bean Method
	store =ctx.getBean("shop",HardWare_Store.class);
	store.Selling_product();
	
}
}
