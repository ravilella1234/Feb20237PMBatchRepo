package seleniumpack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 
{
	public static void main(String[] args)
	{
	//to setup the ChromeDriver
	WebDriverManager.chromedriver().setup();

	//launching the ChromeBrowser
	WebDriver driver = new ChromeDriver();

	//This timeout is used to specify the time the driver should wait while searching for an element if it is not immediately present.
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//launching the web application
	driver.get("https://www.redbus.in/");

	// maximize the page
	driver.manage().window().maximize();

	//Expected year,month,date defining in three different format
	String year = "2023";
	String month = "September";
	String date = "24";

	//Opens the date picker
	driver.findElement(By.xpath("//input[@id = 'onward_cal']")).click();

	//if it is matching expected month and year then it will break the loop if it is not matching then it will click arrow mark until get the expected month & year
	while(true)
	{
	//here storing two different values month & year
	String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

	//split is java method using for some gap b/w month and year is there like Mar 2023 and store these two values into String array.
	String arr[] = monthyear.split(" ");
	//we are extracting in the String format
	String mon = arr[0];
	String yr = arr[1];

	//comparing these two values with our expected values.
	if(month.contains(mon) && yr.equals(year))
	break;
	else
	driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
	}
	//Date Selection
	List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));

	for(WebElement ele : allDates)
	{
	String dt = ele.getText();

	if(dt.equals(date))
	{
	ele.click();
	break;
	}
	}

	}
}
