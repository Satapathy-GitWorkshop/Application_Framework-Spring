package com.nt.test;

import com.nt.file.Pen;

public class SingletonTest {

	public static void main(String[] args) {
		// getting the Object of Pen Class Object
		Pen p2=null;
		Pen p1=null;
		p1=Pen.getInstance();
		p2=Pen.getInstance();
		//Checking How many Object are Created
		System.out.println(p1.hashCode()+"  "+p2.hashCode());
		   System.out.println("(p1==p2?)"+(p1==p2));
		   
		   p1.paper("oracle");
		   p2.paper("java");
     
	}

}
