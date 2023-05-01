package pom;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import seleniumpack.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

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
  public void register() 
  {
	  page = new RegisterPage(driver);
	  page.customerRegistration();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
