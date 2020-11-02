package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBo;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Service("service")
public class StudentServiceimpl  implements StudentService{
   @Autowired
	private StudentDAO dao;
	@Override
	public List<StudentDTO> getStudentbyAddrs(String addrs) {
		List<StudentBo>listbo=null;
		List<StudentDTO>listdto= new ArrayList<StudentDTO>();
		listbo=dao.fetchStudetByaddrs(addrs);
		//copy data from list bo to dtp
		listbo.forEach(bo->{
			StudentDTO dto= new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
		//copy dto object to listdto
			listdto.add(dto);
		});
	
		
		
		return listdto;
	}

}
