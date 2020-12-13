package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class ExceptionLogger {
//Throws advice with fixed signature
	public void exceptionLogging(JoinPoint jp,Exception ex){
		System.out.println(ex+ "exception is raied in "+jp.getSignature()+" with args "+
			Arrays.deepToString(jp.getArgs())	);
	}
}
