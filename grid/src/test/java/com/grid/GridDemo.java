package com.grid;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridDemo 
{
	WebDriver driver = null;
	
  @Test
  public void test1() throws Exception 
  {
	  System.out.println("Starting test1");
	  WebDriverManager.firefoxdriver().setup();
	 // System.setProperty("webdriver.gecko.driver", "C:\\Users\\ravi\\Downloads\\geckodriver.exe");
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	 driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test1");
  }
  
  
  @Test
  public void test2() throws Exception 
  {
	  System.out.println("Starting test2");
	  WebDriverManager.firefoxdriver().setup();
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\ravi\\Downloads\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	 driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test2");
  }
  
  @Test
  public void test3() throws Exception 
  {
	  System.out.println("Starting test3");
	  WebDriverManager.firefoxdriver().setup();
	 // System.setProperty("webdriver.gecko.driver", "C:\\Users\\ravi\\Downloads\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	 driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test3");
  }
  
  
  @Test
  public void test4() throws Exception 
  {
	  System.out.println("Starting test4");
	  WebDriverManager.firefoxdriver().setup();
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\ravi\\Downloads\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	 driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test4");
  }
  
  @Test
  public void test5() throws Exception 
  {
	  System.out.println("Starting test5");
	 WebDriverManager.firefoxdriver().setup();
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\ravi\\Downloads\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	 driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test5");
  }
  
  @Test
  public void test6() throws Exception 
  {
	  System.out.println("Starting test6");
	  WebDriverManager.firefoxdriver().setup();
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\ravi\\Downloads\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	 driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test6");
  }
}
