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

@Repository("studentdao")
public class StudentDAOimpl1  implements StudentDAO{
	@Autowired
   private JdbcTemplate jt;
private static final String getStudentbyAdds="select * from student where addrs=?";
	
	@Override
	public List<StudentBo> fetchStudent(String addrs) {
		System.out.println("StudentDAOimpl1.fetchStudent() with AnonymousInnerclass");
		List<StudentBo> listbo=null;
		//calling jdbc class Object
		listbo=jt.query(getStudentbyAdds,
				        new ResultSetExtractor<List<StudentBo>>() {

			@Override
			public List<StudentBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
				  List<StudentBo>listbo=null;
				  listbo= new ArrayList<StudentBo>();
				  StudentBo bo = new StudentBo();
				  //get Result from result Object
				  while(rs.next()) {
					  bo.setNo(rs.getInt(1));
						bo.setName(rs.getString(2));
						bo.setAddress(rs.getString(3)); 
						//adding value to listbo
						listbo.add(bo);
				  }
				return listbo;
			}//extractData
			}, //Anonymous  innerClass
		  addrs);
		return listbo ;
	}//fetchStudent
}//class
