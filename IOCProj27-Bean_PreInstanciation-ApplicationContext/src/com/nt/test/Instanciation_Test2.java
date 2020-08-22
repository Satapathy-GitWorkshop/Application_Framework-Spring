package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.bean.Customer;

public class Instanciation_Test2 {
public static void main(String[] args) {
	ApplicationContext ctx=null,ctx1=null;
	Customer cust=null;
	//create applicationContext container
	//ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	ctx1=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
}
}
//Its instanciation the all singleton scope in configuration file at time of container creation