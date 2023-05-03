package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManagement 
{
	
  @Test
  public void applyDiscount() 
  {
	  System.out.println("applyDiscount");
  }
  
  @Parameters({"action"})
  @Test
  public void makePayment(String paymentType,ITestContext context) 
  {
	  if(paymentType.equals("pay@hotel"))
		  System.out.println("Make payment @ Hotel");
	  else
		  System.out.println("makePayment @ online");
	  
	  //booking Number
	  String bookingID = "RRR1234";
	  System.out.println(bookingID);
	  context.setAttribute("bID", bookingID);
  }
}
