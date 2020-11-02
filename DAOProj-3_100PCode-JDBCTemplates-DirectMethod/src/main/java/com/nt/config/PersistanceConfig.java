package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource(value = "com/nt/commons/jdbc.properties")//to link properties file
@ComponentScan(basePackages = "com.nt.dao")//to link annotated DAO class 
public class PersistanceConfig { 
@Autowired
Environment env;//to hold property file relted stuff	
    
     @Bean(value = "hkds")
     public DataSource createds() {
    	HikariDataSource hkds=null;
    	//Crete Object for Hikari Data Source
    	 hkds=new HikariDataSource();
    	//Setting value to Hikari 
    	 hkds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
    	 hkds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
    	 hkds.setUsername(env.getRequiredProperty("jdbc.user"));
    	 hkds.setPassword(env.getRequiredProperty("jdbc.pwd"));
		return hkds; 
     }
	
   @Bean(value="jt")
   public JdbcTemplate createTemplates() {
	      JdbcTemplate jt=null;
	      jt=new JdbcTemplate(createds());     
	      return jt;
   }
	
}
