package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email_address;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement login_password;
	
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement signin_button;
	
	
	public void setEmail(String eaddress)
	{
		email_address.sendKeys(eaddress);
	}
	
	public void setLoginPassword(String lpass)
	{
		login_password.sendKeys(lpass);
	}
	
	public void clickSignin()
	{
		signin_button.click();
	}
}
