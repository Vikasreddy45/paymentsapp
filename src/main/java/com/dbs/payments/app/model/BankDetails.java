package com.dbs.payments.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankDetails {

	@Id
	private String bic;
	private String bankName;
	
	public BankDetails() {
		// TODO Auto-generated constructor stub
	}

}
