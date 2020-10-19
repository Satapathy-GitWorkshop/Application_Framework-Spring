package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOimpl implements EmployeeDAO {
   private JdbcTemplate jt;
   private static final String employeeCount="SELECT COUNT(*) FROM EMP";	
  
   public EmployeeDAOimpl(JdbcTemplate jt) {
	this.jt = jt;
   }
//Count total no of Employee 
	@Override
	public int getEmployeeCount() {
       int count =0;
       //get employee count by template Object
       count =jt.queryForObject(employeeCount,Integer.class);
		return count;
	}
	@Override
	//getEmployee bt No
	public Map<String, Object> getEmployeebyNo(int no) {
		Map<String,Object>map=null;
		map=jt.queryForMap("SELECT EMPNO,ENAME,SAL,JOB,DEPTNO FROM EMP WHERE EMPNO=?",no);
		return map;
	}
	@Override
	//Get Employee by Desgs
	public List<Map<String, Object>> getEmployeeByDesgs(String deg) {
	   List<Map<String,Object>> list=null;
		list=jt.queryForList("SELECT EMPNO,ENAME,SAL,JOB,DEPTNO FROM EMP WHERE JOB =?",deg);
	   return list;
	}

}
