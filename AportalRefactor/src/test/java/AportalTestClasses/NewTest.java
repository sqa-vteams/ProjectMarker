package AportalTestClasses;

import org.testng.annotations.Test;

import AportalLocatorClasses.LoginPage;
import BasePackage.BaseClass;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	
	WebDriver driver;
	
	BaseClass obj= new BaseClass(driver);
	LoginPage Objlogin;
	
  
	@Test
  public void function() 
  
  {
//		Objlogin= new LoginPage(driver);
//		System.out.println("In @test");
//		Objlogin.LoginToAportal("developer", "qatest_bfmr");
		
  }
  
	
	
	
@BeforeMethod
  public void beforeMethod() {
	
	this.driver=obj.LaunchBrowser();
	
	Objlogin= new LoginPage(driver);
	System.out.println("In @test");
	Objlogin.LoginToAportal("developer", "qatest_bfmr");
	
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
