package com.invoicegenerator;

public class Rides {
	public double distance;
	public double time;

	/**
	 * Constructor
	 * 
	 * @param distance - Distance traveled by cab
	 * @param time     - time taken for ride
	 */
	public Rides(double distance, double time) {
		this.distance = distance;
		this.time = time;
	}

	/**
	 * Getter and Setter methods
	 */
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

}