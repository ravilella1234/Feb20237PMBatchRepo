package verifcations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumpack.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("Verify3");
		test.log(Status.INFO, "Init the properties files....");
		
		launch("chromebrowser");
		test.log(Status.PASS, "Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to url : " + childProp.getProperty("amazonurl"));
		
		String expectedlink = "Customer Servic";
		
		if(!isLinksEqual(expectedlink))
			//System.out.println("Both links are not equal...");
			reportfail("Both links are not equal...");
		else
			//System.out.println("Both links are equal...");
			reportPass("Both links are equal...");
		
		report.flush();
	}

	
}
