package edu.ccsu.cs505.main;
import edu.ccsu.cs505.payingparty.Customer;

public class ClientWindow {

	public static void main(String[] args)
	{
		Customer customer1 = new Customer("Joseph Tanasi" ,"040-95-2342",
				"03/20/1993");
		
		System.out.println(customer1);
	}

}
