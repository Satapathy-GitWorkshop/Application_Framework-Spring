package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Collegeinfo;
import com.nt.beans.ContactInfo;
import com.nt.beans.MarksInfo;
import com.nt.beans.UnivercityInfo;

public class Container {

	public static void main(String[] args) {
         DefaultListableBeanFactory factory=null;
         XmlBeanDefinitionReader reader=null;
         MarksInfo info=null;
         Collegeinfo cinfo=null;
         ContactInfo no=null;
         UnivercityInfo uinfo=null;
         
factory=new DefaultListableBeanFactory();
reader= new XmlBeanDefinitionReader(factory);
reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
info=factory.getBean("mi",MarksInfo.class);
cinfo=factory.getBean("ci",Collegeinfo.class);
no=factory.getBean("contact",ContactInfo.class);   
uinfo=factory.getBean("uinfo",UnivercityInfo.class);
System.out.println(info); 
   System.out.println("-----------------");
   System.out.println(cinfo);
   System.out.println("-----------------");
   System.out.println(no);
   System.out.println("------------------");
   System.out.println(uinfo);
 

	}

}
