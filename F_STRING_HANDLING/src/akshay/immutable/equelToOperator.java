package akshay.immutable;
// == operator will check only address. not content
public class equelToOperator 
{

	public static void main(String[] args) 
	{
		String name = "Akshay";  // in this statement only one object will create in SCP area and same object assine
		                          // memory to the reference.
		String nName = "Akshay";
		System.out.println(name == nName);
		
		String s1 = new String("Akshay");// we create object using literal they will create memory location in heap area
		System.out.println(s1 == name); // that why ans is false.

	}

}
