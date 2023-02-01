package hdfc.loans.eduloans;

public class TypeCasting 
{

	public static void main(String[] args) 
	{
		// byte-1, short-2, int-4, long-8, float-4, double-8
		
		// 1-Liter ---> 500 ml ---> There is no risk ---> widening
		// 1-Liter ---> 1.5ltr ---> There is a risk(water overflow) ---> Narrowing
		
		// Type casting from one primitive type to another primitive type
			
		int x1 = 10;
		System.out.println(x1);
		
		//double x2 = x1;
		double x2 = (double)x1;
		System.out.println(x2);
		
		double y1 = 12.34;
		System.out.println(y1);
		
		int y2 = (int)y1;
		System.out.println(y2);
		
		// Type casting from one primitive type to corresponding wapperclass type
		
		int i1 = 100;
		System.out.println(i1);
		
		Integer i2 = Integer.valueOf(i1);
		System.out.println(i2);
		
		Integer k1 = 10;
		System.out.println(k1);
		
		int k2 = (int)k1;
		System.out.println(k2);
		
		
		// Type casting from one wapperclass type to another wapperclass type
		
		String s1 = "200";
		String s2 = "300";
		
		System.out.println(s1+s2);
		
		float i = Float.parseFloat(s1);
		float j = Float.parseFloat(s2);
		System.out.println(i+j);
		
		int f1 = Integer.parseInt(s1);
		int f2 = Integer.parseInt(s2);
		System.out.println(f1+f2);
	}

}
