package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLogin 
{
	@FindBy(id="reg_email") public WebElement userEmail;
	@FindBy(id="reg_password") public WebElement userPass;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]") public WebElement loginButton;
	
	public CustomerLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void customerLogin()
	{
		userEmail.sendKeys("qatest7463746@gmail.com");
		userPass.sendKeys("password");
		//loginButton.click();
	}

}
