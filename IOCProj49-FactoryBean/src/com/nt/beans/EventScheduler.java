package com.nt.beans;

import java.time.LocalDate;

public class EventScheduler {
private LocalDate date;

public EventScheduler(LocalDate date) {
	System.out.println("EventScheduler 0 param Constructor");
	this.date = date;
}
	//B.method 
	public String getSchedule() {
		LocalDate sysdate =null;
	    //intial with java8 date
		sysdate=LocalDate.now();
		if(sysdate.equals(date)) {
			return "Reaminder about walk-in";
		}
			else {
		return "no reminder stay home and continue reading";
			}
	}
}

