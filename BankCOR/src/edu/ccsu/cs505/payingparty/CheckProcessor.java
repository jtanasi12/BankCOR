package edu.ccsu.cs505.payingparty;
import  edu.ccsu.cs505.accounts.BankAccount;
import  edu.ccsu.cs505.insufficientfunds.*;

/**
 * This class is used to process a check from the bank.
 *  
 * @author josephtanasi10
 *
 */
 abstract public class CheckProcessor 
{
	 /**
	  * 
	  * @param headAccount is the first Account in the chain which is a Checking Account.
	  * @param amount
	  * @return true if the check process or false if we pass an InsufficientFundsException.
	  */
	 static public boolean processCheck(BankAccount headAccount, double amount){
		 try
		 {
			 headAccount.deduct(amount);
		 }
		 catch(InsufficientFundsException e)
		 {
			 System.out.println(e.getMessage());
		 }
		
		return true;
	}
	
}
