package com.nt.callback;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.nt.bo.StudentBO;

public class RowMapper_impl implements org.springframework.jdbc.core.RowMapper<StudentBO>{

	@Override
	public StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		//get StudentBO Object through Composition
		StudentBO bo=null;
		bo= new StudentBO();
		//setting value to Bo class Objeect
		bo.setSno(rs.getInt(1));
		bo.setSname(rs.getString(2));
		bo.setSadd(rs.getString(3));
		//retunning bo type Object as Speicified in Interface Args
		return bo;
	}

}
