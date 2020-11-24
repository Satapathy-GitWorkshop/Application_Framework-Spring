package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ExamHall;

public class ExamLggingTest {
public static void main(String[] args) {
	//create IOC Container
	ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//getting target class Object
	ExamHall hall=ctx.getBean("examhall",ExamHall.class);
	//calling target method
	System.out.println(hall.givingExam("math","saurav","monoj"));
	//close container
	((AbstractApplicationContext) ctx).close();
}
}
