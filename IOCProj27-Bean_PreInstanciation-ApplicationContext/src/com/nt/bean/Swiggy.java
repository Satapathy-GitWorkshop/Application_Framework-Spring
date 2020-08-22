package com.nt.bean;

public class Swiggy implements Resturant {
public Swiggy() {
	System.out.println("Swiggy 0 param Constructor");
}
static {
	System.out.println("Swiggy static block");
}
	@Override
	public void foodDeliver() {
       System.out.println("Food is being delivered by swiggy");
	}

}
