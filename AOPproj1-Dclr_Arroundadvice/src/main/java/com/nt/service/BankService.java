package com.nt.service;

public class BankService {
   public float calculateSimpleInterest(float pAmt,float rate,float time) {
	  System.out.println("BankService.calculateSimpleInterest()");
	   return pAmt*rate*time/100.0f; 
   }
}
