package com.nt.beans;

import javax.inject.Named;

@Named("ankur")
public class Ankur implements Plastic_Factory {

	@Override
	public String product(String product) {
	   System.out.println("ANKUR providing various type of Plastic Product");
		return "Our best product is" +product;
	}

	@Override
	public void production() {
		System.out.println("here is the Sample");

	}

}
