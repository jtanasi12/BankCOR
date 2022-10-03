package edu.ccsu.cs505.accounts;
import edu.ccsu.cs505.payingparty.Customer;

public class BankAccount extends Account
{

	
	public BankAccount(double balance)
	{
		this.balance  = balance;
		
		
	}
	
     public void deduct(double amount)
	{
		
		
	}
     
     public void makeDeposit(double amount)
     {
    	 balance += amount;
     }
     public double getBalanace()
     {
    	 return balance;
     }

   

}
