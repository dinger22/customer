package com.ioc.example.customer;

import org.springframework.stereotype.Component;

public class CustomerBLImpl implements CustomerBL {

    DataAccess dataAccess;

    public CustomerBLImpl(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public String GetCustomerName(int id) {
        return dataAccess.GetCustomerName(id);
    }
}

class CustomerBLImplTwo implements CustomerBL {

    DataAccess dataAccess;

    public CustomerBLImplTwo(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public String GetCustomerName(int id) {
        return dataAccess.GetCustomerName(id);
    }
}
//




interface DataAccess {
    String GetCustomerName(int id);
}

class DataAccessImpl implements DataAccess// would be a new file in real app
{
    public DataAccessImpl() {
    }

    public String GetCustomerName(int id) {
        return "One"; // get it from DB in real app
    }
}

class DataAccessImplTwo implements DataAccess// would be a new file in real app
{
    public DataAccessImplTwo() {
    }

    public String GetCustomerName(int id) {
        return "Two"; // get it from DB in real app
    }
}
