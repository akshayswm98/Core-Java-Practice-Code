package akshay.declaration_initialization;

import java.util.Arrays;

public class ArraysInitialization1 
{
	public static void main(String[] args) 
	{
		int[] a;
		a= new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		for (int i : a) 
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\nSecond Element Print: " +a[1]);
		
		//using for loop print all element
	/*	for(int i = 0; i<3; i++)
		{
			System.out.println(a[i]);
		}
		
		//using method.
		for(int i=0; i<a.lenth; i++)
		{
		system.out.println(a[i]+",")
		}
		
	
	*/
		// using for each loop print all elements
		/*
		 * for(int i : a) { System.out.println(i+","); }
		 */
		
		
	}
}
