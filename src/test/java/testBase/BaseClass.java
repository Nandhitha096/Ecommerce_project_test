package testBase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://www.bestbuy.com/?intl=nosplash");
		driver.manage().window().maximize();
	
		
	}
	
	public static boolean isURLBroken(String urlCheck) {
        try {
            URL url = new URL(urlCheck);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            return (responseCode >= 400);  // Returns true if the response code is 400 or above
        } catch (IOException e) {
            e.printStackTrace();
            return true;  // Consider the URL broken in case of an exception
        }
     
	}
	
	/*@AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/
	
	public String randomeString()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomeNumber()
	{
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	
	public String randomeAlphaNumeric()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return (generatedString+"@"+generatedNumber);
	}
}
