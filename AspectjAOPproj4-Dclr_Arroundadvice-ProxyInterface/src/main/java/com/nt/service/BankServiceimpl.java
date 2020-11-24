package com.nt.service;

public final class BankServiceimpl implements IBankService {

	@Override
	public float calculateSimpleInterest(float pamt, float rate, float time) {
		System.out.println("BankServiceimpl.calculateSimpleInterest()");
		System.out.println(getClass().getSuperclass());
		return pamt*rate*time/100.0f;
	}

}
