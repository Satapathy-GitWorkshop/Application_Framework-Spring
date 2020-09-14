package com.nt.beans;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Named("store") //configure as java Bean
public class HardWare_Store {
@Resource(name  = "nikamal") //To do injection and solve ambiguity problem
 private Plastic_Factory factory=null;
 
 public void Selling_product() {
System.out.println("Iam having different type of Company Product");
System.out.println("if you are looking for ::"+factory.product("DiningSet"));
   factory.production();
  
 }
}
