package seleniumpack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example5 
{

	public static void main(String[] args) throws Exception 
	{
		//to setup the ChromeDriver
		WebDriverManager.chromedriver().setup();

		//to close all the browser instances before a test execution in selenium web driver
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		// Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");

		//launching the ChromeBrowser
		WebDriver driver = new ChromeDriver();

		//page load time out
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		//This timeout is used to specify the time the driver should wait while searching for an element if it is not immediately present.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//delete all cookies
		driver.manage().deleteAllCookies();

		// maximize the page
		driver.manage().window().maximize();

		//launching the web application
		driver.get("https://www.goibibo.com/");

		//close the pop-up
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();

		//click operation
		driver.findElement(By.xpath("(//p[@class='sc-faUpoM clesLa fswWidgetTitle'])[1]")).click();

		//Expectation month &year &date will be selected from date picker.
		String month_year = "June 2023";
		String exp_date = "20";

		//every time it will check & capture the text(month & year)
		while(true)
		{
		String text = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();

		if(text.equalsIgnoreCase(month_year))
		{
		break;
		}
		else
		{
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}

		}
		//Date Selection
		List<WebElement> allDates= driver.findElements(By.xpath("//div[@class='DayPicker-Body']//div"));

		for(WebElement ele : allDates)
		{
		String dt = ele.getText();

		if(dt.equals(exp_date))
		{
		ele.click();
		break;
		}

		}
		// driver.quit();
	}

}
