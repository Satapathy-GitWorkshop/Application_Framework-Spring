package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration   //make this work like ApplicationContextfile
@ComponentScan(basePackages ="com.nt.beans")//alternate <context:componet-scan> tag
public class AppConfig {

	  @Bean(name = "dt") //cofigure for Predefine class only
	public LocalDateTime getSystemTime() {
		System.out.println("AppConfig.getSystemTime()");
		return LocalDateTime.now();//static factory method returning its own class object
	}
	
}
