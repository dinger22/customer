package com.ioc.example.customer;

public class CustomerBL
{
    DataAccess _dataAccess;

    public CustomerBL()
    {
        _dataAccess = new DataAccess();
    }

    public String GetCustomerName(int id)
    {
        return _dataAccess.GetCustomerName(id);
    }
}

class DataAccess //would be a new file in real app
{
    public DataAccess()
    {
        
    }

    public String GetCustomerName(int id) {
        return "Dummy Customer Name"; // get it from DB in real app
    }
}