package akshay.stringbuffer_stringbuilder;

public class AppendMethod1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("HELLO");
		System.out.println(sb.capacity());
	}

}
//capacity method show only capacity of string.