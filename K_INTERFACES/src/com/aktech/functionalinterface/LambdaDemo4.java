package com.aktech.functionalinterface;

interface Length
{
	int getLength(String str);
}
public class LambdaDemo4 
{
	public static void main(String[] args) 
	{
		Length l = (str)->str.length();
		
		int result = l.getLength("Amravti");
		System.out.println("length is "+result);
		
	}

}
