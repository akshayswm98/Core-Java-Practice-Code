package akshay.autoboxing;

/*In that program we will Convert All primitive data into Wrapper Object.
  Here, valueOf method we will use for converting primitive to Wrapper*/

public class Autoboxing2 
{

	public static void main(String[] args) 
	{
		byte b = 12;
		Byte b1 = Byte.valueOf(b);
		System.out.println("Byte Object :"+b1);
		
		short s = 17;
		Short s1 = Short.valueOf(s);
		System.out.println("Short Object :"+s1);
		
		int i = 13;
		Integer i1 = Integer.valueOf(i);
		System.out.println("Integer Object :"+i1);
		
		long l = 40;
		Long l1 = Long.valueOf(l);
		System.out.println("Long Object :"+l);
		
		float f = 1.2f;
		Float f1 = Float.valueOf(f);
		System.out.println("Float Object is :"+f1);
		
		double d = 90.90;
		Double d1 = Double.valueOf(d);
		System.out.println("Double Object :"+d1);
		
		char r ='A';
		Character r1 = Character.valueOf(r);
		System.out.println("CHaracter Object :"+r1);
		
		boolean b2 = true;
		Boolean b3 = Boolean.valueOf(b2);
		System.out.println("Boolean Object :"+b3);
		
	}

}
