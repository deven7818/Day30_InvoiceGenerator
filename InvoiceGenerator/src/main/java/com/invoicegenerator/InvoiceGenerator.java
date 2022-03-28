package com.invoicegenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * PROCEDURE
 * 
 * 1. Calculate fare - given distance and time , the invoice generator should return the total fare for the journey. 
 * 2. Multiple rides - take multiple rides and calculate aggregate for that 
 * 3. Enhanced invoice - get total number of rides , total fare , average fare per ride
 * 4. Invoice Generator - Invoice service gets the list of rides from RideRepository and return ride invoice
 */
public class InvoiceGenerator {
	public static void main(String[] args) {
		System.out.println("Welcome to cab invoice generator");
	}

	/**
	 * Method to calculate fare Using formula = 10 * distance + ride time If fare is
	 * less than 5, fare set to 5.
	 * 
	 * @param ride - ride with distance and time values
	 * @return - fare, if less than 5 fare = 5
	 */
	public double generateInvoice(Rides ride) {
		double fare = 10 * ride.distance + ride.time;

		return fare > 5 ? fare : 5;
	}

	/**
	 * Method to calculate total fare from multiple rides for every element, called
	 * generateInvoice method and returned fare added to total fare
	 * 
	 * @param rides - array of rides
	 * @return - Invoice for ride
	 */
	public Invoice calculateTotalFare(Rides[] rides) {
		double totalFare = 0;
		for (Rides ride : rides) {
			totalFare += this.generateInvoice(ride);
		}
		return new Invoice(rides.length, totalFare, totalFare / rides.length);
	}

	/**
	 * Method to get number of rides
	 * 
	 * @param rides - array of rides
	 * @return - length of array
	 */
	public int getNumberOfRides(Rides[] rides) {
		return rides.length;
	}

	/**
	 * Method to calculate average ride fare
	 * 
	 * @param rides - array of rides
	 * @return - length of array
	 */
	public double getAvarageRideFare(Rides[] rides) {
		return calculateTotalFare(rides).totalFare / rides.length;
	}

	public Invoice generateInvoice(int i, HashMap<Integer, Rides[]> rideRepository) {
		for (Map.Entry<Integer, Rides[]> rideEntry : rideRepository.entrySet()) {
			if (rideEntry.getKey() == i)
				return calculateTotalFare(rideEntry.getValue());
		}
		return null;
	}

}
