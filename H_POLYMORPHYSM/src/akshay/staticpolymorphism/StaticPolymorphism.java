package akshay.staticpolymorphism;

/*Polymorphism
 poly :- Many
 Morphism :- Forms
 It is a greek word whose meaning is "Same Object Having Different Behavior".
 There is two types of polymorphism.
 
 1.Static (Compiletime Polymorphism)
 2.Dynamic (Run time polymorphism)
 
 1.Static Polymorphism :- The polymorphism which is exist at the time of 
 Compilation is Called as static polymorphism.
 
 we can achieve Static polymorphism by using "method overloading".
 
 2. Dynamic Polymorphism :- The polymorphism which is exist at runtime
    is called as Dynamic polymorphism
    
    we can achieve dynamic polymorphism by using "Method Overriding".*/

class Sum
{
	public int add(int x, int y, int z)
	{
		return x+y+z;
		
		
	}
	
	public Double add(Double x, Double y)
	{
		
		return x+y;
	}
}

public class StaticPolymorphism {

	public static void main(String[] args) 
	{
		Sum sm = new Sum();
		System.out.println("Sum of two integer :"+sm.add(100, 200, 300));
		System.out.println("sum of two double :"+sm.add(5D, 4D));
	}

}
