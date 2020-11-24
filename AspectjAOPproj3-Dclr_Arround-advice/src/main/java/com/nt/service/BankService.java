package com.nt.service;

public class BankService {//Traget class with primary logic
   public float calculateSimpleinterest(float pamt,float rate,float time) {
	    System.out.println("BankService.calculateSimpleinterest()");
	   return pamt*rate*time/100.0f;   
   }
}
