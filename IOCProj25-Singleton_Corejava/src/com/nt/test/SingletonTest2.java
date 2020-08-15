package com.nt.test;

import com.nt.file.Pen2;

public class SingletonTest2 {

	public static void main(String[] args) {
		   Pen2 p1=null,p2=null;
		   
		   p1=Pen2.INSTANCE;
		   p2=Pen2.INSTANCE;
		   System.out.println(p1.hashCode()+"  "+p2.hashCode());
		   System.out.println("(p1==p2?)"+(p1==p2));
		   p1.printData("hello1");
		   p2.printData("hello2");
		   Pen2.INSTANCE.printData("hello3");
		   System.out.println(Pen2.INSTANCE.hashCode()+"  "+Pen2.INSTANCE.getClass());
		   

	}

}
