package com.blupplup.bank.Daos;

import com.blupplup.bank.models.Account;

import java.util.List;

public interface AccountDao {

    List<Account> getAllAccountList();
}
