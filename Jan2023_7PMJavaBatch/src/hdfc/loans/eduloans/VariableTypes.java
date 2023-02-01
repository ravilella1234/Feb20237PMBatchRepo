package hdfc.loans.eduloans;

public class VariableTypes 
{
	int x = 10; // instance variable
	static String cname = "vmware"; // static variable
	static VariableTypes obj = new VariableTypes();
	
	public void m1()
	{
		int x = 100; // local variable 
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
	}
	
	public static void m2()
	{
		//VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void main(String[] args) 
	{
		//VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}

}
