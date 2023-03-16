package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("searchDropdownBox","Books");
		
		typeText("field-keywords","Harry Potter");
		
		clickElement("//*[@id=\"nav-search-submit-button\"]");
		
		
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}

}
