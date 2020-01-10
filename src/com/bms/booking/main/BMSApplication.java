package com.bms.booking.main;

import com.bms.factory.CinemaFactory;
import com.bms.model.Cinema;

public class BMSApplication {
	public static void main(String[] args) {
		Cinema c1= new Cinema(1, 3,2);
		Cinema c2= new Cinema(2, 3,2);
		CinemaFactory.createCinema(c1);
		CinemaFactory.createCinema(c1);
		CinemaFactory.getCinema(c1);
	}
	
}
