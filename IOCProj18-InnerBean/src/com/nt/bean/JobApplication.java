package com.nt.bean;

import java.util.Random;

public class JobApplication {
   
    public int jobidno() {
    	return new Random().nextInt(10000);
    }
}
