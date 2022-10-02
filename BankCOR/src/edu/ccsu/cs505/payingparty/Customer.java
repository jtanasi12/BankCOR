package edu.ccsu.cs505.payingparty;
import edu.ccsu.cs505.accounts.Account;
import edu.ccsu.cs505.accounts.CheckingAccount;
import java.util.ArrayList;


public class Customer implements PayingParty
{
	protected String name;
	protected String socialSecurityNumber;
	protected String birthDate;

	//protected CheckingAccount newChecking;
	protected ArrayList<Account> accounts = new ArrayList<>();

	
	public Customer(String name, String socialSecurityNumber, 
			String birthDate)
	{
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDate = birthDate;
		
		
		// Create a default Checking Account
		accounts.add(new CheckingAccount(this));
		

	}
	
	public void addAccount(Account newAccount)
	{
		
	}
	@Override
	public void pay(double amount)
	{
		
		// NEW COMMENT
	}


	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		String result = "First Name: " + name;
		result += "\tSocial Security Number: " + socialSecurityNumber;
		result += "\tBirthdate: " + birthDate;
		
		return result;
	}
}