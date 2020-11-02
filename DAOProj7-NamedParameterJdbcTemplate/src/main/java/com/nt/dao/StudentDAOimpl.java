package com.nt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("studentdao")
public class StudentDAOimpl implements StudentDAO {
  public static final String getStudent_byNo="SELECT NAME FROM STUDENT WHERE NO=:no";
  public static final String getStudent_byaddrs="SELECT NO,NAME,ADDRS FROM STUDENT WHERE ADDRS=:adds";
  public static final String save_Student="INSERT INTO STUDENT(NO,NAME,ADDRS) VALUES(:No,:name,:addrs)";

  @Autowired
 private NamedParameterJdbcTemplate temp;

  @Override
public String fetchStudentbyNo(int no) {
	  //create map Object
	  Map<String,Object>map=new HashMap<String, Object>();
	  map.put("no",no);
	  Map<String,Object>parammap=new HashMap<String, Object>();
	  //  parammap=Map.of("no",no);   java 9 feature
	//get named parameter Object
	  String name=temp.queryForObject(getStudent_byNo, map, String.class);
	return name;
}

@Override
public List<StudentBO> fetchStudentbyAddsrs(String addrs) {
	//Create MapSqlParamater Source obj
	MapSqlParameterSource  source=new MapSqlParameterSource();
	source.addValue("adds",addrs);
	//create listObject
	List<StudentBO>listbo=temp.query(getStudent_byaddrs, source, 
			 rs->{
				 //this one is ResultSetExtractor
             	List<StudentBO> listBO1=new ArrayList();
             	while(rs.next()) {
             		StudentBO bo= new StudentBO();
             		  bo.setNo(rs.getInt(1));
             		  bo.setName(rs.getString(2));
             		  bo.setAddrs(rs.getString(3));
             		   listBO1.add(bo);
             	   }//while
             	return listBO1;
             	});
	  
	return listbo;
}

@Override
public int StoreStudent(StudentBO bo) {

	//create BeanPropertySqlParameterSource object
	BeanPropertySqlParameterSource bpsps=new BeanPropertySqlParameterSource(bo);
	int count=temp.update(save_Student, bpsps);
	return count;
}
}
	

