package com.nt.beans;

public class Nursery_Constructor {
	private OutdoorPlant outdoor;

public void setOutdoor(OutdoorPlant outdoor) {
		this.outdoor = outdoor;
	}

public Plant getOutdoor() {
		return outdoor;
	}

public void sellingPlant() {
	System.out.println("Welcome to Green Enviroment Nursery");
	System.out.println("what You nedd ???");
	System.out.println("Iam Looking for both IndoorPalnt & OutdoorPlant !!!");
	String s1=outdoor.homeDecor();
	String s2=outdoor.gardening();
	System.out.println(s1);
	System.out.println(s2);
}

}
