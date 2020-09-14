package com.nt.beans;

import java.util.Date;

public class VottingEligibility {
 private String name;
 private String adds;
 private int age;
 private Date registration;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdds() {
	return adds;
}
public void setAdds(String adds) {
	this.adds = adds;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Date getRegistration() {
	return registration;
}
public void setRegistration(Date registration) {
	this.registration = registration;
}


@Override
public String toString() {
	return "VottingEligibility [name=" + name + ", adds=" + adds + ", age=" + age + ", registration=" + registration
			+ "]";
}
//Life cycle method
public void myInit() {

	registration= new Date();//initializing left over property.
	boolean flag=false;

	if(age<0) {
		age=age*-1;// correction the injected value(BeanPost Processing)		
	}
	
	if(name==null) {
		System.out.println("Name can't be null  !!!"); // validation logic
		flag=true;
	}
	if(age>100) {
		System.out.println("Age must be between 18-99");//validation Logic 
		flag=true;
	}
	
	if(flag) {
		throw new IllegalArgumentException("Check the Entered value");
	}
}//myinit()
 
public void myDestroy() {
	//CleanUp Activity
	name=null;
	adds=null;
	
}//myDestroy()

}
