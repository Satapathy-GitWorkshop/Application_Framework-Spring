package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.dto.StudentDTO;
import com.nt.service.IStudentService;

public class SimpleJdbcInsert_Test {
	public static void main(String[] args) {
		//create IOc container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationCOntext.xml");
		//Get service class Object
		IStudentService service= ctx.getBean("service",IStudentService.class);
		//create dto Object having value to call service class method
		     StudentDTO dto= new  StudentDTO();
		     dto.setNo(71);
		     dto.setName("isha");
		     dto.setAddress("nepal");
		try {
		     System.out.println(service.persistStudent(dto));
		     }
		catch(DataAccessException dae) {
		   dae.printStackTrace();	
		}
		}

}
