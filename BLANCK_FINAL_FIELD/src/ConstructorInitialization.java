package blankfinalfield;

class Employee
{
	final int salary;
	
	public Employee()
	{
		salary = 40000;
	}
	
	public Employee(int salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "Employee [salary=" + salary + "]";
	}
	
	
}

public class ConstructorInitialization 
{

	public static void main(String[] args) 
	{
		Employee em = new Employee();
		System.out.println(em);
		
		Employee em1 = new Employee(50000);
		System.out.println(em1);
	}

}
