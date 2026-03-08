package akshay.hierarchicalinheritance;

class Employee
{
	protected double salary;
	
	public Employee(double salary)
	{
		this.salary = salary;
	}
}

class Developer extends Employee
{
	public Developer(double salary)
	{
		super (salary);
	}
	
	public String toString()
	{
		return "Developer [salary= "+salary+ "]";
	}
}

class Designer extends Employee
{
	public Designer(double salary)
	{
		super(salary);
	}

	public String toString()
	{
		return "Designer [salary= "+salary+ "]";
	}
	
}

public class ConstructorChaining 
{

	public static void main(String[] args) 
	{
		Developer dl = new Developer(27000);
		System.out.println(dl);
		
		Designer dr = new Designer(30000);
		System.out.println(dr);
	}

}
