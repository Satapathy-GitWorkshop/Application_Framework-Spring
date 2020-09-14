package com.nt.beans;

import javax.inject.Named;

@Named("nikamal")
public class Nikamal implements Plastic_Factory {

	@Override
	public String product(String product) {
		System.out.println("NIKAMAL are only providing homeapplience based product ");
		return "and we are no-1 brand in India";
	}

	@Override
	public void production() {
		System.out.println("If you have Interest we are ready to surve You!!!!");

	}

}
