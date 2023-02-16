package kotak.loans.homeloans;

public class Student 
{
	int sno;
	String sname;
	
	public Student(int sno, String sname) 
	{
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public String toString() 
	{
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) 
	{
		Student s = new Student(100, "sai");
		//System.out.println(s.sno);
		//System.out.println(s.sname);
		System.out.println(s);
	}

}
