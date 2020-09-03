package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
public List<EmployeeBO>getEmployee(String degs1,String degs2,String degs3)throws Exception;
}
