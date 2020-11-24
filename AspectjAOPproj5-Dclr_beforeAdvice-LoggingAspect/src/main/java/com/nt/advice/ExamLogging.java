package com.nt.advice;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;

public class ExamLogging {
//method with fixed signature
/*	public void checkingId(JoinPoint jp)throws Throwable {
		//getting target method args
		Object arg[]=jp.getArgs();
		//create filewriter as Output Straem
		FileWriter writer= new FileWriter("E:/examlog.txt",true);
		writer.write(arg[2]+" will take care of Checking process");
		writer.flush();
		writer.close();*/
	public void checkingId(String paper,String name,String guide)throws Throwable{
		//create filewriter as Output Straem
				FileWriter writer= new FileWriter("E:/examlog.txt",true);
				writer.write(guide+" will take care of Checking process");
				writer.flush();
				writer.close();
	}
}
