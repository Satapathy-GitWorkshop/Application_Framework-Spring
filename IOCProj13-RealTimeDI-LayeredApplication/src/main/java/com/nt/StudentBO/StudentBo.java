package com.nt.StudentBO;

public class StudentBo {
	private String studentName;
	private String studentAdds;
	private float totalMark;
	private float avgMark;
	private String result;
	
//Generating Setter and getter	
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
	public float getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(float totalMark) {
		this.totalMark = totalMark;
	}
	public float getAvgMark() {
		return avgMark;
	}
	public void setAvgMark(float avgMark) {
		this.avgMark = avgMark;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	

}
