package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBo;

public interface StudentDAO {
public List<StudentBo>fetchStudent(String addrs);
}
