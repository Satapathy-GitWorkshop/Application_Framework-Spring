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
		//use dto obj for calling method
		listbo=dao.fetchStudent(addrs);
		//copy data from listbo to list dto
		  listbo.forEach(bo->
		  {
			StudentDTO dto= new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			//setting value to dto Object
			dto.setNo(bo.getNo());
			dto.setName(bo.getName());
			dto.setAddress(bo.getAddress());
			//Store into list Collection
			listdto.add(dto);
		  });//forEach()
		 
	
		return listdto;
	}//method

}//class
