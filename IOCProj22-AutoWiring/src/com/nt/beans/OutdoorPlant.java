package com.nt.beans;

public class OutdoorPlant implements Plant {

	@Override
	public String homeDecor() {
		return "OutdoorPlant not recomended for decoration";
	}

	@Override
	public String gardening() {
		
		return "Put it in garden under direct Sunlight";
	}

}
