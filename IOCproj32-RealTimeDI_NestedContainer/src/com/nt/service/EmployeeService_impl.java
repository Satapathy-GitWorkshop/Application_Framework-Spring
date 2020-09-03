package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeService_impl implements EmployeeService {
private EmployeeDAO dao;
	
	public EmployeeService_impl(EmployeeDAO dao) {
	this.dao = dao;
    }

	@Override
	public List<EmployeeDTO> fetchEmployee(String degs1, String degs2, String degs3) throws Exception {
		List<EmployeeBO>listbo=null;
		//Convert paramater values into Uppercase bcz of database need
		degs1=degs1.toUpperCase();
		degs2=degs2.toUpperCase();
		degs3=degs3.toUpperCase();
		//call EmployeeDAO class parameter into upperCase bcz of database need
	listbo=dao.getEmployee(degs1, degs2, degs3);
	   //Copy the record from listbo to listdto
	List<EmployeeDTO>listdto= new ArrayList<EmployeeDTO>();
	for(EmployeeBO bo:listbo) {
		EmployeeDTO dto= new EmployeeDTO();
		BeanUtils.copyProperties(bo,dto);
	//add each dto Object to listdto
		listdto.add(dto);
	}
		
		return listdto;
	}

}
