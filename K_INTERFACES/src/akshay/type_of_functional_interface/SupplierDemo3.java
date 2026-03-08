package akshay.type_of_functional_interface;

import java.util.Scanner;
import java.util.function.Supplier;

class Product1
{
	private Integer id;
	private String name;
	private Double price;
	
	public Product1(Integer id, String name, Double price) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Product1 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
public class SupplierDemo3 
{
	public static void main(String[] args) 
	{
		Supplier<Product1> p = ()->
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Product Id :");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Product Name :");
			String name = sc.nextLine();
			
			System.out.println("Enter Product Price :");
			double price = Double.parseDouble(sc.nextLine());
			
			return new Product1(id, name, price);
			
		};
		
		Product1 obj = p.get();
		System.out.println(obj);
	}

}
