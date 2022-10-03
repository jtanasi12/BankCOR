package edu.ccsu.cs505.accounts;

import edu.ccsu.cs505.payingparty.Customer;
import java.text.NumberFormat;

public class CheckingAccount extends BankAccount
{
	
	public CheckingAccount(double initBalance) 
	{
		super( initBalance);

	}

	public String toString()
	{
		String result; 
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		result = "Checkings: " + fmt.format(balance);
		
		
		return result;
	}
	
	
}
