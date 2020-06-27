package com.blupplup.bank.daos;

import com.blupplup.bank.models.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> getAllCustomers();
}
