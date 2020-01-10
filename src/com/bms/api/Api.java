package com.bms.api;

import com.bms.exception.BookClashException;
import com.bms.exception.GateAwayUnavilableException;
import com.bms.factory.CinemaFactory;
import com.bms.factory.PaymentFactory;
import com.bms.model.Cinema;
import com.bms.model.PaymentRequest;
import com.bms.model.Seat;
import com.bms.model.iface.PaymentMethod;

public class Api {
	public static Cinema getSeats(Cinema c1) {
		return CinemaFactory.getCinema(c1);
	}

	public static boolean bookSeat(Cinema c, Seat seat, PaymentRequest paymentRequestObj) {
		try {
			return book(c, seat, paymentRequestObj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return false;
		}
	}

	private static boolean book(Cinema c, Seat seat, PaymentRequest paymentRequest) throws Exception {
		synchronized (c) {
			PaymentMethod paymentMethod = PaymentFactory.getPaymentMethod(paymentRequest);
			try {
				if(c.getLayout().isEmpty(seat.getRow(),seat.getRol()))
				{
					if (paymentMethod.makePayment(paymentRequest)) {
						c.getLayout().book(seat.getRol(), seat.getRow());
						return true;
					}
					else
					{
						throw new GateAwayUnavilableException();
					}
				}
				else
				{
					throw new BookClashException();
				}
			} catch (Exception e) {
				return false;
			}
		}
	}
}
