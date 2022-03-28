package com.invoicegenerator;

public class Invoice {

	public int rideCount;
	public double totalFare;
	public double averageFare;
	
	/**
	 * Parameterized constructor
	 * @param rideCount - number of rides
	 * @param totalFare - total fare
	 * @param averageFare - average fare = total fare / number of rides
	 */
	public Invoice(int rideCount, double totalFare, double averageFare) {
		this.rideCount = rideCount;
		this.totalFare = totalFare;
		this.averageFare = averageFare;
	}
	
	/**
	 * Override equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Invoice invoice = (Invoice) obj;
		return Double.doubleToLongBits(averageFare) == Double.doubleToLongBits(invoice.averageFare)
				&& rideCount == invoice.rideCount
				&& Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(invoice.totalFare);
	}
	
}
