package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MenuPage extends BasePage {

	public MenuPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Best Buy Outlet']")
	WebElement bestBuyOutletOpt;

	@FindBy(xpath ="//a[@class='universal-nav-link'][normalize-space()='Best Buy Business']")
	WebElement bestBuyBusinessOpt;
	
	@FindBy(xpath="//a[@class='universal-nav-link'][normalize-space()='Shop with an Expert']")
	WebElement shopOpt;
	
	@FindBy(xpath="//a[normalize-space()='Top Deals']")
	WebElement topDealsOpt;
	
	@FindBy(xpath="//a[normalize-space()='Deal of the Day']")
	WebElement dealOfTheDayopt;
	
	@FindBy(xpath="//span[normalize-space()='More']")
	WebElement moreDropdown;
	
	 @FindBy(xpath ="//li[contains(@class,'liDropdownList')]//a")
	 List<WebElement> moreOptions;  // List to store all dropdown options
	
	 
	

}
	

	
