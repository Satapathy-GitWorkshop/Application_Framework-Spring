package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDAO;

@Service(value = "service")
public class EmployeeServiceimpl implements EmployeeService {
    
	@Autowired
	private EmployeeDAO dao;
    
@Override
	public int fetchEmployeeCount() {
		return dao.getEmployeeCount();
	}

@Override
public Map fetchEmployeebyNo(int no) {
	return dao.getEmployeebyNo(no);
}

@Override
public List fetchEmployeebyDesg(String desg) {	
	return dao.getEmployeeByDesgs(desg);
}

}
