package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("water")
@Lazy
public class Water_Dependent {

	
	 Water_Dependent(){
		 System.out.println("Water:O param Constructor");
	 }
	public void water() {
		System.out.println("Lunch is too hot need water");
	}
	
}
