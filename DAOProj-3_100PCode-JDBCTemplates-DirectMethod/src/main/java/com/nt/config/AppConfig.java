package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ServiceConfig.class,PersistanceConfig.class})//to add multiple cfg class 
public class AppConfig {

}
