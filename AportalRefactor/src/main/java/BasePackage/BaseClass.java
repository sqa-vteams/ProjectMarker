package BasePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.ExcelUtils;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseClass {


	public WebDriver driver; 

	
	public BaseClass(WebDriver driver)
	{
		this.driver=driver;                                                   //Constructor with argument
	}
	
	 public WebDriver LaunchBrowser() {    
		
		System.setProperty("webdriver.chrome.silentOutput", "true");
		Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.OFF);
		
		     String baseUrl = "https://staging-aportalv2.584wed.com/login";

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farhan\\Documents\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(baseUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			return this.driver;
			
			
//			System.setProperty("webdriver.chrome.silentOutput", "true");
//			Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.OFF);
//			
//			     String baseUrl = "https://staging-aportalv2.584wed.com/login";
//
//				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farhan\\Documents\\chromedriver.exe");
//				driver = new ChromeDriver();
//				driver.get(baseUrl);
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//				return this.driver;
	}
	 
	 
	 
//	 @DataProvider(name = "Authentication")
//	 
//	    public Object[][] Items() throws Exception{
//	 
//	         Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\farhan.ahmed\\eclipse-workspace\\AportalRefactor\\src\\main\\java\\Utilities\\Items.xlsx","Sheet1");
//	 
//	         return testObjArray;
//	 
//	 }
	 
	// @Test(dataProvider = "Authentication")
	 public WebDriver LoginSetup() {    
			
	           driver.findElement(By.id("username")).sendKeys("developer");;	
	           driver.findElement(By.id("password")).sendKeys("qatest_bfmr");
	           driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
				return this.driver;
		}
		 




}