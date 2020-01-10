package com.bms.model.impl;

import com.bms.model.PaymentRequest;
import com.bms.model.iface.PaymentMethod;

public class UPI implements PaymentMethod {

	@Override
	public boolean makePayment(PaymentRequest request) {
		return true;
	}

}
