package com.blupplup.bank.Daos.Impl;

import com.blupplup.bank.Daos.AccountDao;
import com.blupplup.bank.models.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    SessionFactory sessionFactory;


    @Override
    public List<Account> getAllAccountList() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery<Account> criteriaQuery = criteriaBuilder.createQuery(Account.class);
        List<Account> accounts = session.createQuery(criteriaQuery).getResultList();

        return accounts;
    }
}
