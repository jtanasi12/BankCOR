package edu.ccsu.cs505.insufficientfunds;

/**
 * 
 * This class is used when we throw an InsufficientFundsExcpetion 
 * 
 * This class extends Exception and is used in the COR pattern and is thrown when 
 * the total amount across all accounts is insufficient.
 * 
 * @author josephtanasi10
 *
 */
public class InsufficientFundsException extends Exception 
{
	private static final long serialVersionUID = 1L;

	/**
	 * Calls the super constructor from Exception.
	 * 
	 * @param message is passed into the super constructor for Exception
	 */
	public InsufficientFundsException (String message){
		
		super(message);
	}
}
