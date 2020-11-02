package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBo;
import com.nt.dao.IStudentDAO;
import com.nt.dto.StudentDTO;

@Service("service")
public class StudentServiceimpl implements IStudentService {
	@Autowired
	private IStudentDAO dao;

	@Override
	public String persistStudent(StudentDTO dto) {
		StudentBo bo= new StudentBo();
		bo.setNo(dto.getNo());
		bo.setName(dto.getName());
		bo.setAddress(dto.getAddress());
		//use dao
		int count =dao.registerStudent(bo);
	
		return count==1?"RegistrationSucessful":"RegistrationFailed";
	}

}
