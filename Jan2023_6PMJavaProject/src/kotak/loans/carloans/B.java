package kotak.loans.carloans;

public class B extends A // ISA relationship
{
	public void m1()
	{
		System.out.println("iam overridden m1 from B");
	}
	
	public void m2()
	{
		System.out.println("iam m2 from B");
	}

	public static void main(String[] args) 
	{
		A a = new A(); // HasA relationship
		a.m1();
		
		B b = new B();
		b.m2();
		b.m1();
	}

}
