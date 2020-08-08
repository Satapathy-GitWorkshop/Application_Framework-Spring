package com.nt.beans;

public class Nursery_Normal {
	private Plant plant;

	public Nursery_Normal(Plant plant) {
		super();
		this.plant = plant;
	}
	
public void sellingPlant() {
	System.out.println("Welcome to Green Enviroment Nursery");
	System.out.println("what You nedd ???");
	System.out.println("Iam Looking for both IndoorPalnt & OutdoorPlant !!!");
	String s1=plant.homeDecor();
	String s2=plant.gardening();
	System.out.println(s1);
	System.out.println(s2);
}

}
