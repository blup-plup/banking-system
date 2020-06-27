package com.blupplup.bank.Daos.Impl;

import com.blupplup.bank.Daos.CustomerDao;
import com.blupplup.bank.models.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {


    @Autowired
    SessionFactory sessionFactory;


    @Override
    public List<Customer> getAllCustomers() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);

        return session.createQuery(criteriaQuery).getResultList();
    }
}
