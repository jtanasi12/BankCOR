package edu.ccsu.cs505.accounts;
import edu.ccsu.cs505.payingparty.Customer;

public class BankAccount extends Account
{
	protected Customer customer;
	protected int accountNumber;
	protected double balance;
	
	public BankAccount(Customer customer)
	{
		this.customer = customer; // Pass along customer object, 1 account has 1 customer
	}
	public void addCheckingAccount()
	{
		
	}
	
	public void addSavingAccount()
	{
		
	}
     public void deduct(double amount)
	{
		
		
	}

}
