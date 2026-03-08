package akshay.sealed_permits_finalclass;

import java.util.Scanner;

sealed class College permits Commerse,Science
{
	String sName;
	int sId;
	
	public College(String sName, int sId) 
	{
		super();
		this.sName = sName;
		this.sId = sId;
	}
	
	public void admission()
	{
		System.out.println("Student Admission Done Here...!");
	}
}

non-sealed class Commerse extends College
{
	public Commerse(String sName, int sId) 
	{
		super(sName, sId);
		
	}
	
	@Override
	public void admission() 
	{
		System.out.println("Student Name Is:- " +sName);
		System.out.println("Student Id Is:- "+sId);
		System.out.println("Commerse Student");
		super.admission();
	}
}

final class Science extends College
{
	public Science(String sName, int sId) 
	{
		super(sName, sId);
		
	}

	@Override
	public void admission() 
	{
		System.out.println("Student Name Is:- "+sName);
		System.out.println("Student Id Is:- "+sId);
		System.out.println("Science Student");
		super.admission();
	}
}
public class SealedDemo3 {

	public static void main(String[] args) 
	
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("======Student Admission========");
		System.out.println("  1.Commerse Student Admission" );
		System.out.println("  2.Science Student Admission Done" );
		System.out.println("  Choose One  " );
		int choice = Integer.parseInt(sc.nextLine());
		
		switch (choice) 
		{
		case 1: 
		{
			System.out.println("Enter Student Name:- ");
			String name = sc.nextLine().toUpperCase();
			
			System.out.println("Enter Student Id ");
			int sId = sc.nextInt();
			
			College clg = new Commerse(name,sId);
			clg.admission();
			break;
		}
		case 2:
		{
			System.out.println("Enter Student Name");
			String name = sc.nextLine().toUpperCase();
			
			System.out.println("Enter Student Id");
			int sId = sc.nextInt();
			College clg = new Science(name, sId);
			clg.admission();
			break;
		}
		default:
		System.err.println("Wrong choose...! "+choice);	
		}
	}

}
