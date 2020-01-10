package com.bms.factory;

import java.util.HashMap;
import java.util.Map;

import com.bms.model.Cinema;

public class CinemaFactory {
	static Map<Integer,Cinema> cinemaMap = new HashMap<>();
	
	public static void createCinema(Cinema cinema) {
		cinemaMap.put(cinema.getCinemaId(), cinema);
	}
	public static Cinema getCinema(Cinema cinema) {
		return cinemaMap.get(cinema.getCinemaId());
	}
}
