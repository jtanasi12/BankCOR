package edu.ccsu.cs505.accounts;

public abstract class Account 
{
	protected double balance;
	
	protected Account nextAccount; // Pointer to the next account
	abstract public void deduct(double amount);
	
	public double getBalance()
	{
		return balance;
	}
}
