package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action3 
{

	public static void main(String[] args) 
	{
		ChromeOptions option  = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement drag = driver.findElement(By.id("slider"));
		
		Actions a = new Actions(driver);
		//a.dragAndDropBy(drag, 100, 0).perform();
		a.clickAndHold(drag).moveByOffset(100, 0).release(drag).build().perform();
		
		
		driver.switchTo().defaultContent();
		WebElement loc = driver.findElement(By.linkText("Selectable"));
		a.contextClick(loc).perform();
	}

}
