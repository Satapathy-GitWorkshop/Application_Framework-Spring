package com.nt.vo;

import java.io.Serializable;

public class EmployeeVO implements Serializable{
private Integer empno;
private String ename;
private String job;
private Float sal;
//Setter and Getter method
public Integer getEmpno() {
	return empno;
}
public void setEmpno(Integer empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public Float getSal() {
	return sal;
}
public void setSal(Float sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "EmployeeBo [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
}
}//class
