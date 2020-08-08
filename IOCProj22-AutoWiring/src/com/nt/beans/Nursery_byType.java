package com.nt.beans;

public class Nursery_byType {
	private Plant outdoor;



public void setOutdoor(Plant outdoor) {
		this.outdoor = outdoor;
	}



public Nursery_byType() {
	
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
