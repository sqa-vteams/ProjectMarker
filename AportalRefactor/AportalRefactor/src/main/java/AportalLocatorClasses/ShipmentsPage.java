package AportalLocatorClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.Log;

public class ShipmentsPage {
	
	
	By btnShipmentsPageClick=By.xpath("/html/body/div[1]/div/div/div/aside/div/nav/ul/li[5]/a");
	By btnCreateShipmentClick=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/header[2]/div/a");
	By txtTrackingNumber=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[1]/form/div[1]/div/div[1]/div/textarea");
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
    By txtClearSearch=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/header[1]/div/div/div[7]/button[1]");		
    By btnDealDetails=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[3]");
    By btnEditTrackingNumber=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/header/div/i");
    
   // /html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/header/div/i
    By btnYes=By.xpath("/html/body/div[3]/div/div[3]/button[1]");
    
    
    By txtTrackingEdit=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/header/div/div[1]/input");
    By clkAddNotes=By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[4]/header/div/button/span");
    By txtNotes=By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div[1]/div/textarea");
    By btnSave=By.xpath("/html/body/div[1]/div/div[3]/div/div/div[3]/button[2]/span");
    By btnEditSenderEmail=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/div[1]/p/i");
    
    
    By txtEmail=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    
   // By btnEditDate=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[8]/div/div[1]/p/i");
    By btnEditDate=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[9]/div/div[1]/p/i");
//    By txtEditDate=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[8]/div/div[2]/div/div[1]/input");
    By txtEditDate=By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[9]/div/div[2]/div/div[1]/input");
    
//    By btnDate=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[8]/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/span/div/button[1]/span[2]");
    
    By btnDate=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[9]/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/span/div/button[1]/span[2]");
    
    By btnSaveDate=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[9]/div/div[2]/div/div[2]/div/div[2]/button");
    
    
    By btnCurrentStatus=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/header/div/span/span");
    
    By btnClosedStatus=By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div");
    
  //  /html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]
    
    
    
    public WebDriver driver;
    String AcutalShipment="";
    String AcutalPayment="";
    String ActualEmail="";
    String ActualDate="";
    String ActualStatus="";
    String TrackingError="";
    
    public ShipmentsPage(WebDriver driver)
	{
		this.driver=driver;                                                   //Constructor without argument
	}
	
    public static int randomWithRange(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
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
    
    public void SaveShipment() throws InterruptedException
    {
    	driver.findElement(btnSaveShipment).click();
    	TrackingError=driver.getPageSource();
    	if (TrackingError.contains(" is already noted"))
    	{
    		Thread.sleep(2000);
    		driver.findElement(btnYes).click();
    	}
    	else
    	{
    		// Do Nothing
    	}
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
     
     
     
     
     public void VerifyShipment(String shipmentTrackingNumber) throws Exception
		{
    	 driver.findElement(txtSearchField).clear(); 
    	 driver.findElement(txtSearchField).sendKeys(shipmentTrackingNumber); 
    	 driver.findElement(txtSearchField).sendKeys(Keys.ENTER); 
    	 Thread.sleep(7000);
    	 
    	 AcutalShipment=driver.getPageSource();
			
				Assert.assertTrue(AcutalShipment.contains(shipmentTrackingNumber));
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
    	 Thread.sleep(8000);
    	 
 	 AcutalPayment=driver.getPageSource();
			
				Assert.assertTrue(AcutalPayment.contains(TrackingNumber));
			{
				Log.info("***************************************Payment has been Verified  ************************************************");
				System.out.println("Payment has been Verified"); 
			}

			
			
		}
     
     public void SearchTrackingNumber(String TrackingNumber) throws Exception
     {
    	 driver.findElement(txtClearSearch).click();
    	 Thread.sleep(3000);
    	 driver.findElement(txtSearchField).sendKeys(TrackingNumber); 
    	 driver.findElement(txtSearchField).sendKeys(Keys.ENTER); 
    	 Thread.sleep(5000);
    	 driver.findElement(btnDealDetails).click();
    	 Thread.sleep(2000);
    	 
     }
     
     public void EditTracking() throws Exception
     {
    	 driver.findElement(btnEditTrackingNumber).click();
    	 Thread.sleep(2000);
    	 driver.findElement(btnYes).click();
    	 Thread.sleep(2000);
    	 driver.findElement(txtTrackingEdit).clear();
    	 Thread.sleep(2000);
    	 driver.findElement(txtTrackingEdit).sendKeys("TBA202120212000"); 
    	 driver.findElement(txtTrackingEdit).sendKeys(Keys.ENTER); 
    	 Thread.sleep(2000);
    	 driver.findElement(btnYes).click();
    	 
     }
     
     public void EditEmail() throws Exception
     {
    	 driver.findElement(btnEditSenderEmail).click();
    	 Thread.sleep(2000);
    	 driver.findElement(txtEmail).click();
    	// driver.findElement(txtEmail).clear();
    	// Thread.sleep(2000);
    	 driver.findElement(txtEmail).sendKeys("ifrah@mailinator.com");
    	 Thread.sleep(2000);
         driver.findElement(txtEmail).sendKeys(Keys.ENTER);
    	// Thread.sleep(2000);
    	
    	 driver.findElement(btnSave).click();
    	 Thread.sleep(2000);
    	 
    	 
//    	 driver.findElement(DropDownUserEmail).click();
//  		driver.findElement(DropDownUserEmail).sendKeys(UserEmail); 
//  		driver.findElement(DropDownUserEmail).sendKeys(Keys.ENTER); 
//    	 
     }
     
     public void VerifyEmail() throws Exception
     {
    	 ActualEmail=driver.getPageSource();
			
			Assert.assertTrue(ActualEmail.contains("ifrah@mailinator.com"));
		{
			Log.info("****************************************Email has been Verified  ************************************************");
			System.out.println("Email has been Verified"); 
		}
    	 
     }
      
     public void VerifyMerge(String TrackingNumber) throws Exception
     {
    	 driver.findElement(btnShipmentsPageClick).click();
    	 Thread.sleep(2000);
    	 driver.findElement(txtClearSearch).click();
    	 driver.findElement(txtSearchField).sendKeys(TrackingNumber); 
    	 driver.findElement(txtSearchField).sendKeys(Keys.ENTER); 
    	 Thread.sleep(5000);
    	 
    	 AcutalPayment=driver.getPageSource();
			
			Assert.assertTrue(AcutalPayment.contains("No records found"));
		{
			Log.info("***************************************Tracking number has been merged ************************************************");
			System.out.println("TrackingNumber has been merged"); 
		}

		
		
     }
     
     
     public void EditSubmissionDate() throws Exception
     {
    	 driver.findElement(btnEditDate).click();
    	 Thread.sleep(2000);
    	 driver.findElement(btnYes).click();
    	 Thread.sleep(2000);
    	 driver.findElement(txtEditDate).click();
    	 Thread.sleep(2000);
    	 driver.findElement(btnDate).click();
    	 Thread.sleep(2000);
    	 driver.findElement(btnSaveDate).click();
    	 Thread.sleep(2000);
     }
     
     
     public void VerifyDate() throws Exception
     {
    	 ActualDate=driver.getPageSource();
			
			Assert.assertTrue(ActualDate.contains("04/1/2021 "));
		{
			Log.info("****************************************Date has been Verified  ************************************************");
			System.out.println("Date has been Verified"); 
		}
    	 
     }
     
     
     public void EditStatus() throws Exception
     {
    	 driver.findElement(btnCurrentStatus).click();
    	 Thread.sleep(2000);
    	 driver.findElement(btnClosedStatus).click();
    	 Thread.sleep(2000);
    	 driver.findElement(btnYes).click();
    	 Thread.sleep(2000);
     }
     
     public void VerifyStatus() throws Exception
     {
    	 ActualStatus=driver.getPageSource();
			
			Assert.assertTrue(ActualStatus.contains("Closed No"));
		{
			Log.info("****************************************Status has been Verified  ************************************************");
			System.out.println("Status has been Verified"); 
		}
    	 
     } 
     
     
     
     
}

