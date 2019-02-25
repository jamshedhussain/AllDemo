package com.itz.service;

import java.util.List;

import com.itz.model.MyBank;

public interface MyBankService {

	public void addMyBank(MyBank myBank);
	
	public List<MyBank> getAllCustomers();
	
}
