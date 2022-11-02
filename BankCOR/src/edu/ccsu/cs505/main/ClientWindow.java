package edu.ccsu.cs505.main;
import edu.ccsu.cs505.payingparty.Customer;
 

import edu.ccsu.cs505.accounts.SavingsAccount;
import edu.ccsu.cs505.accounts.CreditAccount;

/**
 * This class demonstrates a COR pattern. 
 * 
 * @author josephtanasi10
 *
 */
public class ClientWindow {

	public static void main(String[] args){
		
		Customer customer1 = new Customer("Joseph Tanasi" ,"040-95-2342",
				"03/20/1993", 200.0);

		SavingsAccount savings = new SavingsAccount(50);
		CreditAccount credit = new CreditAccount(50);
		CreditAccount credit2 = new CreditAccount(50);
		CreditAccount credit3 = new CreditAccount(50);

		System.out.println(customer1);
		System.out.println();
	
		customer1.addAccount(savings);
	
	    customer1.addAccount(credit);
		customer1.addAccount(credit2);
		customer1.addAccount(credit3);
		
		customer1.pay(150);
		customer1.pay(220);
	    customer1.pay(5000);
		customer1.displayAccounts();
                
	}

}
