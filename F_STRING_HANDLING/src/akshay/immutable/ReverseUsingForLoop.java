package akshay.immutable;

import java.util.Scanner;

public class ReverseUsingForLoop 
{

	public static void main(String[] args) 
	{
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String Name : ");
		String name = sc.next();
		
		for(int i = name.length()-1; i>=0; i--)
		{
			reverse = reverse + name.charAt(i);
		}
		System.out.println("Before Reverse Name : "+name+" After Reverese Name : "+reverse);
		
		if(name.equals(reverse))
		{
			System.out.println("Is A Palindrome.");
		}
		else
		{
			System.out.println("Is Not A palindrom.");
		}
	}

}
