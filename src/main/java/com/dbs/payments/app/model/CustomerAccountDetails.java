package com.dbs.payments.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accountdetails")
public class CustomerAccountDetails {
	
	@Id
	private String customerid;
	private String accountNumber;
	private String accountHolderName;
	private int overDraft;
	private double clearBalance;
	private String address;
	private String city;
	private String customerType;
	
	
	public CustomerAccountDetails() {
		// TODO Auto-generated constructor stub
	}

}
