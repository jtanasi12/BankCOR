package edu.ccsu.cs505.accounts;
import java.text.NumberFormat; 

/**
 * 
 * This class is an extension of BankAccount. 
 * 
 * @author josephtanasi10
 *
 */

public class CheckingAccount extends BankAccount
{
	
	/**
	 * Constructs a checking account for the bank.
	 * 
	 * Checking account can only be instantiated in the Customer class.
	 *  
	 * @param initBalance
	 */
	public CheckingAccount(double initBalance) {
		
		super( initBalance);
		name = "Checking";

	}

	@Override
	public String toString(){
		
		String result; 
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		result = "Checkings: " + fmt.format(balance);
	
		return result;
	}
	
	
}
