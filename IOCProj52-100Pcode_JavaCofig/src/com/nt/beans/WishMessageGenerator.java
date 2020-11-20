package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
    @Autowired   
	private LocalDateTime date;
    
    public String generateWishMessage(String user) {
        int hour=0;
        //get Currenthour of the Day
        hour=date.getHour();
          if(hour<12) {
        	  return "GoodMorning  "+user;
          }
          else if(hour<16) {
        	  return "Good AfterNoon  "+user;
          }
          else if(hour<20) {
        	  return "GoodEvening  "+user;
          }
          else {
    	return "GoodNight  "+user;
    }
   }//method
}//class
