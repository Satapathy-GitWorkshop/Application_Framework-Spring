package com.nt.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Service("service")
public class ServiceImpl implements StudentService{
   @Autowired
	private StudentDAO dao;
	@Override
	
	public String getStudentByno(int no) {
	//use dao
	return dao.fetchStudentbyNo(no);
	}

	@Override
	public List<StudentDTO> loadStudentByaddrs(String addrs) {
		List<StudentBO>listbo=dao.fetchStudentbyAddsrs(addrs);
		//converting listbo to listdto
		List<StudentDTO>listdto=new ArrayList<StudentDTO>();
		listbo.forEach(bo->
		{
		StudentDTO dto= new StudentDTO();	
		BeanUtils.copyProperties(bo, dto);
		listdto.add(dto);
		});
		return listdto;
	}

	@Override
	public String persistStudent(StudentDTO dto) {
		//Convert DTO to BO
		StudentBO bo= new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		int count=dao.StoreStudent(bo);
		
		return 
				count==1?"Object is Saved":"Objects is not Saveed";
	}

}
