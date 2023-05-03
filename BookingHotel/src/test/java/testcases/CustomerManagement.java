package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CustomerManagement 
{
	
  @Test
  public void checkMail(ITestContext context) 
  {
	 String bookingID = (String)context.getAttribute("bID");
	  System.out.println("checkMail : " +  bookingID);
  }
  
  @Test
  public void checkMobile(ITestContext context) 
  {
	  String bookingID = (String)context.getAttribute("bID");
	  System.out.println("checkMobile : " + bookingID);
  }
  
  
}
