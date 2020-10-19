package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.EmployeeDAO;

public class EmployeeServiceimpl implements EmployeeService {
    private EmployeeDAO dao;
    
	
	public EmployeeServiceimpl(EmployeeDAO dao) {
		
		this.dao = dao;
	}

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
