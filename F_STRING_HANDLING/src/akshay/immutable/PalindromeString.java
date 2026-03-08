package akshay.immutable;

import java.util.Scanner;

public class PalindromeString 
{

	public static void main(String[] args) 
	{	String re = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :- ");
		String name = sc.nextLine().toUpperCase();
		int s = name.length();
		System.out.println("My String Name Is:- "+name);
		System.out.println("My string Lenth Is :- "+s);
		
		for(int i = s - 1; i>=0; i--)
		{
			re = re + name.charAt(i);
		}
		System.out.println("My Reverse String Is :-"+re);
		
		if(name.equals(re))
		{
			System.out.println("is a palindrom");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
