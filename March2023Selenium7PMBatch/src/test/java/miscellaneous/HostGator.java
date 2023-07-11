package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HostGator 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hostgator.in/dedicated-servers-windows.php");
		WebElement element = driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-6 col-md-7 text-center']/a"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",element);
		List<WebElement> prices = driver.findElements(By.cssSelector("div.selected-term"));
		System.out.println(prices.get(0).getText());
	}

}
