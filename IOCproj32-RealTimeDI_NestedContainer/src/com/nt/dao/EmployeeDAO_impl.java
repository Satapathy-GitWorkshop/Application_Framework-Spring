package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAO_impl implements EmployeeDAO {
	//Declaring the query
		private static final String SELECT_EMP="select empno,ename,job,sal from emp where job in(?,?,?)order by job";
	private DataSource ds;
	public EmployeeDAO_impl(DataSource ds) {
		this.ds = ds;
	}
	@Override
	public List<EmployeeBO> getEmployee(String degs1, String degs2, String degs3) throws Exception {
		Connection  con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<EmployeeBO>listbo=null;
		
		//Get jdbc polled connection
		con=ds.getConnection();
		//Create prepareStatement Object having sql query
		ps=con.prepareStatement(SELECT_EMP);
		//setting values to query parameter
		ps.setString(1,degs1);
		ps.setString(2, degs2);
		ps.setString(3,degs3);
		//Create ResultSet Object and Execute the query
		rs=ps.executeQuery();
		//Storing the data into listBo
		listbo=new ArrayList<EmployeeBO>();
		while(rs.next()) {
			EmployeeBO bo= new EmployeeBO();
			bo.setEmpno(rs.getInt(1));//here rs.getInt() of type simple int will converted
			bo.setEname(rs.getString(2));//into Wrapper Integer by using AutoBoxing Feature 
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getFloat(4));
			//add each iteration bo object to listbo Collection
			listbo.add(bo);
		}
		return listbo;
	}//method
}//class
