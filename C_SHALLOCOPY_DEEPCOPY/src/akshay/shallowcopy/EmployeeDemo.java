package akshay.shallowcopy;
//we can Achieved using setter and getter public method().
//in shallow copy we will create only one object.
//and same object we will refers to multiple referenced variable.
//the reference variable will modify original object.

import java.util.Scanner;

class Employee
{
	private String name;
	private double salary;
	
	public Employee(String name,double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class EmployeeDemo 
{

	public static void main(String[] args) 
	{
		
		
		Employee em = new Employee("ak", 40000);
		System.out.println(em);
		
		Employee em2 = em;
		
		em2.setName("vn");
		em2.setSalary(30000);
		
		System.err.println("After changing");
		System.out.println(em);
		System.out.println(em2);

	}

}
