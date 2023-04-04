package seleniumpack;

import com.aventstack.extentreports.Status;

public class TC_004 extends BaseTest
{
		
	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("TC_004");
		test.log(Status.INFO, "Init the properties files....");
		
		launch("chromebrowser");
		test.log(Status.PASS, "Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		test.log(Status.FAIL, "Selecting drop option Books By using the locator : "+orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_name","Harry Potter");
		test.log(Status.INFO, "Enter the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicking on Search button By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		report.flush();
	}
}
