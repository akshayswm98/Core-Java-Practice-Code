package akshay.try_catch_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo3 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your salary: ");
			double sal = sc.nextDouble();
			
			System.out.println("Your salary is: "+sal);
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input Is Invalid...! "+e);
		}
		finally
		{
			System.out.println("Inside Finally.");
			
		}
	}

}
