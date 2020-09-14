package com.nt.Client;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Controller.StudentController;
import com.nt.StudentVO.StudentVO;

public class ClientApplication {
	public static void main(String[] args) {
	//Gather input from eduser
		Scanner scn=null;
		String sname=null,sadd=null, mark1=null,mark2=null,mark3=null;
		ApplicationContext ctx=null;
		StudentController controller =null;
		//Read input
		scn=new Scanner(System.in);
	System.out.println(" Student Name");
	sname=scn.next();
	System.out.println("Student Adds");
	sadd=scn.next();
	System.out.println("First Mark");
	mark1=scn.next();
	System.out.println("Second Mark");
	mark2=scn.next();
	System.out.println("Third Mark");
	mark3=scn.next();
//Setting value to Vo object
	StudentVO vo=new StudentVO();
	vo.setStudentName(sname);
	vo.setStudentAdds(sadd);
	vo.setMark1(mark1);
	vo.setMark2(mark2);
	vo.setMark3(mark3);
//Crreating IOC Container
	ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	controller=ctx.getBean("controller",StudentController.class);
	//Invoke Business Method of class controller having vo object
	try {
		String result=controller.getResult(vo);
		System.out.println(result);
		
	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("Internal Problem");
	       e.getMessage();	
	}
	
	}
}
