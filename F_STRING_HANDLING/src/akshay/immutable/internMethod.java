package akshay.immutable;
/* intern method to canonical representation of the string object
   Actually it is use to place the string object in the SCP area 
   is already containing the string object then it will return 
   the Address of the string object.
*/


public class internMethod 
{

	public static void main(String[] args) 
	{
		String name = "Akshay";
		String n = new String("Akshay");
		System.out.println(name == n);//false
		
		 String n1 = n.intern();
		System.out.println(name == n1);//true
	}

}
