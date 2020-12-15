package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankMgmtServiceimpl;
import com.nt.service.IBankMgmtService;

public class GlobalTxMgmr_Test {

	public static void main(String[] args) {
//create IOC conatiner
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get proxy Object
		IBankMgmtService service=ctx.getBean("bankService",BankMgmtServiceimpl.class);
		//callling b.method of targetClass
		try {
				System.out.println(service.transferMoney(101,400,300));
		}
		catch (Exception e) {
		e.printStackTrace();
		}
//close container
		((AbstractApplicationContext) ctx).close();

	}//main(-)
}//class
