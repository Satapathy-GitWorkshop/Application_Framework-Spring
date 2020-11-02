package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBo;

public interface StudentDAO {
	public List<StudentBo>fetchStudetByaddrs(String addrs);
}
