package com.nt.beans;

import java.util.Date;
import java.util.Set;

public class ContactInfo {
	private Set<Long>phno;
	private Set<Date>sdate;
	@Override
	public String toString() {
		return "ContactInfo [phno=" + phno + ", sdate=" + sdate + "]";
	}
	public void setPhno(Set<Long> phno) {
		this.phno = phno;
	}
	public void setSdate(Set<Date> sdate) {
		this.sdate = sdate;
	}

}
