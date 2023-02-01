package hdfc.loans.carloans;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args) 
	{
		ChildClass c = new ChildClass();
		c.m1();
		c.m2();
	}

	@Override
	public void m2() 
	{
		System.out.println("iam m2 overriden in ChildClass");
	}

}
