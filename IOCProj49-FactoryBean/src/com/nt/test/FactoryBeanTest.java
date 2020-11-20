package com.nt.test;

import javax.naming.event.EventContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.EventScheduler;

public class FactoryBeanTest {
public static void main(String[] args) {
	ApplicationContext ctx=null;
	EventScheduler sch=null;
	//create ApplicationContext Container
	ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//calling getBean method
	sch= ctx.getBean("scheduler",EventScheduler.class);
	//caling target class b.method
	System.out.println(sch.getSchedule());
}
}

