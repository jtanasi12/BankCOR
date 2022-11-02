package edu.ccsu.cs505.payingparty;

 /**
  * 
  * Represents a Vendor instead of a customer.
  * 
  * @author Joseph Tanasi
  *
  */

public class Vendor implements PayingParty
{

	/**
	 * Outputs to the screen a vendor has made a payment.
	 */
	 @Override
	public void pay(double amount) 
	{
		System.out.println("Vendor made payment ");
	}

}
