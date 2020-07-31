package com.nt.Controller;

import com.nt.Service.StudentService;
import com.nt.StudentDTO.StudentDTO;
import com.nt.StudentVO.StudentVO;

public class StudentController {
	private StudentService service ;

	public StudentController(StudentService service) {
		this.service = service;
	}
	public String getResult(StudentVO vo)throws Exception {
		String result =null;
		//Covert Vo object to dto Object
 StudentDTO dto= new StudentDTO();
 dto.setStudentName(vo.getStudentName());
 dto.setStudentAdds(vo.getStudentAdds());
 dto.setMark1(Float.parseFloat(vo.getMark1()));
 dto.setMark2(Float.parseFloat(vo.getMark2()));
 dto.setMark3(Float.parseFloat(vo.getMark3()));
 //calling service class method having dto object
 result=service.generateResult(dto);	
	return result;

}
}
