package testng;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import seleniumpack.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_003 extends BaseTest
{
 
  
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String btype) throws Exception 
  {
	  System.out.println("startProcess");
	    init();
		test = report.createTest("TNG_003");
		test.log(Status.INFO, "Init the properties files....");
		
		launch(btype);
		test.log(Status.PASS, "Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to url : " + childProp.getProperty("amazonurl"));
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazon() 
  {
	  System.out.println("amazon");
	    selectOption("amazondropbox_id","Books");
		test.log(Status.FAIL, "Selecting drop option Books By using the locator : "+orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_name","Harry Potter");
		test.log(Status.INFO, "Enter the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicking on Search button By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess() 
  {
	  System.out.println("endProcess");
	  report.flush();
	  driver.quit();
  }

}
