package com.invoicegenerator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for our program We are using the TDD approach here.
 *
 */
public class CabInvoiceTest {
	InvoiceGenerator invoice = new InvoiceGenerator();

	/**
	 * Check fare premium (4*10)+4 = 44 for normal ride
	 */
	@Test
	public void testGenerateInvoiceNormalRide() {
		Assert.assertEquals(44, invoice.generateInvoice(new Rides(4, 4,false)), 0.0);
	}
	
	/**
	 * Check fare for premium 4820 + 2*4 = 88 for premium ride
	 */
	@Test
	public void testGenerateInvoicePremium() {
		Assert.assertEquals(88, invoice.generateInvoice(new Rides(4, 4,true)), 0.0);
	}

	/**
	 * Fare = (0.4*10)+1 = 3 which is less than 5. Should give fare = 5
	 */
	@Test
	public void testGenerateInvoiceGetMinNormalRide() {
		Assert.assertEquals(5, invoice.generateInvoice(new Rides(0.4, 1,false)), 0.0);
	}
	
	/**
	 * fare = 0.4 *20 + 1*2 = 10 which is less than 20 so give fare = 20
	 */
	@Test
	public void testGenerateInvoiceGetMinPremiumRide() {
		Assert.assertEquals(20, invoice.generateInvoice(new Rides(0.4, 1,false)), 0.0);
	}

	/**
	 * multiple rides: Ride 1 - 3 km and 5 minutes. Ride 2 - 0.4 kms and 2 minute.
	 * Should return total fare = 41
	 */
	@Test
	public void whenGivenMultipleRidesShouldReturnTotalFare() {
		Rides[] rides = { new Rides(3, 5,false), new Rides(0.4, 2,false) };
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double totalFare = invoiceGenerator.calculateTotalFare(rides).totalFare;
		System.out.println("Total Fare = " + totalFare);
		Assert.assertEquals(41, totalFare, 0.0);
	}
	
	@Test
	public void whenGivenMultipleRidesShouldReturnTotalFarePremium() {

		Rides[] rides = { new Rides(4, 5, true), new Rides(0.2, 1, true) };
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double totalFare = invoiceGenerator.calculateTotalFare(rides).totalFare;
		Assert.assertEquals(110, totalFare, 0.0);
	}

}
