package com.nt.beans;

public class Private_Constructor {
	private int a,b;
	
	public Private_Constructor() {
		System.out.println("Private_Constructor-0 param Constructor");
	}
	private Private_Constructor(int a, int b) {
		System.out.println("Private_Constructor-2 param Constructor");
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
	   
		return "Priavte_Constructor [a=" + a + ", b=" + b + "]";
	}
	//nested class --static inner class
		private static  class DemoBean{   //nested class
		    private int c;
		    private int x,y;
		    private DemoBean(int x,int y) {
		    	System.out.println("Private_Constructor - 2 param constrctor");
		    	this.x=x;
		    	this.y=y;
		    }
		    
			 public DemoBean() {
				System.out.println("TestBean.DemoBean:: 0-param cosntructor");
			}
		    
		    public void setC(int c) {
		    	this.c=c;
		    }

			@Override
			public String toString() {
				return "DemoBean [c=" + c + ", x=" + x + ", y=" + y + "]";
			}
		    
			
		}
}
	


