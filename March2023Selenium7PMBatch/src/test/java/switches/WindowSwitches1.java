package switches;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitches1 
{

	public static void main(String[] args) 
	{
		ChromeOptions option  = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();		
		driver.get("https://www.icicibank.com");
		System.out.println(driver.getTitle());
		String parentWind = driver.getWindowHandle();
		System.out.println(parentWind);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//img[@alt='FD'])[1]")))).click();
		
		Set<String> winds = driver.getWindowHandles();
		for(String w:winds)
		{
			if(!parentWind.equals(w))
			{
				driver.switchTo().window(w);
			}
		}
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWind);
		System.out.println(driver.getTitle());

	}

}
