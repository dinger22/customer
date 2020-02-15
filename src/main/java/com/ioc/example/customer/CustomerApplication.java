package com.ioc.example.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(CustomerApplication.class, args);
		CustomerService customerService = applicationContext.getBean(CustomerService.class);
		System.out.println(customerService.GetCustomerName(1)); 
	}

}
