package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.config.AppConfig;
import com.nt.service.EmployeeService;
import com.nt.service.EmployeeServiceimpl;

public class TemplatesDirectMethodTest {
   

   public static void main(String[] args) {
	  ApplicationContext ctx=null;
	   EmployeeService service=null;
	  //create IOC container
	 ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	  //Get tatget bean class Object
	   service=ctx.getBean("service",EmployeeServiceimpl.class);
	   //calling service class method
	   try {
		   System.out.println("EmployeeCount::"+service.fetchEmployeeCount());
		   System.out.println("Employee by Empno::"+service.fetchEmployeebyNo(7499));
		   System.out.println("Employee by Desg::"+service.fetchEmployeebyDesg("MANAGER"));
	   }
	   catch (DataAccessException dae) {
		dae.printStackTrace();
	}
	  //close Container
	   ((AbstractApplicationContext) ctx).close();
}//main
}//class
