package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	@FindBy(id="reg_email") public WebElement userEmail;
	@FindBy(id="reg_password")public WebElement userPassword;
	@FindBy(name="register")public WebElement register;
	
	public RegisterPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void customerRegistration()
	{
		userEmail.sendKeys("ravilella.1981@gail.com");
		userPassword.sendKeys("ravi1234");
		register.click();
	}

}
