package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JobServe 
{

	public static void main(String[] args) 
	{
		String text = "Legal";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jobserve.com/in/en/Job-Search/");
		driver.findElement(By.xpath("//span[@class='ui-dropdownchecklist-text']")).click();
		driver.findElements(By.xpath("//label[contains(text(),'Select All')]")).get(3).click();
		List<WebElement> labels = driver.findElements(By.cssSelector("label[for^='ddcl-selInd-i']"));
		System.out.println("Total Labels : " +  labels.size());
		for(WebElement l:labels)
		{
			if(l.getText().equalsIgnoreCase(text))
			{
				l.click();
				break;
			}
		}
		
	}

}
