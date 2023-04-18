package switches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitchs 
{

	public static void main(String[] args) 
	{
		ChromeOptions option  = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.get("https://www.amazon.in");
		//System.out.println(driver.getTitle());
		
		
	}

}
