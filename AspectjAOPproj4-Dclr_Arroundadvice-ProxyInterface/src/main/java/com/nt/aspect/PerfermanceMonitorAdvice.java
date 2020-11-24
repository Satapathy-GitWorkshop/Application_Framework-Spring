package com.nt.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerfermanceMonitorAdvice {
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
