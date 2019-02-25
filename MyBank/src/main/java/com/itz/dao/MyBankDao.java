package com.itz.dao;

import java.util.List;

import com.itz.model.MyBank;

public interface MyBankDao {
	
	public void addMyBank(MyBank myBank);
	
	public List<MyBank> getAllCustomers();
	
}
