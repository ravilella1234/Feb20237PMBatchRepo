package kotak.loans.homeloans;

public class UserdefineArray 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student(100, "s1");
		Student s2 = new Student(200, "s2");
		Student s3 = new Student(300, "s3");
		Student s4 = new Student(400, "s4");
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		
		//int[] a = new int[4];
		Student[] st = new Student[4];
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		
		for(Student s:st)
		{
			System.out.println(s);
		}
	}

}
