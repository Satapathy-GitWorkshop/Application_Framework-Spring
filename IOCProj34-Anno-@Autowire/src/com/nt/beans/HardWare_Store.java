package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;


public class HardWare_Store {
@Autowired
//@Qualifier("nikamal")//With bean Id
//@Qualifier(value = "ank")//With qualifier tag given Value
 private Plastic_Factory factory=null;
 
 public void Selling_product() {
System.out.println("Iam having different type of Company Product");
System.out.println("if you are looking for ::"+factory.product("DiningSet"));
   factory.production();
  
 }
}
