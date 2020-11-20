package com.nt.beans;

public class LoanManagement {

	public LoanManagement() {
	System.out.println("LoanManagement:0 param Constructor");
	}
	public float interestCalculate(float pamt,float rate,float time) {
		System.out.println("Calculating simple Interest");
		return pamt*rate*time/100;
	}
}
