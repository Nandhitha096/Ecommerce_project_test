package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement Account;
	
	@FindBy(xpath="//a[normalize-space()='Create Account']")
	WebElement register;
	
	@FindBy(xpath="//a[normalize-space()='Sign In']")
	WebElement login;
	
	
	public void clickAccount()
	{
		Account.click();
	}
	
	public void clickRegister()
	{
		register.click();
	}
	
	public void clicksignIn()
	{
		login.click();
	}
	
}
