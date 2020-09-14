package com.nt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.DAO.StudentDAO;
import com.nt.DAO.StudentDAO_Impl;
import com.nt.StudentBO.StudentBo;
import com.nt.StudentDTO.StudentDTO;

@Component("service")
public final class StudentService_Impl implements StudentService {
	@Autowired
	@Qualifier("studentdao")
	private StudentDAO dao;
	

	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		float total=0.0f;
		float avg=0.0f;
		String result=null;
		int count=0;
//use business logic to calculate total & avarage
		total=dto.getMark1()+dto.getMark2()+dto.getMark3();
		avg=total/0.3f;
	if(avg<35)	
		result="fail";
	else 
		result="pass";
//Setting values to bo Object
	StudentBo bo=new StudentBo();
	bo.setStudentName(dto.getStudentName());
	bo.setStudentAdds(dto.getStudentAdds());
	bo.setTotalMark(total);
	bo.setAvgMark(avg);
	bo.setResult(result);
//calling DAO class method having bo object
	count =dao.insert(bo);
	if(count==0)
		return "Registratation Faild"+result;
	else
	return "Registratation Successed"+result;
	
	}
}