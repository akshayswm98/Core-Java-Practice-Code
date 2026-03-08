package akshay.stringbuffer_stringbuilder;

public class LenthMethod1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Akshay");
		
		System.out.println(sb.length());//give length of the string.
		
		System.out.println(sb.capacity());//it will show only by default capacity of string builder class
	}
	//if capacity greater then 16 then it will print by default capacity and adding string value length.

}
