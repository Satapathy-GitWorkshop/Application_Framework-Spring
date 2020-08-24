package com.nt.beans;

import java.util.Date;

public class Chef {
private String name;
private Date jdate;
public Chef(String name, Date jdate) {
	this.name = name;
	this.jdate = jdate;
}
@Override
public String toString() {
	return "Chef [name=" + name + ", jdate=" + jdate + "]";
}

}
