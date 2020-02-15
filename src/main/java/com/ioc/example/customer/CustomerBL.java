package com.ioc.example.customer;

public class CustomerBL {

    public CustomerBL() {

    }

    public String GetCustomerName(int id) {
        // SOLID 里的D，Dependency Inversion Principle
        DataAccess _dataAccess = DataAccessFactory.GetDataAccess();
        return _dataAccess.GetCustomerName(id);
    }
}

interface DataAccess {
    String GetCustomerName(int id);
}

class DataAccessImpl implements DataAccess// would be a new file in real app
{
    public DataAccessImpl() {
    }

    public String GetCustomerName(int id) {
        return "Dummy Customer Name"; // get it from DB in real app
    }
}

class DataAccessFactory {
    public static DataAccess GetDataAccess() {
        return new DataAccessImpl();
    }
}