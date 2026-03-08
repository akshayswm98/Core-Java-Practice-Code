package akshay.exception_occure;

import java.util.Scanner;

public class InputMismatchException 
{
/*	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n = sc.nextInt();
		System.out.println("number is "+n);
	}//when we inter number rather than integer it will provide 
     //input mismatch exception.
     
*/
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number :- ");
			int n = sc.nextInt();
			System.out.println("number is "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
}
