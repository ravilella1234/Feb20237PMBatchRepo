package seleniumpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "");
		WebDriverManager.iedriver().setup();
		 driver = new InternetExplorerDriver();
		
		//System.setProperty("webdriver.gecko.driver", "");
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver2 = new FirefoxDriver();
	}

}
