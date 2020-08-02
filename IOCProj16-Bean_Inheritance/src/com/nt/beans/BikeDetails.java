package com.nt.beans;

public class BikeDetails {
    private String company;
	private String modelname;
    private String color;
    private String no;
    private int capacity;
    private int milese;
    
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public void setColor(String color) {
		this.color = color;
	
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setMilese(int milese) {
		this.milese = milese;
	}
	

@Override
public String toString() {
	return "BikeDetails [company=" + company + ", modelname=" + modelname + ", color=" + color + ", no=" + no
			+ ", capacity=" + capacity + ", milese=" + milese + "]";
}
}
