package akshay.shallowcopy;
class Laptop
{
	private String brand;
	private double prize;
	
	public Laptop(String brand,double prize)
	{
		this.brand = brand;
		this.prize = prize;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public double getPrize()
	{
		return prize;
	}
	
	public void setPrize(double prize)
	{
		this.prize = prize;
	}

	@Override
	public String toString() 
	{
		return "Laptop [brand=" + brand + ", prize=" + prize + "]";
	}
	
	
}

public class LaptopDemo 
{

	public static void main(String[] args) 
	{
		Laptop l1 = new Laptop("hp", 30000);
		System.out.println(l1);
		
		Laptop l2 = l1;
		l2.setBrand("dell");
		l2.setPrize(40000);
		
		System.out.println("After Changing");
		System.out.println(l1);
		System.out.println(l2);
	}

}
// we can Achieved using setter and getter public method().
// in shallow copy we will create only one object.
// and same object we will refers to multiple referenced variable.
//the reference variable will modify original object.
