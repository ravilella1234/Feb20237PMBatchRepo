package kotak.loans.personalloans;

import java.util.Scanner;

public class UserDefineExeption extends Exception
{

	public UserDefineExeption(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("Enter the 10 character String : ");
			str = sc.nextLine();
			try 
			{
				if (str.length() != 10)
					throw new UserDefineExeption("String should be 10 character...");
				else
					System.out.println(str);
				break;
			} 
			catch (UserDefineExeption e) 
			{
				e.printStackTrace();
			} 
		}
	}

}
