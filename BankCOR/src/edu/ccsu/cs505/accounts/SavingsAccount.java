package edu.ccsu.cs505.accounts;

import java.text.NumberFormat;
import edu.ccsu.cs505.payingparty.Customer;

public class SavingsAccount extends BankAccount
{

	public SavingsAccount(double balance)
	{
		super( balance);
		
	}

	
	public String toString()
	{
		String result; 
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		result = "Savings: " + fmt.format(balance);
		

		
		return result;
	}
}
