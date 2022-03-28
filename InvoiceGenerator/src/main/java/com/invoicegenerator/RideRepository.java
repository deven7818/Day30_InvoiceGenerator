package com.invoicegenerator;

import java.util.HashMap;

public class RideRepository {

	HashMap<Integer, Rides[]> rideRepository = new HashMap<Integer, Rides[]>();

	public HashMap<Integer, Rides[]> getRideRepository() {
		return rideRepository;
	}
}
