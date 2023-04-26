package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor 
{

	public static void main(String[] args) 
	{
		ChromeOptions option  = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='ravilella'");
		
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		js.executeScript("window.scrollBy(0,200)");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		js.executeScript("document.getElementById('u_0_5_8u').scrollIntoView()");
		
		js.executeScript("window.history.back()");
		
		js.executeScript("window.history.forward()");
		
		js.executeScript("window.history.go(0)");

	}

}
