package com.bms.model;

import com.bms.constants.PaymentType;

public class PaymentRequest {

	private Double amount;
	private PaymentType type;
	public PaymentRequest(Double amount, PaymentType type) {
		super();
		this.amount = amount;
		this.type = type;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public PaymentType getType() {
		return type;
	}
	public void setType(PaymentType type) {
		this.type = type;
	}
	
}
