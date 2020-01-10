package com.bms.model.iface;

import com.bms.exception.GateAwayUnavilableException;
import com.bms.model.PaymentRequest;

public interface PaymentMethod {

	boolean makePayment(PaymentRequest request) ;
}
