package com.nt.service;
import org.springframework.stereotype.Service;

@Service("service")
public class BankService {
   public float calculateSimpleInterest(float pAmt,float rate,float time) {
	  System.out.println("BankService.calculateSimpleInterest()");
	   return pAmt*rate*time/100.0f; 
   }
}
