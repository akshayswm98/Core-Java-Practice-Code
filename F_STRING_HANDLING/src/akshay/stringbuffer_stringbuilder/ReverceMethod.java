package akshay.stringbuffer_stringbuilder;

public class ReverceMethod 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("Akshay");
		sb1.reverse();
		System.out.println(sb1);
		
		
		StringBuilder  sb2 = new StringBuilder("Akshay");
		sb2.reverse();
		System.out.println(sb2);
	}
}
