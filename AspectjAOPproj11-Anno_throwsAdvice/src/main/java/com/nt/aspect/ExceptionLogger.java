package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component("exlogger")//making Spring bean class
@Aspect//making as Aspect class
public class ExceptionLogger {
//Throws advice with fixed signature
	@AfterThrowing(pointcut = "execution(float com.nt.service.ShoppingStoreimpl.calculatebills(..))",throwing = "ex" )
	public void exceptionLogging(JoinPoint jp,Exception ex){
		System.out.println(ex+ "exception is raied in "+jp.getSignature()+" with args "+
			Arrays.deepToString(jp.getArgs())	);
	}
}
