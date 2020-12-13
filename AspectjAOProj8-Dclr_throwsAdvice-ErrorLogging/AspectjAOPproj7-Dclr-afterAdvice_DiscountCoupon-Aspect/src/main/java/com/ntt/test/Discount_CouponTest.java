package com.ntt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IShoppingMall;

public class Discount_CouponTest {

	public static void main(String[] args) {
		//create IOC Container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//getting proxy class Onject
		IShoppingMall proxy= ctx.getBean("shoppingstore",IShoppingMall.class);
		//caling target class b.method
		System.out.println(proxy.shopping(new String[] {"paint","shirt","Shoes"},
				            new float[] {3000.0f,2000.0f,5000.0f}));
		//close conatiner
		((AbstractApplicationContext) ctx).close();
	}

}
