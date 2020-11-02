package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDTO;

public interface StudentService {
	public String getStudentByno(int no);
	public List<StudentDTO> loadStudentByaddrs(String addrs);
	public String persistStudent(StudentDTO dto);

}
