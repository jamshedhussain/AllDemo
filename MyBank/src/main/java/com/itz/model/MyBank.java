package com.itz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyBank")
public class MyBank {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String address;
	
	@Column
	private int accountNo;
	

	
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	

	// toString
	@Override
	public String toString() {
		return "MyBank [id=" + id + ", name=" + name + ",address="+address+",accountNo="+accountNo+"]";
	}

}
