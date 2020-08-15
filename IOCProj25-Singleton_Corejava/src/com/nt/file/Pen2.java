package com.nt.file;

public enum Pen2 {
    INSTANCE;   //by default enum constants  are  public static  final of Type Enum class
                         // internally public static final Pen INSTANCE=new Printer1();
  //b.method
  public void  printData(String msg) {
	  System.out.println(msg);
  }

}