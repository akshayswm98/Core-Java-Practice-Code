package akshay.exception_occure;

import java.util.Scanner;

/*If the reference variable pointing to the null and by using that
 reference variable, if we are accessing any non static field OR 
 non static method then we will get java.lang.NUllPointerException.*/
public class NullPointerException 
{
	/*
	public static void main(String[] args) 
	{
		String n = null;
		System.out.println(n.toUpperCase());
	}
	*/
	
	/*
	public static void main(String[] args) 
	{
		try
		{
			String n = null;
			System.out.println(n.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	*/
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string value ");
		String n = sc.nextLine();
		System.out.println(n.length());
	}

}
