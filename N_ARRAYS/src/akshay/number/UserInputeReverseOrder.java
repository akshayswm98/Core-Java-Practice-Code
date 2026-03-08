package akshay.number;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputeReverseOrder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter Size Of Arrays: ");
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			
			for(int i=0; i<arr.length; i++)
			{
				System.out.println("Enter The Element of Arrays at " +i+ " Position: ");
				arr[i] =  sc.nextInt();
			}
			System.err.println("Origional Arrays: ");
			System.out.println(Arrays.toString(arr));
			
			System.err.println("Arrays Data Reverse Order");
			
			for(int i=arr.length-1; i>=0; i--)
			{
				System.out.print(arr[i]);
			}
		}
		catch(InputMismatchException e)
		{
			System.err.println("Invalid Input...!");
		}
		catch(NegativeArraySizeException e)
		{
			System.err.println("Arrays Size Must be Positive Integer..!");
		}
		catch(Exception e)
		{
			System.err.println("General Exception...!");
		}
	}

}
