package factorymethod;

import java.util.Scanner;

class Customer
{
	private int id;
	private String name;
	private double bill;
	
	public Customer(int id, String name, double bill)
	{
		super();
		this.id = id;
		this.name = name;
		this.bill = bill;
	}

	@Override
	public String toString() 
	{
		return "Customer [id=" + id + ", name=" + name + ", bill=" + bill + "]";
	}
	
	
	public static Customer getCustomer() //static factory method
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id :- ");
		int cid = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Customer Name :- ");
		String name = sc.nextLine();
		
		System.out.println("Enter Customer Bill :- ");
		double bill = Double.parseDouble(sc.nextLine());
		
		Customer c1 = new Customer (cid, name, bill);
		return c1;
		
		
	}
	
}

public class CustomerDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("How many Customer object :");
		int noOfObj = sc.nextInt();
		
		for(int i=1; i<=noOfObj; i++)
		{
			Customer cust = Customer.getCustomer();
			System.out.println(cust);
		}
		sc.close();

	}

}
