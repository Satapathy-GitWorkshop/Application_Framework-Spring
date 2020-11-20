package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.LoanManagement;

public class MethodReplacer_Test {

	public static void main(String[] args) {
	ApplicationContext ctx=null;
	LoanManagement loan=null;
	//create IOC Container
	ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//Calling getBean Method
	loan=ctx.getBean(LoanManagement.class,loan);
	System.out.println(loan.interestCalculate(15000,5,12));

	}

}
