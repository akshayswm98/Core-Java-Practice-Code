package akshay.stringbuffer_stringbuilder;

public class InsertMethod 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Hello");
		sb.insert(2, "JSE");
		System.out.println(sb);
		
		
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.insert(2, "JSE");
		System.out.println(sb1);
	}
}
