package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("pmaspect")
@Aspect
public class perfermanceMoniter  {

	@Around("execution(float com.nt.service.BankService.*(..))")
	public Object invoke(ProceedingJoinPoint jp) throws Throwable {
		
		System.out.println("perfermanceMoniter.invoke()");
		long startTime=System.currentTimeMillis();//pre logic
		Object retval=jp.proceed();//invoke the target method
		long endTime=System.currentTimeMillis();//post logic
		//Getting details of Target class method details
		System.out.println(jp.getSignature()+" with args "+Arrays.deepToString(jp.getArgs()));
		System.out.println("Timetaken for Execution is::"+(endTime-startTime));
		return retval;
	}//invoke(-)
}//class

//MethodInvocation invocation=it hold target class method details