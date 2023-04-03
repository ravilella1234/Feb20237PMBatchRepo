package seleniumpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example6 
{

	public static void main(String[] args) throws Exception 
	{
		//to setup the ChromeDriver
		WebDriverManager.chromedriver().setup();

		//launching the ChromeBrowser
		WebDriver driver = new ChromeDriver();

		//page load time out
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		//This timeout is used to specify the time the driver should wait while searching for an element if it is not immediately present.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// maximize the page
		driver.manage().window().maximize();

		//delete all cookies
		driver.manage().deleteAllCookies();

		//launching the web application
		driver.get("https://www.redbus.in/");

		//Expectation departureCity &ArrivalCity will be selected from Cities picker.
		String DepartureCity = "Kolkata";
		String ArrivalCity = "Kolkata";

		//sendKeys() is a method in Selenium that allows QAs to type content automatically into an editable field while executing any tests for forms.
		WebElement ele = driver.findElement(By.xpath("//input[@type='text' and @id='src']"));
		ele.clear();
		ele.sendKeys(DepartureCity);
		Thread.sleep(5000);
		// ele.sendKeys(Keys.ENTER);

		/* int listofcities = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li")).size();
		System.out.println("Totla no.of ArrivalCities : " + listofcities );

		for(int i=0;i<listofcities;i++)
		{
		String city = "//input[@type='text' and @id='dest']("+i+")";
		driver.findElement(By.xpath(city)).sendKeys(args) */

		while(true)
		{
		if(!DepartureCity.equals(ArrivalCity))
		{
		ele = driver.findElement(By.xpath("//input[@type='text' and @id='dest']"));
		ele.sendKeys(ArrivalCity);
		Thread.sleep(5000);
		ele.sendKeys(Keys.ENTER);
		break;
		}
		else
		{
		System.out.println("DepartureCity name must be different from ArrivalCity ! PLEASE PROVIDE VALID INPUT ");
		break;
		}
		}
	}

}
