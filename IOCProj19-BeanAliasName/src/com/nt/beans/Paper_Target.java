package com.nt.beans;

public class Paper_Target {
	private Pen_Dependent pen;

	public Paper_Target(Pen_Dependent pen) {
				this.pen = pen;
	}
public String Task(String task) {
	return "hey you !!  "+pen.writting()+" "+task;
}
}
