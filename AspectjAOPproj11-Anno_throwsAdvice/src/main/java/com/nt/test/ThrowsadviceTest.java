package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ShoppingStoreimpl;

public class ThrowsadviceTest {
public static void main(String[] args) {
   ApplicationContext ctx= null;
   //create IOC Container
      ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
      //get target class Object
      ShoppingStoreimpl proxy=ctx.getBean("service",ShoppingStoreimpl.class);
      //calling b.method
      System.out.println("Your Bill is::: "
    		  +
    		  proxy.calculatebills(new String[] {"shirt","paint","belt"},new float[] {0f,3000f,500f}));
}
}
