package com.blupplup.bank.daos.Impl;

import com.blupplup.bank.daos.CustomerDao;
import com.blupplup.bank.models.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
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
