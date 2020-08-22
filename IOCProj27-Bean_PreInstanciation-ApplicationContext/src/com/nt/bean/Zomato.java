package com.nt.bean;

public class Zomato implements Resturant {
public Zomato() {
	System.out.println(" zomato O-param Constructor");
}
static {
	System.out.println("zomato static block");
}
	@Override
	public void foodDeliver() {
	System.out.println("Food is being deliver by Zomato");
	}

}
