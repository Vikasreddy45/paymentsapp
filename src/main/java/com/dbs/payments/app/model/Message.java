package com.dbs.payments.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	private String messageCode;
	private String instruction;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}

}
