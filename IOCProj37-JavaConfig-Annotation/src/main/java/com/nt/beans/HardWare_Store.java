package com.nt.beans;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Named("store") //To configure as java bean 
public class HardWare_Store {
@Inject   //same as @Autowired (for Injection)
@Named("ankur")// To solve ambiguity error
 private Plastic_Factory factory=null;
 
 public void Selling_product() {
System.out.println("Iam having different type of Company Product");
System.out.println("if you are looking for ::"+factory.product("DiningSet"));
   factory.production();
  
 }
}
