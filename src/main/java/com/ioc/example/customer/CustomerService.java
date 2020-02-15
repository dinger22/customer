package com.ioc.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

	@Autowired
	@Qualifier("serviceOne")
    CustomerBL customerBL;

    public String GetCustomerName(int id) {
        return customerBL.GetCustomerName(id);
    }

}
