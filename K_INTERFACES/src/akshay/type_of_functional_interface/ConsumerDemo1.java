package akshay.type_of_functional_interface;
/*It has one abstract method Accept() which takes T as a parameter and return noting.
 * It is use to Accept and consume values.(Only for storing purpose)*/

import java.util.function.Consumer;


class Product
{
	private Integer id;
	private String name;
	
	public Product(Integer id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class ConsumerDemo1 
{
	public static void main(String[] args) 
	{
		Consumer<Float> c1 = flt-> System.out.println("Float Value Is : "+flt);
		c1.accept(55.88F);
		
		Consumer<Boolean> b1 = bln-> System.out.println("Boolean value is "+bln);
		b1.accept(true);
		
		Consumer<Product> p1 = prd -> System.out.println("Product object is "+prd);
		p1.accept(new Product(222, "Laptop"));
 	}

}
