package com.invoicegenerator;


/**
 * PROCEDURE
 * 
 * 1. Calculate fare - given distance and time , the invoice generator should return the total fare for the journey.
 * 
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
}