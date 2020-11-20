package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class LoanManagement_MethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Calculating compond interest");
		float pamnt=0.0f;
		float rate=0.0f;
		float time=0.0f;
		//Get TargetClass method argument
		pamnt=(float)args[0];
		rate=(float) args[1];
		time=(float) args[2];
		//write new logic for existing  target class b.method
		
		
		return (float)(pamnt*Math.pow(1+rate/100,time))-pamnt;
	}

}
