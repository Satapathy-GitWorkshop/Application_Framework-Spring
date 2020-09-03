package com.nt.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedContainer_Test {

	public static void main(String[] args) {
	ApplicationContext parent=null;
	ApplicationContext child=null;
	MainController controll=null;
	List<EmployeeVO>listvo=null;
	//Create parent ioc Container
	parent= new ClassPathXmlApplicationContext("com/nt/cfgs/parent-applicationContext.xml");
	//Create child Ioc Container
	child= new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/child-applicationContext.xml"},parent);
	//getting controller Class Object
	controll=child.getBean("controller",MainController.class);
	//calling controller class method
	try {
       listvo=controll.searchEmployee("clerk", "manager", "salesman");
       //displaying the record
     for(EmployeeVO vo:listvo) {
    	 System.out.println(vo);
     }
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	
	}//main
}//class
