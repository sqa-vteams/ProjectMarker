package AportalLocatorClasses;

import org.openqa.selenium.By;

import Utilities.Log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DealsPage {
	
	By btnDealsPageClick=By.xpath("/html/body/div[1]/div/div/div/aside/div/nav/ul/li[4]/a/span");
	By btnCreateDealClick=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/header[1]/div/a");
	By txtDealTitle=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div[1]/div/div[1]/div/input");
	By txtDealSubtitle=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div[2]/div/div[1]/div/input");
	By txtDealValue=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div[3]/div[1]/div/div/div[1]/div/input");
	By dropdownRetailType=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div[3]/div[2]/div/div/div[1]/div[1]/div[1]");
	By txtRetailType=By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div");
	By dropdownVendor=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/form/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div[1]/input[1]");
	By txtVendorName=By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div");
	By dropdownItem=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/form/div[2]/div[1]/div/div/div[3]/div/div/div[1]/div[1]/input[1]");
	By txtItemName=By.xpath("/html/body/div[1]/div/div[4]/div/div/div/div");
	By btnPublishDeal=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/form/div[6]/button[3]");
	By txtCreatedDeal=By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/table/tbody/tr[1]/td[5]");
	By btnEditDeal=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/table/tbody/tr[1]/td[3]/a");
	By btnCalendarClick=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/form/div[5]/div[1]/div/div/div[1]/input");
	By btnDateSelection=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/form/div[5]/div[1]/div/div/div[2]/div/div[2]/div[1]/div/div[3]/span/div/button[31]/span[2]");
	By btnSaveDate=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/form/div[5]/div[1]/div/div/div[2]/div/div[3]/button");
	By btnUpdateDeal=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/form/div[7]/button[2]");
	By chkboxDeal=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/table/tbody/tr[1]/td[1]/div/div/div/div/div");
	By btnComposeEmail=By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/div/div[1]/header[1]/div/button[2]");
	By btnSendEmail=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div/button[2]");
			

	
	public WebDriver driver;


	String AcutalDealName="";
	String ItemName="";

	public DealsPage(WebDriver driver)
	{
		this.driver=driver;                                                   //Constructor without argument
	}
	
	public void ClickDealsPage()
	{
		driver.findElement(btnDealsPageClick).click();                   //Method to find element and login click
	}
	public void ClickCreateDeal()
	{
		driver.findElement(btnCreateDealClick).click();
	}
	public void SetDealTitle(String DealTitle)
	{   driver.findElement(txtDealTitle).clear();
		driver.findElement(txtDealTitle).sendKeys(DealTitle); 
	}
	
	public void SetDealSubTitle(String DealSubTitle)
	{   driver.findElement(txtDealSubtitle).clear();
		driver.findElement(txtDealSubtitle).sendKeys(DealSubTitle); 
	}
	
	public void SetDealvalue(String DealValue)
	{
		driver.findElement(txtDealValue).clear();
		driver.findElement(txtDealValue).sendKeys(DealValue);
	}
	
	public void ClickRetailTypeDropDown()
	{
		driver.findElement(dropdownRetailType).click();	
	}
	
	public void SelectRetailType()
	{
		driver.findElement(txtRetailType).click();	
    }
	
	public void ClickVendorDropDown()
	{
		driver.findElement(dropdownVendor).click();	
	}
	
	public void SelectVednorName()
	{
		driver.findElement(txtVendorName).click();	
    }
	
	public void ClickItemDropDown()
	{
		driver.findElement(dropdownItem).click();	
	}
	
	public void SelectItemName(String ExcelItem) throws Exception
	
	{  
		driver.findElement(txtItemName).click();
		ItemName=driver.getPageSource();
		Assert.assertTrue(ItemName.contains(ExcelItem));
		{
			Log.info("****************************************Item Name has Been Verified  ************************************************");
		}
		
	}
//		ItemName=driver.findElement(txtItemName).getText();
//		System.out.println(ItemName);
//		if (ItemName==ExcelItem)
//		{
//			System.out.println("Item Name Found");
//    }
//		else
//		{
//			System.out.println("Item Name not Found");	
//		}
//	}
	 public void ClickPublish()
	 {
		 driver.findElement(btnPublishDeal).click();
	 }
	
	 public void VerifyDeal(String VisibleDealName) throws Exception
		{
			AcutalDealName=driver.getPageSource();
			
				Assert.assertTrue(AcutalDealName.contains(VisibleDealName));
			{
				Log.info("****************************************Deal has been Verified  ************************************************");
			}

			
			
		}
	 
	 public void ScrollTop()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-1000)", "");
		}
     public void ClickEditDeal()
     {
    	 driver.findElement(btnEditDeal).click();
     }
     public void ClickCalendar()
     {
    	 driver.findElement(btnCalendarClick).click();
     }

     public void SelectDate()
     {
    	 driver.findElement(btnDateSelection).click();
     }
     public void ClickSaveDate()
     {
    	 driver.findElement(btnSaveDate).click();
     }
     
     public void ClickUpdateDeal()
     {
    	 driver.findElement(btnUpdateDeal).click();
     }
 
     public void SelectDeal()
     {
    	 driver.findElement(chkboxDeal).click();
     }
     
     public void ClickCompose()
     {
    	 driver.findElement(btnComposeEmail).click();
     }
     
     public void ClickSend()
     {
    	 driver.findElement(btnSendEmail).click();
     }
}




