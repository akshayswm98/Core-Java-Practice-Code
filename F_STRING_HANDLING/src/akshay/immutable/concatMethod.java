package akshay.immutable;
/* Concat() we can use to join two string and 
   also appending purpose.
*/
public class concatMethod 
{
	public static void main(String[] args) 
	{
		String s1 = "Akshay ";
		String s2 = "Patil";
		String s3 = s1+s2;
		System.out.println("String After concatnation with + operator = "+s3);// + operator also use in string as a concatnation
		
		String s4 = s1.concat(s2);
		System.out.println("Using Concat Method = "+s4);
		
		System.out.println("Appending Also Possible with concat method.");
		String s5 = "Babarao";
		System.out.println(s5.concat(" patil"));
		System.out.println(s5);//String is a immutable.
		
		
		
	}
}
