package verifcations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify1 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		//String actuallink = driver.findElement(By.linkText("Customer Service")).getText();
		String actuallink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectedlink = "Customer Serv";
		
		System.out.println("Actual Link : " + actuallink );
		System.out.println("Expected Link : " + expectedlink );
		
		//if(actuallink.equals(expectedlink))
		//if(actuallink.equalsIgnoreCase(expectedlink))
		if(actuallink.contains(expectedlink))
			System.out.println("Both links are equal...");
		else
			System.out.println("Both links are not equal...");
	}

}
