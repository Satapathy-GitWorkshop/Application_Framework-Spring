package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.dao.StudentDAOimpl;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class NamedParam_Test {
public static void main(String[] args) {
	ApplicationContext ctx=null;
   StudentService service=null;
	ctx= new ClassPathXmlApplicationContext("com/nt/cfg/applicationcontext.xml");
	//Get Service class Obj
	service= ctx.getBean("service",StudentService.class);
	//calling service class methos
	try {
		System.out.println(service.getStudentByno(107));
		System.out.println("-----------------");
	}
	catch (DataAccessException e) {
		e.printStackTrace();
	}
	try {
		System.out.println(service.loadStudentByaddrs("Bhubaneswar"));
		System.out.println("----------------");
	}
	catch (DataAccessException e) {
		e.printStackTrace();
	}
	//use DTO Object
	StudentDTO dto= new StudentDTO();
	  dto.setNo(104);
	  dto.setName("Tausief");
	  dto.setAddrs("pune");
	try {
		System.out.println(service.persistStudent(dto));
	}
	catch (DataAccessException e) {
		e.printStackTrace();
	}
	
}
}
