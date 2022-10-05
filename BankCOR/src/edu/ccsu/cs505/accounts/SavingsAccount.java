package edu.ccsu.cs505.accounts;
import java.text.NumberFormat;

/**
 * 
 * This class is a savings account that extends from BankAccount
 * 
 * @author josephtanasi10
 *
 */
public class SavingsAccount extends BankAccount
{
	/**
	 * Constructs a savings account.
	 *  
	 * @param balance
	 */
	public SavingsAccount(double balance){
		
		super( balance);
		name = "Savings";
	}

	@Override
	public String toString(){
		
		String result; 
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		result = "Savings: " + fmt.format(balance);
		 
		return result;
	}
}
