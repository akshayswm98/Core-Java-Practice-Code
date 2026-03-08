package akshay.immutable;
/*Equal () we can use to compared to string check only content,
  is a case sensitive method.*/
public class equelMethod 
{

	public static void main(String[] args) 
	{
		String s1 ="Akshay";
		String s2 ="Akshay";
		String s3 ="akshay";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false

	}

}
