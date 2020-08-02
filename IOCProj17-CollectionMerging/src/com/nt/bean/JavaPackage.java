package com.nt.bean;

import java.util.Set;

public class JavaPackage {
	private Set <String> course;

//Setter method
	
	@Override
	public String toString() {
		return "JavaPackage [course=" + course + "]";
	}

	public void setCourse(Set<String> course) {
		this.course = course;
	}

}
