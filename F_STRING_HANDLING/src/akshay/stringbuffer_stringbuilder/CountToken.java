package akshay.stringbuffer_stringbuilder;

import java.util.StringTokenizer;

public class CountToken 
{
	public static void main(String[] args) 
	{
		String str = "Hyd is an IT city";
		
		StringTokenizer st  = new StringTokenizer(str,"a");
		
		System.out.println("Total number of token : "+st.countTokens());
		
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
	}
}
