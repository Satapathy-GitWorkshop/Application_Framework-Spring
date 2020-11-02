package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.StudentMgmtService;
import com.nt.service.StudentMgmtServiceimpl;

public class CallBackTest {
public static void main(String[] args) {
	ApplicationContext ctx=null;
	StudentMgmtService service=null;
	//create IOC container
	ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//get target class Object
    service=ctx.getBean("service", StudentMgmtServiceimpl.class);
    //calling b method
    try {
    	System.out.println("Employee Details::"+service.fetchEmployeeByNo(107));
    }
    catch (DataAccessException dae) {
	    dae.printStackTrace();
	}
    //close the Container
    ((AbstractApplicationContext) ctx).close();
}
}
