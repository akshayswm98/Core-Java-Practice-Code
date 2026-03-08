package akshay.type_of_functional_interface;
//Verify my name is virat or not

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo3 
{
	public static void main(String[] args) 
	{
		Function<String, Boolean> v = str -> str.equalsIgnoreCase("Virat");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : " );
		
		String name = sc.nextLine();
		
		System.out.println("Are you Virat...? "+v.apply(name));
	}

}
