package factorymethod;

import java.util.Scanner;

class Product
{
	private int id;
	private String name;
	private double price;
	
	public Product(int id, String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	public static Product getProductData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id :-");
		int pid = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Product Name");
		String pname = sc.nextLine();
		
		System.out.println("Enter Product Price");
		double pprice = sc.nextDouble();
		
		return new Product(pid, pname, pprice);
	}
	
}

public class ProductDemo 
{
	public static void main(String[] args) 
	{
		Product p1 = Product.getProductData();
		System.out.println(p1);
		
		
	}

}
