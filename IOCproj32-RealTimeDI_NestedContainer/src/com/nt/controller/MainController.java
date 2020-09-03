package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public class MainController {
	private EmployeeService service;
	
	
	
public MainController(EmployeeService service) {
		this.service = service;
	}


public List<EmployeeVO>searchEmployee(String degs1,String degs2,String degs3)throws Exception{
	List<EmployeeDTO>listdto=null;
	List<EmployeeVO>listvo=null;
	//Calling EmployeeService Class method
	listdto=service.fetchEmployee(degs1, degs2, degs3);
	//Convert listdto to listvo(Optional)
	listvo= new ArrayList<EmployeeVO>();
	for(EmployeeDTO dto:listdto) {
		EmployeeVO vo= new EmployeeVO();
		BeanUtils.copyProperties(dto,vo);
		//add each record to listvo
		listvo.add(vo);
	}
	return listvo;
}
}//class
