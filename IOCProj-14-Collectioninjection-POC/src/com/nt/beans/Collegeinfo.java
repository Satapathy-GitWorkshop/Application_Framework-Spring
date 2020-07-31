package com.nt.beans;

import java.util.Date;
import java.util.List;

public class Collegeinfo {
	private List<String>name;
	private List<Date>datelist;
	@Override
	public String toString() {
		return "Collegeinfo [name=" + name + ", datelist=" + datelist + "]";
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public void setDatelist(List<Date> datelist) {
		this.datelist = datelist;
	}

}
