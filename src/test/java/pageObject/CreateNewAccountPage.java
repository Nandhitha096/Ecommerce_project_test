package pageObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class CreateNewAccountPage extends BasePage {

	public CreateNewAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='reenterPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement phone;
	
	@FindBy(xpath="//label[normalize-space()='Use for Account Recovery.']")
	WebElement accountRecoveryCheckbox;
	
	@FindBy(xpath="//button[normalize-space()='Create an Account']")
	WebElement submitButton;
	
	@FindBy(xpath="//span[@class='welcome-banner__welcome-back']")
	WebElement confirmation;
	
	
	public void setFirstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	
	public void setEmail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void setConfirmPassword(String cnfpass)
	{
		confirmPassword.sendKeys(cnfpass);
	}
	
	public void setPhoneNumber(String contact)
	{
		phone.sendKeys(contact);
	}
	
	public void clickAccountRecoveryCheck()
	{
		accountRecoveryCheckbox.click();
	}
	
	public void clickCreateAccountButton()
	{
		submitButton.click();
	}
	
	
	
	public String getConfirmationmsg()
	{
		try {
			return (confirmation.getText())	;
		}catch(Exception e)
		{
			return (e.getMessage());
		}
		
	}
	
	
	
}
