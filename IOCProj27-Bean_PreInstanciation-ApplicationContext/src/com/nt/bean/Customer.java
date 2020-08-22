package com.nt.bean;

public class Customer {
private Resturant res;
public Customer(Resturant res) {
	System.out.println("Resturant 1 param Constructor");
	this.res = res;
}
static {
	System.out.println("Resturant static block");
}
//Busines method
public void placeOrder() {
	System.out.println("Lets have biriyani today !!!"); 
     res.foodDeliver();
}
}
