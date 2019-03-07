package com.capgemini.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Wallet {
	
	@Column(name="balance")
	private BigDecimal balance;

	
	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wallet(BigDecimal balance) {
		super();
		this.balance = balance;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	
	
	
}
