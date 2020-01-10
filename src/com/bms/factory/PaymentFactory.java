package com.bms.factory;

import com.bms.constants.PaymentType;
import com.bms.model.PaymentRequest;
import com.bms.model.iface.PaymentMethod;
import com.bms.model.impl.UPI;

public class PaymentFactory {
	
	public static PaymentMethod getPaymentMethod(PaymentRequest request) {
		if(request.getType()== PaymentType.UPI)
			return new UPI();
		return new UPI();
	}

}
