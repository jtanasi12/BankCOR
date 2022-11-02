package edu.ccsu.cs505.accounts;
import java.text.NumberFormat;
import edu.ccsu.cs505.insufficientfunds.*;

/**
 * 
 * This class deducts the max amount of each account in the chain until the amount is satisfied.
 * 
 * @author Joseph Tanasi
 */

public class CreditAccount extends Account
{
	private double creditLimit;
	private static double MAX;
	
	/**
	 * Constructor for a credit card account
	 * 
	 * @param creditLimit
	 */
	public CreditAccount(double creditLimit)
	{
		this.creditLimit = creditLimit;
		balance = 0;
		MAX = creditLimit;
		
		name = "Credit Account";
 	}
	
	/**
	 * This method adds the passed amount to the balance owed.
	 * 
	 * @throws InsufficientFundsException is thrown when amount is beyond credit limit.
	 * 
	 * The BankAccount doesn't use the COR method when exception is thrown
	 * @param newAmount
	 */
	public void Charge(double newAmount){
		 
		double originalBalance = balance;
		
		balance += newAmount;
		
		try
		{
			
		if(balance > creditLimit)
			 throw new InsufficientFundsException("Insufficient Funds!");
		}
		
		catch(InsufficientFundsException e)
		{
			balance = originalBalance;
			System.out.println(e.getMessage());
		}
	}
	 
	/**
	 * 
	 * This class deducts the max amount of each account in the chain until the amount is satisfied.
	 * 
	 * @throws InsufficientFundsException when the total amount available 
	 * across all accounts is insufficient. 
	 * @param amount
	 */
	@Override
	public void deduct(double amount)  throws InsufficientFundsException{
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
  	    double originalBalance = balance;
		
		if(amount < (creditLimit) - balance)
			balance += amount;
		else
		{
			double remaining = (creditLimit - balance);
			remaining = (amount-remaining);
			
			 
			try
			{
			if(nextAccount == null)
				throw new InsufficientFundsException("Insufficient Funds!");
				
			balance = MAX;
			nextAccount.deduct(remaining);

			}
			
			catch(InsufficientFundsException e){	
				
		    balance = originalBalance;
 		    	throw new InsufficientFundsException("Insufficient Funds!");
			}
		}
	}
	
	@Override
	public String toString(){
		
		String result = ""; 
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		result += "Credit Card Balance: " + fmt.format(balance);
		result +=  " Credit Limit: " + fmt.format(creditLimit);
		fmt.format(creditLimit);

		return result;
	}
}
