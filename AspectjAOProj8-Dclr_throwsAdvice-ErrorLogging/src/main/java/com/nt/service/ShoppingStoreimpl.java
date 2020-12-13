package com.nt.service;

public class ShoppingStoreimpl  {

	
	public float calculatebills(String[] item, float[] price)  {
		// double validation logic 
		boolean flag =false;
		if(item==null||price==null)
			flag=true;
		for(float p:price) {
			if(p<=0.0f)
				flag=true;
		      break;
		}
		if(flag)
			throw new IllegalArgumentException("Check price and Quantity");
		
		//Bill calculating logic
		    float billamt=0.0f;
		    for(float bill:price)
		    	billamt=billamt+bill;	
		      return billamt;
	}

}
