package akshay.declaration_initialization;

import java.util.Arrays;

public class ArraysInitializationDemo3 
{
	public static void main(String[] args)
	{
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		System.out.println("Fatching Data using loop : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		int[] x = new int[] {1000,2000,3000};
		System.out.println("Fetching data From For each loop: ");
		for (int i : x) 
		{
			System.out.println(i);
		}
		
		
		int[] a = {2,9,5,6,3};
		System.out.println(Arrays.toString(a));
		
		
	}

}
