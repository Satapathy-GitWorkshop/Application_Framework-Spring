package com.nt.service;

import org.springframework.stereotype.Service;

@Service("exservice")
public class ExamHall {
    public String givingExam(String paper,String name,String guide) {
    	if(name.equalsIgnoreCase("saurav"))
    		return name+" you will be guided by "+guide;
    	else
    		return "Who are You?";
    }
}
