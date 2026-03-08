package akshay.hierarchicalinheritance;

import java.util.Scanner;

class Student 
{
	protected int id;
	protected String name;
	protected String address;
	
	public Student(int id,String name,String address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
}

class Science extends Student
{
	protected int physics;
	protected int chemistry;
	
	public Science(int id, String name, String address, int physics,int chemistry)
	{
		super(id,name,address);
		this.physics = physics;
		this.chemistry = chemistry;
	}

	@Override
	public String toString() 
	{
		return "Science [physics=" + physics + ", chemistry=" + chemistry + ", id=" + id + ", name=" + name
				+ ", address=" + address + "]";
	}
	
	public void getData()
	{
		int totalMarks = this.physics + this.chemistry ;
		System.out.println("Science Medium Total Marks :- "+totalMarks);
	}
	
	
}

class MarathiMedium extends Student
{
	protected int marathi;
	protected int history;
	
	public MarathiMedium(int id, String name,String address,int marathi,int history)
	{
		super(id,name,address);
		this.marathi = marathi;
		this.history = history;
	}

	@Override
	public String toString() 
	{
		return "MarathiMedium [marathi=" + marathi + ", history=" + history + ", id=" + id + ", name=" + name
				+ ", address=" + address + "]";
	}
	
	public void getData()
	{
		int totalMarks = this.marathi + this.history;
		System.out.println("Marathi Medium Total Marks :- "+totalMarks);
	}
		
}

public class MyOun 
{
	public static void main(String[] args) 
	{
		Science sc = new Science(101, "ak", "pune", 70, 92);
		sc.getData();
		System.out.println(sc);
		
		System.out.println("============================================================================");
		MarathiMedium mr = new MarathiMedium(7, "pk", "yvtml", 90, 87);
		mr.getData();
		System.out.println(mr);
	}

}
