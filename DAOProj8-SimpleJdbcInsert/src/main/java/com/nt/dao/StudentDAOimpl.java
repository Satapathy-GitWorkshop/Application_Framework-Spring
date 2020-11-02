package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBo;

@Repository("dao")
public class StudentDAOimpl implements IStudentDAO {
	@Autowired
	private SimpleJdbcInsert insert;

	@Override
	public int registerStudent(StudentBo bo) {
		//prepare map Object having key as columname and values as col value
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("No",bo.getNo());
		map.put("name",bo.getName());
		map.put("addrs",bo.getAddress());
		//Set TableName for dynamic query creation
		insert.setTableName("student");
		//calling execute(-) with map for insertion
		int count=insert.execute(map);
		return count;
	}

}
