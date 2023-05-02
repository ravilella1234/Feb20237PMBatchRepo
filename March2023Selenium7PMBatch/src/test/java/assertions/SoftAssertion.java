package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertion 
{

	public static void main(String[] args) 
	{
		ChromeOptions option  = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String expectedLink = "Customer Serv";
		
		SoftAssert soft = new SoftAssert();
		//soft.assertEquals(actualLink, expectedLink);
		soft.assertTrue(actualLink.equals(expectedLink), "Both links are not equal...");
		
		driver.findElement(By.linkText("Customer Service")).click();
		
		soft.assertTrue(false, "err1");
		
		soft.assertTrue(false, "err2");
		
		soft.assertTrue(true, "err3");
		
		soft.assertTrue(false, "err4");
		
		soft.assertAll();
	}

}
