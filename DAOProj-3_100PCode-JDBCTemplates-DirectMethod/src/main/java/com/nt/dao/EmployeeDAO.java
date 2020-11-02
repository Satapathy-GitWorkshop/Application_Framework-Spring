package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
     public int getEmployeeCount();
     public Map<String,Object>getEmployeebyNo(int no);
     public List<Map<String,Object>>getEmployeeByDesgs(String deg);
}
