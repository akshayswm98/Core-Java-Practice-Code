package akshay.singlelevel;

import java.util.Scanner;

class TempEmp
{
	protected int eid;
	protected String name;
	protected double salary;
	
	public TempEmp(int eid, String name, double salary) 
	{
		super();
		
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
}

class PempEmp extends TempEmp
{
	protected String depName;
	protected String designation;
	
	public PempEmp(int eid, String name, double salary,String depName,String designation)
	{
		super(eid, name, salary);
		this.depName = depName;
		this.designation = designation;
	}

	@Override
	public String toString() 
	{
		return "PempEmp [depName=" + depName + ", designation=" + designation + ", eid=" + eid + ", name=" + name
				+ ", salary=" + salary + "]";
	}

	
}


public class Main
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department Name ");
		String depName = sc.nextLine();
		
		System.out.println("Enter Employee Name ");
		String name = sc.nextLine();
	
		
		
		System.out.println("Enter Employee Designation ");
		String designation = sc.nextLine();
		
		System.out.println("Enter Employee Id ");
		int eid = sc.nextInt();
		
		System.out.println("Enter Employee Salary ");
		double salary = sc.nextDouble();
		
		PempEmp emp = new PempEmp(eid, name, salary, depName, designation);
		System.out.println(emp);
	}

}
