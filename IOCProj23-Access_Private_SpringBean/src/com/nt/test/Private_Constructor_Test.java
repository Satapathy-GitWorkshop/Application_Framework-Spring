package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.beans.Private_Constructor;

public class Private_Constructor_Test {

	public static void main(String[] args) {
	 Class cls=null; 
	 Constructor cons[]=null;
	 Private_Constructor pc1=null,pc2=null;
	 
	
	 try {
		//Load the Given Class
		 cls=Class.forName("com.nt.beans.Private_Constructor");
       //get access the private Constructor
		 cons=cls.getDeclaredConstructors();
	  //Set the permission for private Constructor
		 cons[0].setAccessible(true);
	  //Create the Object
		 pc1=(Private_Constructor)cons[0].newInstance();
		 System.out.println(pc1);
	    System.out.println("-----------------");
	  //Set the permission for private Constructor
		 cons[1].setAccessible(true);
	  //Create the Object
		 pc1=(Private_Constructor)cons[1].newInstance(14,12); 
         System.out.println(pc2);
	}
	 catch(ClassNotFoundException ce) {
		 ce.printStackTrace();
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }

}//main(-)
}//class
