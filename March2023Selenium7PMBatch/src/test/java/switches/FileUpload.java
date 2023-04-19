package switches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload 
{

	public static void main(String[] args) throws Exception 
	{
		ChromeOptions option  = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver(option);
		  driver.manage().window().maximize();
		  driver.get("https://transfer.pcloud.com/");
		  driver.findElement(By.linkText("Click here to add files")).click();
		  Thread.sleep(3000);
		  Runtime.getRuntime().exec("C:\\Users\\ravi\\Desktop\\up1.exe");
	}

}
