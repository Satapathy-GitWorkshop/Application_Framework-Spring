package com.nt.service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
  public int fetchEmployeeCount();
  public Map fetchEmployeebyNo(int no);
  public List fetchEmployeebyDesg(String desg);
  public int insertEmployee(int eno, String ename, String desg, float salary);
  public int deleteEmployee(int no);
}