package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariDataSource;

//Linkng all Annotated Spring Bean
@ComponentScan(basePackages = "com.nt")
@Configuration
public class AppConfig {
//create Datasoure Object
	@Bean
	public DataSource createHkds() {
		//create HikariDs Object
		HikariDataSource hkds= new HikariDataSource();
		//Adding property to datasource
		  hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		  hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		  hkds.setUsername("system");
		  hkds.setPassword("9658");
		  hkds.setMinimumIdle(10);
		return hkds ;
	}
	//create Jdbc Template Object
	@Bean
	public JdbcTemplate createjt() {
		return new JdbcTemplate(createHkds());
	}
//Creating TxMgmr  Object by injecting DataSoure
	@Autowired
	private DataSource ds;
	public DataSourceTransactionManager createMgmr() {
		return new DataSourceTransactionManager(ds);
	}
	
}
