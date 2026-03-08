package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.ArrayList;
import java.util.Collections;

record Customer(Integer custId,String custName, Double custSal)implements Comparable<Customer>
{
	@Override
	public int compareTo(Customer c2) 
	{
		return this.custName.compareTo(c2.custName);
	}
}
public class ArrayListDemo3 
{
	public static void main(String[] args) 
	{
		ArrayList<Customer> listOfCustomer = new ArrayList<Customer>();
		listOfCustomer.add(new Customer(111,"Scott" , 800D));
		listOfCustomer.add(new Customer(112,"Smith" , 200D));
		listOfCustomer.add(new Customer(122,"Alen" , 600D));
		listOfCustomer.add(new Customer(113,"Martin" , 700D));
		listOfCustomer.add(new Customer(101,"John" , 900D));
		
		System.out.println("Origional customer object");
		listOfCustomer.forEach(System.out::println);
		//sorting base on the name.
		Collections.sort(listOfCustomer);
		System.out.println("Sorted Base on the name : ");
		listOfCustomer.forEach(System.out::println);
		
	
	}
}
