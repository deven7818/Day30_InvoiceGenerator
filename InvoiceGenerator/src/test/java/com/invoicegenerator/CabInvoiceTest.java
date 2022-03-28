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
	 * Check fare as: (4*10)+4 = 44
	 */
	@Test
	public void testGenerateInvoice() {
		Assert.assertEquals(44, invoice.generateInvoice(new Rides(4, 4)), 0.0);
	}

	/**
	 * Fare = (0.4*10)+1 = 3 which is less than 5. Should give fare = 5
	 */
	@Test
	public void testGenerateInvoiceGetMin() {
		Assert.assertEquals(5, invoice.generateInvoice(new Rides(0.4, 1)), 0.0);
	}

	/**
	 * multiple rides: Ride 1 - 3 km and 5 minutes. Ride 2 - 0.4 kms and 2 minute.
	 * Should return total fare = 41
	 */
	@Test
	public void whenGivenMultipleRidesShouldReturnTotalFare() {
		Rides[] rides = { new Rides(3, 5), new Rides(0.4, 2) };
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double totalFare = invoiceGenerator.calculateTotalFare(rides);
		System.out.println("Total Fare = " + totalFare);
		Assert.assertEquals(41, totalFare, 0.0);
	}
}
