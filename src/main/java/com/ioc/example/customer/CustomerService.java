package com.ioc.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {
	
    CustomerBL customerBL;
    
	@Autowired
	@Qualifier("two")
    public void setCustomerBL(DataAccess dataAccess) {
        customerBL = new CustomerBL(dataAccess);
    }

    public String GetCustomerName(int id) {
        return customerBL.GetCustomerName(id);
    }

}

class CustomerService_property_injection {
	@Autowired
    CustomerBL _customerBL;

    public CustomerService_property_injection() {
        _customerBL = new CustomerBL();
        _customerBL.dataAccess = new DataAccessImpl();
    }

    public String GetCustomerName(int id) {
        return _customerBL.GetCustomerName(id);
    }
}
