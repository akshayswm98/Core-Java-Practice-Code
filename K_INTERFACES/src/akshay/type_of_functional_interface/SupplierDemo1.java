package akshay.type_of_functional_interface;

import java.util.function.Supplier;

/*It is also predefined Functional interface.
 * It accept Abstract T get() method, it does not accept any parameter but return type is T.
 * It mainly used to supply the given parameter.*/


public class SupplierDemo1 
{
	public static void main(String[] args) 
	{
		Supplier<String> s1 = ()->100+" "+200;
		System.out.println(s1.get());
	}

}
