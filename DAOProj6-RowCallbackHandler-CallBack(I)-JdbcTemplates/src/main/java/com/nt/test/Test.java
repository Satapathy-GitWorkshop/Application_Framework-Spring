package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.StudentService;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx=null;
	StudentService service=null;
	//crate Container
	ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	service=ctx.getBean("service",StudentService.class);
	//calling Service class method
	System.out.println(service.getStudentbyAddrs("Bhubaneswar"));
	
}
}
