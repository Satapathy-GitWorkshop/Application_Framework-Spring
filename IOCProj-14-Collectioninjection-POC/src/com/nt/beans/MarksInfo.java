package com.nt.beans;

import java.util.Arrays;
import java.util.Date;

public class MarksInfo {
 private int mark[];
 private Date dates[];

public void setMark(int[] mark) {
	this.mark = mark;
}

public void setDates(Date[] dates) {
	this.dates = dates;
}

@Override
public String toString() {
	return "MarksInfo [mark=" + Arrays.toString(mark) + ", dates=" + Arrays.toString(dates) + "]";
}
 
}//class
