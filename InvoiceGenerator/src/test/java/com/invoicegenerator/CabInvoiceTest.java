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
}
