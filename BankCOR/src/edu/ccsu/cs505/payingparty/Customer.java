package edu.ccsu.cs505.payingparty;
import edu.ccsu.cs505.accounts.Account;
import edu.ccsu.cs505.accounts.CheckingAccount;
import edu.ccsu.cs505.accounts.CreditAccount;
import edu.ccsu.cs505.accounts.SavingsAccount;

import java.util.ArrayList;

public class Customer implements PayingParty
{
	protected String name;
	protected String socialSecurityNumber;
	protected String birthDate;

	
	protected ArrayList<Account> accounts = new ArrayList<>();

	
	public Customer(String name, String socialSecurityNumber, 
			String birthDate, double initialBalance)
	{
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDate = birthDate;
		
		accounts.add(new CheckingAccount(initialBalance )); // Default Checking Account
		

	}
	
	public void addAccount(Account newAccount)
	{
		accounts.add(newAccount);
	}
	public void addSavingsAccount(double balance)
	{
		accounts.add(new SavingsAccount( balance ));
	}
	
	public void addCreditAccount(Customer custom, double creditLimit)
	{
		accounts.add(new CreditAccount( creditLimit));
	}
	
	public void displayAccounts()
	{
		//System.out.println(accounts);
		
		for(int i = 0; i < accounts.size(); i++)
		{
			System.out.print(accounts.get(i) + " ");
			
			System.out.println();
		}
		
		
	}
	@Override
	public void pay(double amount)
	{
		
		// NEW COMMENT
	}


	public ArrayList<Account> getList()
	{
		return accounts;
	}
	
	public String toString()
	{
		String result = "Name: " + name;
		result += "\tSocial Security Number: " + socialSecurityNumber;
		result += "\tBirthdate: " + birthDate;
		
		return result;
	}
}