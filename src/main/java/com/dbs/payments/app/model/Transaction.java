package com.dbs.payments.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	@OneToOne
	private CustomerAccountDetails customerId;
	@OneToOne
	private Currency currencyCode;
	@OneToOne
	private BankDetails senderbic;
	@OneToOne
	private BankDetails receiverbic;
	private String receiverAccountNumber;
	private String receiverName;
	@OneToOne
	private TransferType transferType;
	@OneToOne
	private Message messageCode;
	private double currencyAmount;
	private double transferFee;
	private double inrAmount;
	private String transferDate;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

}
