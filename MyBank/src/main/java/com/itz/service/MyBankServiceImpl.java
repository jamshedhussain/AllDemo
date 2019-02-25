package com.itz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itz.dao.MyBankDao;
import com.itz.model.MyBank;

@Service
public class MyBankServiceImpl implements MyBankService {

	@Autowired
	private MyBankDao myBankDao;
	
	
	public void addMyBank(MyBank myBank) {
		myBankDao.addMyBank(myBank);	
	}//addEmployee

	public List<MyBank> getAllCustomers(){
		return myBankDao.getAllCustomers();
	}//getAllCustomers
	
}//class
