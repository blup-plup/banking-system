package com.blupplup.bank.Daos;

import com.blupplup.bank.models.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> getAllCustomers();
}
