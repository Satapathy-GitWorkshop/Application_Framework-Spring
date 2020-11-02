package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.Student_dao;
import com.nt.dto.StudentDTO;

public class StudentMgmtServiceimpl implements StudentMgmtService {
   private Student_dao dao;
   
	public StudentMgmtServiceimpl(Student_dao dao) {
	this.dao = dao;
     }
	@Override
	public StudentDTO fetchEmployeeByNo(int no) {
		StudentDTO dto=null;
		//use StudentDao object call the method
		StudentBO bo=dao.getEmployeebyNo(no);
		//create dto class object
		   dto= new StudentDTO();
		//setting value dto from bo 
		  dto.setSno(bo.getSno());
		  dto.setSname(bo.getSname().toUpperCase());
		  dto.setSadd(bo.getSadd().toUpperCase());
		return dto;
	}

}
