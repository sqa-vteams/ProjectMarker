package AportalTestClasses;

import org.testng.annotations.Test;

import AportalLocatorClasses.LoginPage;
import BasePackage.BaseClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Testlogin {
	
	WebDriver driver;
	BaseClass ObjBase= new BaseClass(driver);
	LoginPage Objlogin;
	
  @Test
  public void LoginToAportal() {
	 
		Objlogin= new LoginPage(driver);
		Objlogin.setUsername("developer");
		Objlogin.setPassword("qatest_bfmr");
		Objlogin.ClickLogin();
	   
  }
  @BeforeTest
  public void beforeMethod() {
	  
	  this.driver=ObjBase.LaunchBrowser();
	//  this.driver=ObjBase.LoginSetup();
	  
	  
  }

  @AfterTest
  public void afterMethod() {
   //   driver.quit();
  }

}
