package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CreateNewAccountPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MenuPage;
import testBase.BaseClass;

public class TC_01_AccountRegistrationTest extends BaseClass{
	
	
	
	@Test (priority = 1)
	public void verify_account_reg()
	{
		HomePage hp = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		String urlToCheck = "https://www.bestbuy.com/?intl=nosplash";
		try {
            driver.get(urlToCheck);
            boolean isBroken = isURLBroken(urlToCheck);
            if (isBroken)
            {
                System.out.println("The URL is broken with status code 400");
             } 
            else 
            {
                System.out.println("The URL is valid with status code 200");
             }
			 }catch(Exception e)
    		 {
    			System.out.println("Exception handeled for the URL validation");
       		 }
        
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

		hp.clickAccount();
		hp.clickRegister();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		CreateNewAccountPage cnp = new CreateNewAccountPage(driver);
		cnp.setFirstName("Test");
		cnp.setLastName("user");
		//cnp.setEmail(randomeString()+"@gmail.com");
		cnp.setEmail("nandhu00998865@gmail.com");
		cnp.setPassword("PassowrdAtHomePage@12345");
		cnp.setConfirmPassword("PassowrdAtHomePage@12345");
		cnp.setPhoneNumber(randomeNumber());
		//cnp.clickAccountRecoveryCheck();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		cnp.clickCreateAccountButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		String cnfmsg = cnp.getConfirmationmsg();
		Assert.assertEquals(cnfmsg, "Welcome back.");
		

     }
	
}