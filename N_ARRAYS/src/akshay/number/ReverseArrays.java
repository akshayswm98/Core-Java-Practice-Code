package akshay.number;

public class ReverseArrays 
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,30,40,50};
		
		System.out.println("My Arrays");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+",");
		}
			
		
		System.out.println("\n"+"Arrays Reverse Order");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+",");
		}
	}

}
