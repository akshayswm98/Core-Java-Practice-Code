package akshay.interfacei;

import java.util.Scanner;

interface Banking 
{
	void deposit(double amount);
	void withdraw(double amount);
	double getBalance();
}

class Customer implements Banking
{
	private double balance;

	public Customer(double balance)
	{
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) 
	{
		if (amount <= 0)
		{
			System.err.println("Amount is Invalid");
			return;
		}
		balance = amount + balance;
		System.out.println("Deposit Successful");
	}

	@Override
	public void withdraw(double amount) 
	{
		if (amount > balance)
		{
			System.err.println("Insufficient Balance!");
			return;
		}
		balance = amount - balance;
		System.out.println("Withdraw Successful");
	}

	@Override
	public double getBalance() 
	{
		return balance;
	}
}

public class BankDepositeAndWithdrow 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Initial Balance: ");
		double bl = sc.nextDouble();

		Banking customer = new Customer(bl);

		System.err.println("Current Balance: " + customer.getBalance());
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		switch (choice) 
		{
			case 1:
				System.out.print("Enter Deposit Amount: ");
				double dep = sc.nextDouble();
				customer.deposit(dep);
				break;

			case 2:
				System.out.print("Enter Withdraw Amount: ");
				double wd = sc.nextDouble();
				customer.withdraw(wd);
				break;

			default:
				System.out.println("Invalid Choice");
		}

		System.err.println("Final Balance: " + customer.getBalance());
		sc.close();
	}
}
