package com.invoicegenerator;

public class Rides {
	public double distance;
	public double time;
	public boolean isPremium;

	/**
	 * Constructor
	 * 
	 * @param distance - Distance traveled by cab
	 * @param time     - time taken for ride
	 * @param isPremium - fare for premium ride
	 */
	public Rides(double distance, double time, boolean isPremium) {
		this.distance = distance;
		this.time = time;
		this.isPremium = isPremium;
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

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

}