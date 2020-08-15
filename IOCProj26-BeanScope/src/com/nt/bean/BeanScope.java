package com.nt.bean;

public class BeanScope {
   private int x;
   private int y;
   
public BeanScope() {
	System.out.println("BeanScope-0 param Constructor");
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

@Override
public String toString() {
	return "BeanScope [x=" + x + ", y=" + y + "]";
}

   
}
