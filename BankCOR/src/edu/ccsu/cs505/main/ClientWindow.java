package edu.ccsu.cs505.main;
import edu.ccsu.cs505.payingparty.Customer;
import edu.ccsu.cs505.accounts.SavingsAccount;
import edu.ccsu.cs505.accounts.CreditAccount;

public class ClientWindow {

	public static void main(String[] args)
	{
		Customer customer1 = new Customer("Joseph Tanasi" ,"040-95-2342",
				"03/20/1993", 200.0);
		
		
		System.out.println(customer1);
		
		
		SavingsAccount savingsAccount = new SavingsAccount(50);
		CreditAccount  creditAccount  = new CreditAccount(50);
		CreditAccount  creditAccount2  = new CreditAccount(50);
		CreditAccount  creditAccount3  = new CreditAccount(50);
		
		customer1.addAccount(savingsAccount);
		customer1.addAccount(creditAccount);
		customer1.addAccount(creditAccount2);
		customer1.addAccount(creditAccount3);
			
		
		creditAccount3.Charge(45);
		creditAccount3.Charge(15);
		
		customer1.displayAccounts();

	
	}

}
