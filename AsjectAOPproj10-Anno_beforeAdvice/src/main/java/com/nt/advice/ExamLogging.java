package com.nt.advice;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component("logaspect")
@Aspect
public class ExamLogging {
//method with fixed signature
	@Before("execution(java.lang.String com.nt.service.ExamHall.*(..))")
	public void checkingId(JoinPoint jp)throws Throwable {
		//getting target method args
		Object arg[]=jp.getArgs();
		//create filewriter as Output Straem
		FileWriter writer= new FileWriter("E:/examlog.txt",true);
		writer.write(arg[2]+" will take care of Checking process");
		writer.flush();
		writer.close();
	}
	

/*public void checkingId(String paper,String name,String guide)throws Throwable{
		    //create filewriter as Output Straem
				FileWriter writer= new FileWriter("E:/examlog.txt",true);
				writer.write(guide+" will take care of Checking process");
				writer.flush();
				writer.close();
	}*/
}
