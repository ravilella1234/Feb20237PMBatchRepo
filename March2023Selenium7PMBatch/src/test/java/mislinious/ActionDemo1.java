package icici.loans.carloans;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo1 
{
	public static WebDriver driver;
	public static Actions a;
	
//  **************************  Mouse operations   ****************************
	
	//Mouse Hover Element
	public static void mouseOverElement(String locator)
	{
		 driver.get("https://www.amazon.in");
		 a = new Actions(driver);
		 WebElement e = driver.findElement(By.xpath(locator));
		 a.moveToElement(e).perform();
	}
	
	//Drag & Drop Element
	public static void dragAndDropElement(String sourceLocator,String targetLocator)
	{
		 a = new Actions(driver);
		 driver.get("https://jqueryui.com/droppable/");
		 driver.switchTo().frame(0);
		 WebElement drag = driver.findElement(By.id(sourceLocator));
		 WebElement drop = driver.findElement(By.id(targetLocator));
		 
		//a.dragAndDrop(drag, drop).perform();
		  a.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
	}
	
	//Slidebar Element
	public static void slidebarElement(String locator, String frameLocator)
	{
		a = new Actions(driver);
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.className(frameLocator)));
		WebElement loc = driver.findElement(By.id(locator));
		
		// a.dragAndDropBy(loc, 200, 0).perform();
		  a.clickAndHold(loc).moveByOffset(100, 0).release(loc).build().perform();
	}
	
	//RightClick Element
	public static void rightClickElement(String locator)
	{
		a = new Actions(driver);
		driver.get("https://jqueryui.com/slider/");
		WebElement loc = driver.findElement(By.linkText(locator));
		a.contextClick(loc).perform();
	}
	
	//DoubleClick Element
	public static void doubleClickElement(String locator) 
	{
		a = new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement loc = driver.findElement(By.id(locator));
		loc.sendKeys("HarryPotter");
		a.doubleClick(loc).perform();
	}
	
	//  **************************  Keyboard operations   ****************************
	
	//keyEnter
	public static void keyEnter(String locator)
	{
		a = new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement loc = driver.findElement(By.id(locator));
		loc.sendKeys("HarryPotter");
		a.sendKeys(loc, Keys.ENTER).perform();
	}
	
	//keyTab
	public static void keyTab(String locator)
	{
		a = new Actions(driver);
		driver.get("https://www.facebook.com/");
		WebElement loc = driver.findElement(By.id(locator));
		loc.sendKeys("ravilella");
		a.sendKeys(Keys.TAB).perform();
	}
	
	//Combining Keys - Select all, copy, paste
	public static void selectAll(String locator1, String locator2) throws Exception
	{
		a = new Actions(driver);
		driver.get("https://www.facebook.com/");
		WebElement loc1 = driver.findElement(By.id(locator1));
		WebElement loc2 = driver.findElement(By.id(locator2));
		loc1.sendKeys("ravi");
		Thread.sleep(4000);
		loc1.sendKeys(Keys.CONTROL + "a");
		loc1.sendKeys(Keys.CONTROL + "c");
		loc2.sendKeys(Keys.CONTROL + "v");
	}
	
	public static void keyDown(String locator) throws Exception
	{
		a = new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement loc = driver.findElement(By.id(locator));
		loc.sendKeys("HarryPotter");
		
		for(int i=0;i<5;i++)
		{
			a.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
			System.out.println(loc.getAttribute("innerHTML"));
			if(loc.getAttribute("innerHTML").contains("harry potter book 1"))
				//a.sendKeys(Keys.ENTER).build().perform();
				a.moveToElement(loc).doubleClick().perform();
		}
	}
	
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		/*mouseOverElement("//span[text()='Prime']");
		dragAndDropElement("draggable", "droppable");
		slidebarElement("slider","demo-frame");
		rightClickElement("Droppable");
		doubleClickElement("twotabsearchtextbox");
		keyEnter("twotabsearchtextbox");
		keyTab("email");
		selectAll("email","pass");*/
		keyDown("twotabsearchtextbox");
	}

	

}
