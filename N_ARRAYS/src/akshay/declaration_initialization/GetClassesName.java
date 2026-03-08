, package akshay.declaration_initialization;

public class GetClassesName 
{
	public static void main(String[] args) 
	{
		byte[] b = new byte[5];
		System.out.println(b.getClass().getName());
		
		short[] s = new short[5];
		System.out.println(s.getClass().getName());
		
		int[] i = new int[5];
		System.out.println(i.getClass().getName());
		
		long[] l = new long[5];
		System.out.println(l.getClass().getName());
		
		float[] f = new float[5];
		System.out.println(f.getClass().getName());
		
		double[] d = new double[5];
		System.out.println(b.getClass().getName());
		
		char[] c = new char[5];
		System.out.println(c.getClass().getName());
		
		boolean[] b2 = new boolean[5];
		System.out.println(b2.getClass().getName());
		
		Integer[] arr = new Integer[5];
		System.out.println(arr.getClass().getName());
	}

}
