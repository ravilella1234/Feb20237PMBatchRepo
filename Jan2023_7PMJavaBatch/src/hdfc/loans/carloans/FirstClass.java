package hdfc.loans.carloans;

import java.io.FileInputStream;

public class FirstClass 
{
	
	// dataProperties
	int a=10, b=20, result;
	
	// Behaviours
	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is : "+  result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A & B is : " +  result);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hi");
				
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();
		
		FirstClass obj1 = new FirstClass();
		obj1.add();
		obj1.sub();
	}
}
