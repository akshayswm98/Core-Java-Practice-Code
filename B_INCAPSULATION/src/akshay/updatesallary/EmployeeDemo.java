package akshay.updatesallary;
// Declared All Class variable with private access modifier (Data hiding)
//write getter and setter public method to update data at runtime
// is a tight encapsulation 
import java.util.Scanner;

class Employee
{
	private String name;
	private double salary;
	public Employee(String name, double salary) 
	{
		if(name == null && salary < 0)
		{
			System.err.println("Error");
			System.exit(0);
		}
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
		if(salary > this.salary)
		{
			this.salary = salary;
		}
		else
		{
			System.err.println("Negative Increament Error");
			System.exit(0);
		}
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Employee Name := ");
		String name = sc.nextLine();
		
		System.out.println("Enter The Employee Salary:= ");
		double salary = sc.nextDouble();
		
		Employee raj = new Employee(name, salary);
		System.out.println(raj);
		
		System.out.println("Enter The Increament Amount := ");
		double increament = sc.nextDouble();
		
		raj.setSalary(raj.getSalary()+increament);
		System.out.println(raj);
	}

}
