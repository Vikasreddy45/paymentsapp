package com.dbs.payments.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Logger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private CustomerAccountDetails customerId;
	@OneToOne
	private Customer userId;
	@OneToOne 
	private Employee employeeId;
	private String screenName;
	private String action;
	private String ipaddress;
	
	public Logger() {
		// TODO Auto-generated constructor stub
	}

}
