package com.dbs.payments.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency {
	
	@Id
	private String currencyCode;
	private String currencyName;
	private double conversionRate;
	public Currency() {
		// TODO Auto-generated constructor stub
	}

}
