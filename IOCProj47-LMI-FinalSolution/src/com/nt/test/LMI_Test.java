package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainers;

public class LMI_Test {
public static void main(String[] args) {
   WebContainers container=null;
   ApplicationContext ctx=null;
   //create conatiner
   ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
   //calling getBean(-) method
   container=ctx.getBean("container",WebContainers.class);
   container.processdata("satpathy");
   
}
}
