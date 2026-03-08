package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo8 
{
	public static void main(String[] args) 
	{
		Vector<String> listOfCity = new Vector<String>();
		listOfCity.add("Surat");
		listOfCity.add("Pune");
		listOfCity.add("Ahemdabad");
		listOfCity.add("Vanaras");
		listOfCity.add("Delhi");
		
		Collections.sort(listOfCity);
		listOfCity.forEach(System.out::println);
		
		System.out.println("---------------------------------");
		Vector<Integer> listOfNumber = new Vector<Integer>();
		listOfNumber.add(500);
		listOfNumber.add(600);
		listOfNumber.add(100);
		listOfNumber.add(300);
		listOfNumber.add(200);
		listOfNumber.add(400);
		listOfNumber.add(700);
		
		System.out.println("Origional Data :- "+listOfNumber);
		
		
		//Ascending Order
		Collections.sort(listOfNumber);
		System.out.println("Ascending Order :- "+listOfNumber);
		
		//Descending Order
		Collections.sort(listOfNumber,Collections. reverseOrder());
		System.out.println("Descending Order :- "+listOfNumber);
		
		//Converting Vector(Collection) Interface into Arrays.
		
		Vector<String> fruit = new Vector<String>();
		fruit.add("Apple");
		fruit.add("Pinaaple");
		fruit.add("Greaps");
		fruit.add("Strobbery");
		
		
		//converting vector elements in arrays.
		
		Object[] fruit1 = fruit.toArray();// toArray Method we will use to converting object in arrays.
		System.out.println(fruit1);
		
	}
}
