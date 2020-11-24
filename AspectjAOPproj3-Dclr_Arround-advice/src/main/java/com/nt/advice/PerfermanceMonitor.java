package com.nt.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerfermanceMonitor {
   public Object monitor(ProceedingJoinPoint joinPoint)throws Throwable{//fixed signature
	       long startTime=System.currentTimeMillis();//prelogic
	       Object retval=joinPoint.proceed();//calling target class method
	       long endTime=System.currentTimeMillis();//postlogic
	      //getting target class method details with time
	       System.out.println(joinPoint.getSignature().getName()+" with args "+Arrays.toString(joinPoint.getArgs())
	       +"  has taken time= "+(endTime- startTime)+" sec");   
	   return retval;
	   
   }
}
