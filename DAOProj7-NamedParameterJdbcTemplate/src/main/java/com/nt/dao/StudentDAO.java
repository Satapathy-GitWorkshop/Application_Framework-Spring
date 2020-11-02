package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface StudentDAO {
  public String fetchStudentbyNo(int no);
  public List<StudentBO>fetchStudentbyAddsrs(String addrs);
  public int StoreStudent(StudentBO bo);
}
