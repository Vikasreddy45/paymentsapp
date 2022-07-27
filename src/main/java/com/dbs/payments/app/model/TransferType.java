package com.dbs.payments.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransferType {

	@Id
	private String transferTypeCode;
	private String transferTypeDescription;
	
	public TransferType() {
		// TODO Auto-generated constructor stub
	}

}
