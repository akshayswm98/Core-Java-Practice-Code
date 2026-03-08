package akshay.throw_keyword;

import java.util.Scanner;

class GreterMarkException extends RuntimeException
{

	public GreterMarkException(String msg) 
	{
		super(msg);
	}
	
}


public class CustomeCheckException 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Marks: ");
			int m = sc.nextInt();
			
			if(m < 100)
			{
				throw new GreterMarkException("Invalid Marks..!");
			}
			else
			{
				System.out.println("Your Marks Is: "+m);
			}
		}
		catch(GreterMarkException e)
		{
			System.out.println("Pls enter valid marks Above 100 "+e);
		}
			System.out.println("Thank you..!");
	}

}
