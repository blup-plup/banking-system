package com.blupplup.bank.services.Impl;

import com.blupplup.bank.daos.AccountDao;
import com.blupplup.bank.models.Account;
import com.blupplup.bank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public List<Account> getAllAccounts() {
        List<Account> accountList = accountDao.getAllAccountList();

        return accountList;
    }
}
