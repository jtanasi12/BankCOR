package edu.ccsu.cs505.accounts;

public abstract class Account 
{
	protected Account nextAccount; // Pointer to the next account
	abstract public void deduct(double amount);
}
