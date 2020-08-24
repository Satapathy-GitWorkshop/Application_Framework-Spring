package com.nt.beans;

import java.util.Date;

public class Resturant {
	private String name;
	private String owner;
	private String location;
	private Date odate;
	private Chef chef;

	public void setName(String name) {
		this.name = name;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setOdate(Date odate) {
		this.odate = odate;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	@Override
	public String toString() {
		return "Resturant [name=" + name + ", owner=" + owner + ", location=" + location + ", odate=" + odate
				+ ", chef=" + chef + "]";
	}
	
}
