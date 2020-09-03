package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("kotak")
@Primary  //same as primary=true in xml configuration
public class KotakMahindra implements Bank {

	@Override
	public void deposite() {
		System.out.println("Money Deposite by using KotakMahindra");	
	}

	@Override
	public void withdraw() {
		System.out.println("Money WithDraw by using KotakMahindra");
	}
}
