package akshay.type_of_functional_interface;

import java.util.function.Supplier;


class Employee
{
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
public class SupplierDemo2 
{
	public static void main(String[] args) 
	{
		Supplier<Employee> s2 = ()->
		{
			return new Employee(111, "Alen",65000d);
		};
		Employee obj = s2.get();
		System.out.println(obj);
	}

}
