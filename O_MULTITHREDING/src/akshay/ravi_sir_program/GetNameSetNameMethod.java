package akshay.ravi_sir_program;

import java.util.Scanner;

class BatchAssignment extends Thread
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName().toLowerCase();
		if(name != null && name.equalsIgnoreCase("Placement"))
		{
			this.placementBatch();
		}
		else if(name != null && name.equalsIgnoreCase("Regular"))
		{
			this.regularBatch();
		}
	}
	
	
	public void placementBatch()
	{
		System.out.println("I am the placement Batch Student..");
	}
	
	public void regularBatch()
	{
		System.out.println("I am the regular batch student..");
	}
}


public class GetNameSetNameMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("..........Choose One........");
			System.out.println("..........1.PlacementBatch..");
			System.out.println("..........2.RegularBatch..");
			int choice = sc.nextInt();
			
			BatchAssignment b = new BatchAssignment();
			switch(choice)
			{
			case 1:
				b.setName("Placement");
				b.start();
				break;
				
			case 2:
				b.setName("Regular");
				b.start();
				break;
				
			default:
				System.err.println("Invalid Choice....!");
			}
		}
		catch(Exception e)
		{
			System.err.println("Enter Valid Number");
		}
		sc.close();

	}

}
