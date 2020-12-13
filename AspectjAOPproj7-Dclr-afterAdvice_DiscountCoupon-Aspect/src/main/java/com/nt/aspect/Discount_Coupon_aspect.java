package com.nt.aspect;

import java.io.FileWriter;

import org.aopalliance.intercept.Joinpoint;

public class Discount_Coupon_aspect {
//method having fixed signature
	public void coupon(float billamt)throws Throwable{
		//accessing target method retval to generate coupon
		String coupon=null;
//generating coupon		
	if(billamt<5000)
		coupon="Thank you VisitAgain";
	else if (billamt>10000)
		coupon="Congratulation you may get 5%discount on next purchase,Thank You";
	else if(billamt<20000)
		coupon="Congratulation you got $2000 off on toady Shopping,Thank You";
	else
		coupon="You are the lucky customer plesae reedme your gift ";
	//printing the cupon message accroding to the bill
		FileWriter writer =new FileWriter("E:/discount.txt");
		writer.write(coupon);//saving the coupon to specified location
		writer.flush();//clear the stream 
		writer.close();//close the stream
	}//coupon(-)
}//class
