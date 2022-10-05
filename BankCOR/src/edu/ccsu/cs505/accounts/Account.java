package edu.ccsu.cs505.accounts;
import edu.ccsu.cs505.insufficientfunds.*;

/**
 * The helper handler in the COR design pattern. 
 * 
 * @author Joseph Tanasi 
 */
public abstract class Account 
{
	protected double balance;
	protected String name;
	
	
	protected Account nextAccount = null;  
	protected Account nodeHead = null;
	
	
	/**
	 * 
	 * @param The representation of the amount deducted from the account.
	 * @throws InsufficientFundsException when the total amount available 
	 * across all accounts is insufficient. 
	 */
	abstract public void deduct(double amount) throws InsufficientFundsException;
	
	/**
	 * 
	 * @return balance returns the accounts balance 
	 */
	public double getBalance(){
		return balance;
	}
	
	/**
	 * 
	 * @return nextAccount allows access to the next Account Object in the COR.
	 */
	public Account getNext(){
		return this.nextAccount;
	}
	
	/**
	 * Allows us to chain Account objects together in the COR
	 * 
	 * @param nextAccount passes the next Account Object that we want to chain together. 
	 */
	public void getNextAccount(Account nextAccount){
		this.nextAccount = nextAccount;
	}
	

}
