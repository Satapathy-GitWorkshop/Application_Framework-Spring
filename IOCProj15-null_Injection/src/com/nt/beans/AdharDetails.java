 package com.nt.beans;

import java.util.Date;

public class AdharDetails {
private String name;
private String adds;
private long adharno;
private Date dob;

public AdharDetails(String name, String adds, long adharno, Date dob) {
	this.name = name;
	this.adds = adds;
	this.adharno = adharno;
	this.dob = dob;
}
public String toString() {
	return "AdharDetails [name=" + name + ", adds=" + adds + ", adharno=" + adharno + ", dob=" + dob + "]";
}

}
