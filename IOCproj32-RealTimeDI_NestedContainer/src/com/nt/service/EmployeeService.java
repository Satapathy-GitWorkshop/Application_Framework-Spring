package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
public List<EmployeeDTO>fetchEmployee(String degs1,String degs2,String degs3)throws Exception;
}
