package com.nt.service;

public class BankService implements IBankService {
   public float calculateSimpleInterest(float pAmt,float rate,float time) {
	  System.out.println("BankService.calculateSimpleInterest()");
	   return pAmt*rate*time/100.0f; 
   }
}
