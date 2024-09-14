package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilClass {
	
	
	public static WebDriver driver;
	public String sheetName;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName;
	public String testDescription;
	public String testCategory;
	public String testAuthor;

	public static Object[][] ExcelReader(String sheetName) throws IOException
	{
        String loc = System.getProperty("C:\\Users\\91893\\eclipse-workspace\\EcommerceV1");
        FileInputStream ins = new FileInputStream(loc + "/ExcelSheet/BestBuy.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(ins);
        XSSFSheet sh = wb.getSheet(sheetName);

        int row = sh.getPhysicalNumberOfRows();
        int column = sh.getRow(0).getPhysicalNumberOfCells();
        Object[][] data = new Object[row][column];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++) 
            {
                data[i][j] = sh.getRow(i).getCell(j).toString(); // Use .toString() to handle cell values of various types
            }
        }

        ins.close(); 
        return data;
    }
	
	
	/*public static String readProperty(String key) throws Exception {
		String projectPath = System.getProperty("user.dir");
		File file = new File(projectPath + "/configBestBuy.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		return prop.get(key).toString();
	}*/
	
	
	public static void crossBrowserValidation(String browser) 
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
			
		} 
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("--headless");
			driver = new FirefoxDriver(options);
		} 
		else if (browser.equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else 
		{
			System.out.println("Default Browser (Chrome) - Opening Chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	}

	
}
