package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBo;

@Repository
public class StudentDAOimpl implements StudentDAO{
	private static final String getStudentbyNo="select * from student where addrs=?"; 
    @Autowired
	private JdbcTemplate jt;
    
	@Override
	public List<StudentBo> fetchStudetByaddrs(String addrs) {
	//use Template Object
		List<StudentBo>listbo=new ArrayList<StudentBo>();
		jt.query(getStudentbyNo,new StudentaHandler(listbo), addrs);
		return listbo;
	}
//nested inner class
	private static class StudentaHandler implements RowCallbackHandler{
		 private List<StudentBo>listbo;
	public StudentaHandler(List<StudentBo> listbo) {
			this.listbo = listbo;
		}
	@Override
	public void processRow(ResultSet rs) throws SQLException {
		StudentBo bo= new  StudentBo();
		//convert rs object into int list bo
	   bo.setNo(rs.getInt(1));
	   bo.setName(rs.getString(2));
	   bo.setAddress(rs.getString(3));
	   listbo.add(bo);	
	}//processRow
		
	}//innerclass
}//class
