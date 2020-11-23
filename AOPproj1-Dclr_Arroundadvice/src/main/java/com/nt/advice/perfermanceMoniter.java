package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class perfermanceMoniter implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("perfermanceMoniter.invoke()");
		long startTime=System.currentTimeMillis();//pre logic
		Object retval=invocation.proceed();//invoke the target method
		long endTime=System.currentTimeMillis();//post logic
		//Getting details of Target class method details
		System.out.println(invocation.getMethod()+" with args "+Arrays.toString(invocation.getArguments()));
		System.out.println("Timetaken for Execution is::"+(endTime-startTime));
		return retval;
	}//invoke(-)
}//class

//MethodInvocation invocation=it hold target class method details