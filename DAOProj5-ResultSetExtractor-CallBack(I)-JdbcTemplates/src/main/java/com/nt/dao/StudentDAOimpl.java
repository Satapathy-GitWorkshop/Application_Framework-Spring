package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBo;

//@Repository("studentdao")
public class StudentDAOimpl  implements StudentDAO{
	@Autowired
   private JdbcTemplate jt;
private static final String getStudentbyAdds="select * from student where addrs=?";
	
	@Override
	public List<StudentBo> fetchStudent(String addrs) {
		List<StudentBo> listbo=null;
		//calling jdbc class Object
		listbo=jt.query(getStudentbyAdds, new Studentcallback(), addrs);
		return listbo ;
	}

	//Nested inner class
	private static class Studentcallback implements ResultSetExtractor<List<StudentBo>>{

	@Override
	public List<StudentBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
	    //Crete List Object
		List<StudentBo>listbo=null;
		StudentBo bo=null;
		listbo=new ArrayList<StudentBo>();
		//create Bo class Object
		bo= new StudentBo();
		//get result from ResultSet Object
		while(rs.next()) {
		bo.setNo(rs.getInt(1));
		bo.setName(rs.getString(2));
		bo.setAddress(rs.getString(3));
		//copying value to list collection
		listbo.add(bo);
		}
		return listbo;
	}
	
}
}//class
