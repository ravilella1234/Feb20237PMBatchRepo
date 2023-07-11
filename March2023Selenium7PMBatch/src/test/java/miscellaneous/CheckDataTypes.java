package miscellaneous;

import java.util.Scanner;

public class CheckDataTypes 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int intData;
		char charData;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the String Value : ");
		String strData = sc.nextLine();
		
		System.out.println("Enter the Integer Value : ");
		intData = sc.nextInt();
		
		System.out.println("Enter the character Value : ");
		charData = sc.next().charAt(0);
		
		
		
		sc.close();
		
		// show the datatypes of variable by using getclass() & getSimpleName()
		System.out.println(intData+"is  of type " + ((Object)intData).getClass().getSimpleName());
		System.out.println(charData+"is  of type " + ((Object)charData).getClass().getSimpleName());
		System.out.println(strData+"is  of type " + (strData.getClass().getSimpleName()));
	}

}
