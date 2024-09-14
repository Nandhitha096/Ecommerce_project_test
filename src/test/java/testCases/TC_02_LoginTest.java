package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC_02_LoginTest extends BaseClass {

	
	@Test( priority = 2)
	public void verify_account_login(String emailId, String Password)
	{
		
		HomePage hp = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		hp.clickAccount();
		hp.clicksignIn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		LoginPage lp = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		lp.setEmail("nandhitha123@gmail.com");
		lp.setLoginPassword("Abc@123");
		lp.clickSignin();
	}
}
