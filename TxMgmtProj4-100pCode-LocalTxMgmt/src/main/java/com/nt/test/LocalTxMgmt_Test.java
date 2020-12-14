package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankServiceMgmtimpl;

public class LocalTxMgmt_Test {

	public static void main(String[] args) {
//Create Ioc Container
	AnnotationConfigApplicationContext ctx=  new AnnotationConfigApplicationContext(AppConfig.class);
//getting target class Object
		BankServiceMgmtimpl service=ctx.getBean("bankservice", BankServiceMgmtimpl.class);
//calling b.method of target class
		try {
			if(service.transferMoney(101,102,100))
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
