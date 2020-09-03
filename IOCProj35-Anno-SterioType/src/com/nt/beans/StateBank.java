package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("state")
public class StateBank implements Bank {

	@Override
	public void deposite() {
		System.out.println("Money Deposite by using StateBank");
	}

	@Override
	public void withdraw() {
		System.out.println("Money WithDraw by using StateBank");
	}
}
