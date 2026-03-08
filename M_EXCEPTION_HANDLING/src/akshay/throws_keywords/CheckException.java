package akshay.throws_keywords;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	private static final long serielVersionID = 1L;
	

	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
	
}

public class CheckException 
{
	public static void main(String[] args) 
	{
		
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Age: ");
			int age = sc.nextInt();
			validateAge(age);
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}
	}
		
		public static void validateAge(int age) throws InvalidAgeException
		{
			if(age < 18)
			{
				throw new InvalidAgeException("Age Is Valid..!");
			}
			else 
			{
				System.out.println("You Can For For movie");
			}
		}
		
	}


