package akshay.throwableclass_method;

import java.util.Scanner;

public class ToStringMethod {

	public static void main(String[] args) 
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number ");
		int n = sc.nextInt();
		
		System.out.println("Enter the second number ");
		int n1 = sc.nextInt();
		
		int result = n/n1;
		
		System.out.println("Dividetion is "+result);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			System.err.println("pls do not inter zero");
		}
	}

}
