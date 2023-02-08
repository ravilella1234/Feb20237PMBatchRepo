package kotak.loans.carloans;

public class FirstClass 
{
	int x,y,result;
	
	// Behaviours
		public void add(int x, int y)
		{
			result = x+y;
			System.out.println("Add of X & Y is : " + result);
		}
		
		public void sub(int x , int y)
		{
			result = x-y;
			System.out.println("Sub of X & Y is : " + result);
		}
	
	public static void main(String[] args) 
	{
		FirstClass obj = new FirstClass();
		obj.add(10,20);
		obj.sub(10,20);
		
		FirstClass obj1 = new FirstClass();
		obj1.add(1000, 2000);
		obj1.sub(1000, 2000);
		
	}

}
