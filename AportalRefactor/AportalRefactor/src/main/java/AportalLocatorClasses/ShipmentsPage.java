package AportalLocatorClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.Log;

public class ShipmentsPage {
	
	
	By btnShipmentsPageClick=By.xpath("/html/body/div[1]/div/div/div/aside/div/nav/ul/li[5]/a");
	By btnCreateShipmentClick=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/header[2]/div/a");
	By txtTrackingNumber=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[1]/form/div[1]/div/div[1]/div/input");
	By DropDownSenderEmailclick=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[1]/form/div[2]/div/div[1]/div[1]/input[1]");
	//By txtSenderEmail=
    By DropDownStatusClick=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[1]/form/div[3]/div/div[1]/div[1]/div[1]");
    By txtPendingStatus=By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div");
    By txtKHnotes=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[1]/form/div[5]/div/div[1]/div/textarea");
    By btnSaveShipment=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[2]/button[2]/span");
    
    By btnPaymentClick=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/a[2]");
    By txtPaymentTrackingNumber=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div/div[1]/div/input");
    By DropDowntitle=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/form/div[2]/div/div[1]/div[1]/div[1]");
    By txtTitle=By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div");
    By DropDownUserEmail=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/form/div[3]/div/div[1]/div[1]/input[1]");
    By txtAmount=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/form/div[4]/div/div[1]/div/input");
    By btnSavePayment=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/button[2]/span");
    By txtSearchField=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/header[1]/div/div/div[1]/div/div/div/div[1]/input");
    By txtClearSearch=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/header[1]/div/div/div[6]/button[1]");		
    		
    public WebDriver driver;
    String AcutalShipment="";
    String AcutalPayment="";
    
    public ShipmentsPage(WebDriver driver)
	{
		this.driver=driver;                                                   //Constructor without argument
	}
	
    public void ClickShipmentsPage()
	{
		driver.findElement(btnShipmentsPageClick).click();                   
	}
    
    public void ClickCreateShipments()
	{
		driver.findElement(btnCreateShipmentClick).click();
	}
    
    public void SetTrackingNumber(String TrackingNumber)
	{   driver.findElement(txtTrackingNumber).clear();
		driver.findElement(txtTrackingNumber).sendKeys(TrackingNumber); 
	}
    
    public void SetSenderEmail(String SenderEmail)
    {
    	driver.findElement(DropDownSenderEmailclick).click();
		driver.findElement(DropDownSenderEmailclick).sendKeys(SenderEmail); 
		driver.findElement(DropDownSenderEmailclick).sendKeys(Keys.ENTER); 
    }
    
    public void SetStatus()
    {
    	driver.findElement(DropDownStatusClick).click();
		driver.findElement(txtPendingStatus).click();
    }
    public void SetKHNotes(String KHNotes)
    {
    	driver.findElement(txtKHnotes).sendKeys(KHNotes);
    	
    }
    
    public void SaveShipment()
    {
    	driver.findElement(btnSaveShipment).click();
    }
    
    public void ClickPaymentTab()
    {
    	driver.findElement(btnPaymentClick).click();
    }
    
     public void SetTracking(String TrackingNumber)
     {
    	 driver.findElement(txtPaymentTrackingNumber).clear();
 		driver.findElement(txtPaymentTrackingNumber).sendKeys(TrackingNumber); 
     }
     
     public void SetTitle()
     {
     	driver.findElement(DropDowntitle).click();
 		driver.findElement(txtTitle).click();
     }
     
     public void SetUserEmail(String UserEmail)
     {
     	driver.findElement(DropDownUserEmail).click();
 		driver.findElement(DropDownUserEmail).sendKeys(UserEmail); 
 		driver.findElement(DropDownUserEmail).sendKeys(Keys.ENTER); 
     }
     
     public void SetAmount(String Amount)
     {
    	 driver.findElement(txtAmount).sendKeys(Amount); 
     }
     
     public void SavePayment()
     {
    	 driver.findElement(btnSavePayment).click();
     }
     
     
     public void VerifyShipment(String TrackingNumber) throws Exception
		{
    	 driver.findElement(txtSearchField).clear(); 
    	 driver.findElement(txtSearchField).sendKeys(TrackingNumber); 
    	 driver.findElement(txtSearchField).sendKeys(Keys.ENTER); 
    	 Thread.sleep(5000);
    	 
    	 AcutalShipment=driver.getPageSource();
			
				Assert.assertTrue(AcutalShipment.contains(TrackingNumber));
			{
				Log.info("****************************************Shipment has been Verified  ************************************************");
				System.out.println("Shipment has been Verified"); 
			}

			
			
		}
     
     
     
     public void VerifyPayment(String TrackingNumber) throws Exception
		{
    	 
    	 
    	 
    	 driver.findElement(txtClearSearch).click();
    	 Thread.sleep(3000);
    	 driver.findElement(txtSearchField).sendKeys(TrackingNumber); 
    	 driver.findElement(txtSearchField).sendKeys(Keys.ENTER); 
    	 Thread.sleep(5000);
    	 
 	 AcutalPayment=driver.getPageSource();
			
				Assert.assertTrue(AcutalPayment.contains(TrackingNumber));
			{
				Log.info("***************************************Payment has been Verified  ************************************************");
				System.out.println("Payment has been Verified"); 
			}

			
			
		}
}

