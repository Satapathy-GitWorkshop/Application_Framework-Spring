package com.nt.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18n_Test {
public static void main(String[] args) {
	Locale locale=null;
	ResourceBundle bundle=null;
	//create locale Object having country and language
	locale=new Locale(args[0],args[1]);
	//Create ResourceBoundle object having locale Object and base properties file
    bundle= ResourceBundle.getBundle("com/nt/properties/App", locale);
    //Read and dispaly the value
    System.out.println(bundle.getString("btn1.cap")+" "+bundle.getString("btn2.cap")+" "+bundle.getString("btn3.cap")+" "+bundle.getString("btn4.cap"));
} 
}
