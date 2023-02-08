package kotak.loans.carloans;

import java.util.Date;

public class A 
{
	public final static int x = 100;
	
	public void m1()
	{
		System.out.println("iam m1 from A");
		
	}
	
	public static void m5()
	{
		
	}
	
	static
	{
		System.out.println("iam static block..");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
	}

}
