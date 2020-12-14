package com.nt.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("aspect")
@Aspect
public class PerfermanceMonitorAdvice {
    @Around("execution(float com.nt.service.BankServiceimpl.calculateSimpleInterest(..))")
	public Object monitor(ProceedingJoinPoint pjp ) throws Throwable{
		//prelogic
    	  long startTime=System.currentTimeMillis();
    	//calling Traget Class method
    	  Object retval=pjp.proceed();
    	//post logic 
    	  long endTime=System.currentTimeMillis();
    //PerfermanceMonitor logic
    	  System.out.println(pjp.getSignature()+" has taken "+(endTime-startTime)+" ms");
           	return retval;
    }
    
}
