package com.blupplup.bank.Daos.Impl;

import com.blupplup.bank.Daos.AccountTypeDao;
import com.blupplup.bank.models.AccountType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class AccountTypeDaoImpl implements AccountTypeDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<AccountType> getAllAccountTypes() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery<AccountType> criteriaQuery = criteriaBuilder.createQuery(AccountType.class);

        return session.createQuery(criteriaQuery).getResultList();
    }
}
