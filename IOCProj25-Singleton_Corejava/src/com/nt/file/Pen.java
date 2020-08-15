package com.nt.file;

public class Pen {
	private static Pen INSTANCE;
	//Declar private Constructor
	private Pen(){
		//no body
	}
	//Factory method
	public static Pen getInstance() {
		if(INSTANCE==null) 
			INSTANCE= new Pen();
         return INSTANCE;
	}
	//Business Method
	public static void paper(String msg)
	{
		System.out.println("I am Writting some"+msg);
	}

}
