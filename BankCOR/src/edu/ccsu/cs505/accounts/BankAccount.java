package edu.ccsu.cs505.accounts;
import edu.ccsu.cs505.insufficientfunds.*;

import java.text.NumberFormat;


 /**
  * This class keeps track of all the accounts inside of a bank account. 
  * 
  * BankAccount is an extension of the Account class. 
  * 
  * @author josephtanasi10
  */

public class BankAccount extends Account 
{

	/**
	 * This constructs a bank account with a balance that is inputed by the user.
	 * 
	 * @param balance The amount of money the user inputs into the bank account object.
	 */
	public BankAccount(double balance){
		this.balance  = balance;
	}
	
	/**
	 * This class deducts the max amount of each account in the chain until the amount is satisfied.
	 * 
	 * @throws InsufficientFundsException when the total amount available 
	 * across all accounts is insufficient. 
	 * @param amount
	 */
	 @Override
     public void deduct(double amount) throws InsufficientFundsException{

        double originalBalance = balance;
    	    
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
    	  
    	if(amount <= balance)
    	balance -= amount;

    	else
    	{
    	double remaining = (amount - balance);
    	 		
    	try
    	{
    	if(nextAccount == null)
    		throw new InsufficientFundsException("Insufficient Funds!");
    	balance = 0;
    				
    	nextAccount.deduct(remaining);

    	}
    	catch(InsufficientFundsException e){
    				
    	balance = originalBalance;
    	     throw e;
    		}
    	 }	
	}
     
	 /**
	  * This class makes a deposit into the bank account.
	  * @param amount
	  */
     public void makeDeposit(double amount) {
    	 balance += amount;
     }
     
     
     /**
      * @return balance
      */
     public double getBalanace() {
    	 return balance;
     }

   

}
