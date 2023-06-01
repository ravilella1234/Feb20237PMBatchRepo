package pom;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import seleniumpack.BaseTest;

public class POM_001 extends BaseTest
{
	  
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String btype) throws Exception 
  {
	    init();
		test = report.createTest("POM_001");
		test.log(Status.INFO, "Init the properties files....");
		
		launch(btype);
		test.log(Status.PASS, "Launching the browser : " + btype);
		
		navigateUrl("pomurl");
		test.log(Status.INFO, "Navigating to url : " + childProp.getProperty("pomurl"));
  }
  
  @Test
  public void f() 
  {
	  login = new CustomerLogin(driver);
	  login.customerLogin();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
