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

@Override
public int insertEmployee(int eno, String ename, String desg, float salary) {
	
	return dao.insert(eno, ename, desg, salary);
}

@Override
public int deleteEmployee(int no) {
	
	return dao.deletebyNo(no);
}

}
