package akshay.stringbuffer_stringbuilder;

public class BestExampleOf_Immutable_Mutable 
{
	public static void main(String[] args) 
	{
		String st = new String("Akshay");
		st.concat("patil");
		System.out.println(st);//String is a immutable.
		
		StringBuffer sb = new StringBuffer("Akshay");
		sb.append("patil");
		System.out.println(sb);//mutable
		
		
		StringBuilder sb1 = new StringBuilder("Akshay");
		sb1.append("patil");
		System.out.println(sb1);//mutable.
		
	}
	
	
}
