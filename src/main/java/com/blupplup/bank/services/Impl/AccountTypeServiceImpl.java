package com.blupplup.bank.services.Impl;

import com.blupplup.bank.daos.AccountTypeDao;
import com.blupplup.bank.models.AccountType;
import com.blupplup.bank.services.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountTypeServiceImpl implements AccountTypeService {

    @Autowired
    AccountTypeDao accountTypeDao;

    @Override
    public List<AccountType> getAllAccountTypes() {
        return accountTypeDao.getAllAccountTypes();
    }
}
