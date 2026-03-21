package akshay.immutable;

import java.util.Scanner;

public class PalindromeString 
{

	public static void main(String[] args) 
	{	String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :- ");
		String name = sc.nextLine().toUpperCase();
		
		int length = name.length();
		System.out.println("My String Name Is:- "+name);
		System.out.println("My string Lenth Is :- "+length);
		
		for(int i = length - 1; i>=0; i--)
		{
			reverse = reverse + name.charAt(i);
		}
		System.out.println("My Reverse String Is :-"+reverse);
		
		if(name.equals(reverse))
		{
			System.out.println("is a palindrom");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
