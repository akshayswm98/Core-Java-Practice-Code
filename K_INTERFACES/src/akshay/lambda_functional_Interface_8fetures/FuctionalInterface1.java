package akshay.lambda_functional_Interface_8fetures;



/*whenever inside interface having only one abstract method 
 does not contain static,default,and private that situation we
 will say it is a functional interface.
 */

interface Printable11
{
	void print(); // only one abstract method.
}


class Image implements Printable11
{
	public void print() 
	{
		System.out.println("Printing Image.");
	}
}


public class FuctionalInterface1 
{
	public static void main(String[] args) 
	{
		Image p = new Image();
		p.print();
	}

}
