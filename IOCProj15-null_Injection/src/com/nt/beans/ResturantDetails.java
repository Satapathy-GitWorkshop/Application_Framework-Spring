package com.nt.beans;

import java.util.Date;

public class ResturantDetails {
	private String rname;
	private String ownername;
	private String loaction;
	private Date timing;
	
	public void setRname(String rname) {
		this.rname = rname;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}
	public void setTiming(Date timing) {
		this.timing = timing;
	}
	
	@Override
	public String toString() {
		return "ResturantDetails [rname=" + rname + ", ownername=" + ownername + ", loaction=" + loaction + ", timing="
				+ timing + "]";
	}
	

}
