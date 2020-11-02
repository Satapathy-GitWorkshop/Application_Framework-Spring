package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;
import com.nt.callback.RowMapper_impl;

public class Student_daoimpl implements Student_dao {
   private static final String getEmployee_byNo="SELECT * FROM STUDENT WHERE NO=?"; 
	private JdbcTemplate jt;
	public Student_daoimpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public StudentBO getEmployeebyNo(int no) {
		//calling jdbc template Overloaded method
		StudentBO bo=jt.queryForObject(getEmployee_byNo, new RowMapper_impl(),107);
		//1st parameter==Sql quey
		//2nd parameter= Callback(i)implementation class which return BO
		return bo;
	}//method
}//class
