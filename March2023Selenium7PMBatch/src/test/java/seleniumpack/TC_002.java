package seleniumpack;

import org.apache.log4j.Logger;

public class TC_002 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_002.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Init the properties files....");
		
		launch("chromebrowser");
		log.info("Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigating to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		log.info("Selecting drop option Books By using the locator : "+orProp.getProperty("amazondropbox_id") );
		
		typeText("amazonsearchtext_name","Harry Potter");
		log.info("Enter the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicking on Search button By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}

}
