package com.ioc.example.customer;

public class CustomerService {
    CustomerBL _customerBL;

    public CustomerService() {
        _customerBL = new CustomerBL(new DataAccessImpl());
    }

    public String GetCustomerName(int id) {
        return _customerBL.GetCustomerName(id);
    }

}

class CustomerService_property_injection {
    CustomerBL _customerBL;

    public CustomerService_property_injection() {
        _customerBL = new CustomerBL();
        _customerBL._dataAccess = new DataAccessImpl();
    }

    public String GetCustomerName(int id) {
        return _customerBL.GetCustomerName(id);
    }
}
