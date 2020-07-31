package com.nt.beans;
import java.util.Date;
import java.util.Map;

public class UnivercityInfo {
   private Map<Integer,String>facultydetails;
   private Map<String,Date>joinDate;
public void setFacultydetails(Map<Integer, String> facultydetails) {
	this.facultydetails = facultydetails;
}
public void setJoinDate(Map<String, Date> joinDate) {
	this.joinDate = joinDate;
}
@Override
public String toString() {
	return "UnivercityInfo [facultydetails=" + facultydetails + ", joinDate=" + joinDate + "]";
}
}
