package com.itz.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itz.model.MyBank;

@Repository
public class MyBankDaoImpl implements MyBankDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void addMyBank(MyBank myBank) {
		sessionFactory.getCurrentSession().saveOrUpdate(myBank);
	}// addEmployee


	@SuppressWarnings("unchecked")
	@Transactional
	public List<MyBank> getAllCustomers(){
		Query query= sessionFactory.getCurrentSession().createQuery("from MyBank ");
		return query.getResultList();
	}
}// class
