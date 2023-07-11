package miscellaneous;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MagicBricks {
	

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magicbricks.com/");
		driver.findElement(By.id("rentheading")).click();
		List<WebElement> options = driver.findElements(By.cssSelector("div#staticSwiperSliderRent li"));
		System.out.println("Total size : " +  options.size());
		Random r = new Random();
		//System.out.println(r.nextInt(100)); // 0-99
		int n = r.nextInt(options.size());
		System.out.println(options.get(n).getText());
		options.get(n).click();
	}

}
