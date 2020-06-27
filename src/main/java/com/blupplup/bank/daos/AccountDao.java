package com.blupplup.bank.daos;

import com.blupplup.bank.models.Account;

import java.util.List;

public interface AccountDao {

    List<Account> getAllAccountList();
}
