package edu.ccsu.cs505.payingparty;
import edu.ccsu.cs505.accounts.Account;
import edu.ccsu.cs505.accounts.CheckingAccount;
import edu.ccsu.cs505.accounts.BankAccount;
 
/**
 * 
 * This class represents a customer who can open up banking and credit accounts.
 * 
 * A Customer is allowed to add accounts in a specific order that the COR pattern uses. 
 * 
 * 
 * @author Joseph Tanasi 
 *
 */

public class Customer implements PayingParty
{
	protected String name;
	protected String socialSecurityNumber;
	protected String birthDate;
	Account account;
	
	Account headAccount = null;
	 
	/**
	 * Customer constructor a checking account is created for every new customer.
	 * 
	 * @param name 
	 * @param socialSecurityNumber
	 * @param birthDate
	 * @param initialBalance gets passed into a CheckingAccount
	 */
	public Customer(String name, String socialSecurityNumber, 
			String birthDate, double initialBalance){
		
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDate = birthDate;
		
		
		account = new CheckingAccount(initialBalance);
		
		// A pointer that keeps track of the beginning of the chain of Account Objects.
		headAccount = account;
	}

	/**
	 * 
	 * Returns the first account object in the chain which is a checking account by default.
	 * 
	 */
	public void head(){
		
		System.out.println(headAccount);
	}

	/**
	 * Allows the customer to open a new Account. 
	 * 
	 * @param newAccount gets attached to the previous accounts pointer.
	 * This allows us to chain the accounts together.
	 * 
	 */
	public void addAccount(Account newAccount){
		
		account.getNextAccount(newAccount);
		account = newAccount;
	}	
	
	/**
	 * Iterate through the chain of account objects and displays them to the screen.
	 */
	public void displayAccounts(){
		
		Account temp = headAccount;
		
		while(temp != null)
		{
		System.out.println(temp); 
		temp = temp.getNext();
		}
		
	}
	
	/**
	 * Calls the CheckProcessor to initialize a payment.
	 * The first account (which is a checking account) gets passed into CheckProcessors processCheck method.
	 * 
	 * @param amount
	 */
	@Override
	public void pay( double amount){
		
		CheckProcessor.processCheck((BankAccount)headAccount, amount);

	}
		
	@Override
	public String toString(){
		String result = "Name: " + name;
		result += "\tSocial Security Number: " + socialSecurityNumber;
		result += "\tBirthdate: " + birthDate;
		
		return result;
	}
}