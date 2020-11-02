package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
     public int getEmployeeCount();//getting Single Object
     public Map<String,Object>getEmployeebyNo(int no);//Getting Single Record
     public List<Map<String,Object>>getEmployeeByDesgs(String deg);//Getting Multiple Record
     public int insert(int eno,String ename,String desg,float salary);
     public int deletebyNo(int no);
}
