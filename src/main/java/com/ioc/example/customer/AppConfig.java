package com.ioc.example.customer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public DataAccess getDataAccessImplOne() {
		return new DataAccessImpl();
	}
	
	@Bean
	public DataAccess getDataAccessImplTwo() {
		return new DataAccessImplTwo();
	}
	
	@Bean("serviceOne")
	public CustomerBL getBLOne() {
		return new CustomerBLImpl(getDataAccessImplOne());
	}
	
	@Bean("serviceTwo")
	public CustomerBL getBLTwo() {
		return new CustomerBLImpl(getDataAccessImplTwo());
	}

}
