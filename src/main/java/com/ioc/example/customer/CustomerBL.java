package com.ioc.example.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerBL {

    DataAccess dataAccess;

    public CustomerBL() {

    }

    public CustomerBL(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public String GetCustomerName(int id) {
        return dataAccess.GetCustomerName(id);
    }
}

interface DataAccess {
    String GetCustomerName(int id);
}

@Component
@Qualifier("one")
class DataAccessImpl implements DataAccess// would be a new file in real app
{
    public DataAccessImpl() {
    }

    public String GetCustomerName(int id) {
        return "One"; // get it from DB in real app
    }
}

@Component
@Qualifier("two")
class DataAccessImplTwo implements DataAccess// would be a new file in real app
{
    public DataAccessImplTwo() {
    }

    public String GetCustomerName(int id) {
        return "Two"; // get it from DB in real app
    }
}

// class DataAccessFactory {
// public static DataAccess GetDataAccess() {
// return new DataAccessImpl();
// }
// }