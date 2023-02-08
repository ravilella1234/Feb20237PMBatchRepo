package kotak.loans.carloans;

public abstract class FirstAbstarct 
{
	
	int x = 100;
	
	public void m1()
	{
		System.out.println("iam m1 concrete in FirstAbstract");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) 
	{
		//FirstAbstarct obj = new FirstAbstarct();
		
		FirstAbstarct obj = new ChildClass();
		obj.m1();
		obj.m2();
	}

}
