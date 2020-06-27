package com.blupplup.bank.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "account_type")
public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double interestRate;
    private Double minBalance;
    private Double withdrawLimit;
    private Integer AllowedTransactionsPerMonth;
    private long maturityDate;

    @OneToMany(mappedBy = "accountType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Account> accounts;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(Double minBalance) {
        this.minBalance = minBalance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getAllowedTransactionsPerMonth() {
        return AllowedTransactionsPerMonth;
    }

    public void setAllowedTransactionsPerMonth(Integer allowedTransactionsPerMonth) {
        AllowedTransactionsPerMonth = allowedTransactionsPerMonth;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public long getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(long maturityDate) {
        this.maturityDate = maturityDate;
    }
}
