package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggetionBox 
{

	public static void main(String[] args) 
	{
		ChromeOptions option  = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hadoop tutorial");
		String var = driver.findElement(By.name("q")).getAttribute("value");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li/div[1]/div[2]/div[1]/div[1]/span"));
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equals(var))
			{
				list.get(i).click();
				return;
			}
		}
		
	}

}
