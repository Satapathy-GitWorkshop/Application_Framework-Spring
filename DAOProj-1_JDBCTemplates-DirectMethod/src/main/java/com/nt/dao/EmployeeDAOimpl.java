package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOimpl implements EmployeeDAO {
   private JdbcTemplate jt;
   private static final String employeeCount="SELECT COUNT(*) FROM EMP";	
   private static final String employeebyNo="SELECT EMPNO,ENAME,SAL,JOB,DEPTNO FROM EMP WHERE EMPNO=?";
   private static final String employeebyDesg="SELECT EMPNO,ENAME,SAL,JOB,DEPTNO FROM EMP WHERE JOB =?";
   private static final String insertEmployee="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL)VALUES(?,?,?,?)";
   private static final String deleteEmployee="DELETE FROM EMP WHERE EMPNO=?";
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
		map=jt.queryForMap(employeebyNo,no);
		return map;
	}
	@Override
	//Get Employee by Desgs
	public List<Map<String, Object>> getEmployeeByDesgs(String deg) {
	   List<Map<String,Object>> list=null;
		list=jt.queryForList(employeebyDesg,deg);
	   return list;
	}
	@Override
	public int insert(int eno, String ename, String desg, float salary) {
		int count=0;
		count=jt.update(insertEmployee,eno,ename,desg,salary);
		return count;
	}
	@Override
	public int deletebyNo(int no) {
		int count =0;
		count=jt.update(deleteEmployee,no);
		return count;
	}

}
