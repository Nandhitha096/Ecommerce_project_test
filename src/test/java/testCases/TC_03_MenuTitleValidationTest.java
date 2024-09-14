package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObject.MenuPage;
import testBase.BaseClass;

public class TC_03_MenuTitleValidationTest extends BaseClass {

	
	@Test (dataProvider="getFromExcel", priority = 3)
	public void menu_navigation(String menuTitle, String expectedTitle)
	{
		MenuPage mp = new MenuPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		

		
		
	}
	
}
