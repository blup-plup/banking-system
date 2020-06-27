package com.blupplup.bank.services.Impl;

import com.blupplup.bank.daos.CustomerDao;
import com.blupplup.bank.models.Customer;
import com.blupplup.bank.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }
}
