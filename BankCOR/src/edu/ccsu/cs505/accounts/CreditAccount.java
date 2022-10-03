package edu.ccsu.cs505.accounts;

import java.text.NumberFormat;


public class CreditAccount extends Account
{

	
	private double creditLimit;
	
	public CreditAccount(double creditLimit)
	{
		
		this.creditLimit = creditLimit;
		balance = 0;
		
	
	}

	public void Charge(double newAmount)
	{
		balance += newAmount;
		
		if(balance > creditLimit)
		{
			System.out.println("Insufficient funds.");
			balance -= newAmount; // 
		}
	}
	 
	@Override
	public void deduct(double amount)
	{
		
	}
	
	public String toString()
	{
		String result = ""; 
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		result += "Credit Card Balance: " + fmt.format(balance);
		result +=  " Credit Limit: " + fmt.format(creditLimit);
		fmt.format(creditLimit);
		
		
		
		return result;
	}

}
