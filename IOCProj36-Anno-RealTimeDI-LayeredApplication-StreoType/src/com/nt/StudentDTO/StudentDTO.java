package com.nt.StudentDTO;

import java.io.Serializable;

public class StudentDTO implements Serializable {
private String studentName;
private String studentAdds;
private float mark1,mark2,mark3;

//Generating setter and getter

public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAdds() {
	return studentAdds;
}
public void setStudentAdds(String studentAdds) {
	this.studentAdds = studentAdds;
}
public float getMark1() {
	return mark1;
}
public void setMark1(float mark1) {
	this.mark1 = mark1;
}
public float getMark2() {
	return mark2;
}
public void setMark2(float mark2) {
	this.mark2 = mark2;
}
public float getMark3() {
	return mark3;
}
public void setMark3(float mark3) {
	this.mark3 = mark3;
}
}
