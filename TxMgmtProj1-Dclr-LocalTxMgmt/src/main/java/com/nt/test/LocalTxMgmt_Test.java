package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankServiceMgmtimpl;

public class LocalTxMgmt_Test {

	public static void main(String[] args) {
//Create Ioc Container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
//getting target class Object
		BankServiceMgmtimpl service=ctx.getBean("bankservice", BankServiceMgmtimpl.class);
//calling b.method of target class
		try {
			if(service.transferMoney(101,103,100))
				System.out.println("Money Transfered");
			else
				System.out.println("Problem in Money Transfering");
		}
		catch (Exception e) {
			System.out.println("Money not Transfered");
			e.printStackTrace();
		}
//close Container
		((AbstractApplicationContext) ctx).close();
	}

}
