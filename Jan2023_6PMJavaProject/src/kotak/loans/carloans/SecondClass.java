package kotak.loans.carloans;

public class SecondClass 
{
	// Data properties
	int a=10,b=20,result;
	
	// Behaviours
	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is : " + result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A & B is : " + result);
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Hello");
		
		int x = 100;
		String str = "ravi";
		
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
		
		SecondClass obj1 = new SecondClass();
		obj1.add();
		obj1.sub();
	}

}
