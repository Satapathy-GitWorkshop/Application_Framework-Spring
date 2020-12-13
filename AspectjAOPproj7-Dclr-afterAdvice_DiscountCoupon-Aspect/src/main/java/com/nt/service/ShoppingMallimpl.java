package com.nt.service;

import java.util.Arrays;

public class ShoppingMallimpl implements IShoppingMall {

	@Override
	public float shopping(String[] item, float[] price) {
		  //generating total bill amount
		float billamt=0.0f;
		for(float p:price) {
			billamt=billamt+p;
	     }
		System.out.println("Your item "+Arrays.toString(item)+" is in Cart");
       return billamt;
	}
}

