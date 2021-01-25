package AportalLocatorClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ItemsPage  {


	By btnItemPageClick=By.xpath("/html/body/div/div/div/div/aside/div/nav/ul/li[3]/a");
	By btnDuplicateItem=By.xpath("//*//*[@id=\"main-wrapper\"]/div[2]/div[2]/div/div/div/div[1]/table/tbody/tr[1]/td[1]/button");
	By btnCreateItemClick=By.xpath("//*[@id=\"main-wrapper\"]/div[2]/div[2]/div/div/div/header/div/a");
	By txtItemName=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[1]/div/div[1]/div/input");
	By txtItemColor=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div/div/div[1]/div/input");
	By txtItemModel=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[2]/div[2]/div/div/div[1]/div/input");
	By txtItemQBSKU=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[2]/div[3]/div/div/div[1]/div/input");
	By txtItemUPC=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[2]/div[4]/div/div/div[1]/div/input");
	By txtItemASIN=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[2]/div[5]/div/div/div[1]/div/input");
	By txtItemSerialNumber=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[3]/div[3]/div/div/div[1]/div/input");
	By btnItemAddLink=By.xpath("//*[@id=\"main-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[5]/button/span");
	By btnItemVendor=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[5]/div/div/div[1]/div/div/div[1]/div[1]/input[1]");
	By btnSelectVendor=By.xpath("/html/body/div/div/div[3]/div/div[3]/div/div");
	By txtVendorLink=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[5]/div/div/div[3]/div/div/div[1]/div/input");
	By btnSaveitem=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/button[2]/span");
	By txtCreatedItem=By.xpath("//*[@id=\"main-wrapper\"]/div[2]/div[2]/div/div/div/div[1]/table/tbody/tr[3]/td[2]");
	//By txtCreatedItem=By.xpath("/html/body/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/table/tbody/tr[1]/td[2]");
	By btnReloadItem=By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/div/div/header/div/button[1]/span");
	By btnEditItem=By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[1]/table/tbody/tr[3]/td[1]/a/span");
	By btnItemStatus=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[3]/div[1]/div/div/div[1]/div[1]/div[1]");
	By btnDraftStatus=By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div");
	By btnIemInActiveStatus=By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div");
	//By btnInactiveStatus=By.xpath("/html/body/div/div/div[2]/div/div[3]/div/div");
	//By btnItemListStatus=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/header/div/div[3]/div/div/div[1]/div[1]");
	By btnItemListStatus=By.xpath("//*[@id=\"main-wrapper\"]/div[2]/div[2]/div/div/div/header/div/div[3]/div/div/div[1]/div[1]");
	
	By btnIemDraftStatus=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div");
	By btnCopmactListings=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/header/div/button[2]");
	By btnDraftStatuslist=By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div");
	By btnActiveStatus=By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div");
	
	By btnInActiveStatus=By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div/div");
	By btnSelectCategory=By.xpath("/html/body/div/div/div[1]/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/div[2]/div[5]/div/div/div/div[1]/div[1]");
	By TxtTabletCategory=By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/div[2]/div");
	
	
	public WebDriver driver;


	String AcutalItemName="";

	public ItemsPage(WebDriver driver)
	{
		this.driver=driver;                                                   //Constructor without argument
	}

	public void ClickItemsPage()
	{
		driver.findElement(btnItemPageClick).click();                   //Method to find element and login click
	}

	public void ClickCreateItem()
	{
		driver.findElement(btnCreateItemClick).click();
	}
	public void SetItemName(String ItemName)
	{   driver.findElement(txtItemName).clear();
		driver.findElement(txtItemName).sendKeys(ItemName); 
	}
	public void SetItemColor(String Color)
	{
		driver.findElement(txtItemColor).clear();
		driver.findElement(txtItemColor).sendKeys(Color); 
	}
	public void SetItemModel(String Model)
	{
		driver.findElement(txtItemModel).clear();
		driver.findElement(txtItemModel).sendKeys(Model); 
	}
	public void SetItemQBSKU(String QBSKU)
	{
		driver.findElement(txtItemQBSKU).clear(); 
		driver.findElement(txtItemQBSKU).sendKeys(QBSKU); 
	}
	public void SetItemUPC(String UPC)
	{
		driver.findElement(txtItemUPC).clear();
		driver.findElement(txtItemUPC).sendKeys(UPC); 
	}
	public void SetItemASIN(String ASIN)
	{
		driver.findElement(txtItemASIN).clear();
		driver.findElement(txtItemASIN).sendKeys(ASIN); 
	}
	public void SetItemSerialNumber(String SerialNumber)
	{   
		driver.findElement(txtItemSerialNumber).clear();
		driver.findElement(txtItemSerialNumber).sendKeys(SerialNumber); 
	}
	public void AddLinkClick()
	{
		driver.findElement(btnItemAddLink).click();
	}
	public void ItemVednorDropDown()
	{
		driver.findElement(btnItemVendor).click();
	}
	public void SelectItemVendor()
	{
		driver.findElement(btnSelectVendor).click();
	}
	public void SetItemLink(String VendorLink)
	{
		driver.findElement(txtVendorLink).clear();
		driver.findElement(txtVendorLink).sendKeys(VendorLink);
	}
	public void SaveItemClick()
	{
		driver.findElement(btnSaveitem).click();
	}

//	public void VerifyItem(String VisibleItemName) throws Exception
//	{
//		AcutalItemName=driver.findElement(txtCreatedItem).getText();
//		if(AcutalItemName.equalsIgnoreCase(VisibleItemName))
//
//		{
//			System.out.println("Item Verified");
//		}
//
//		else {
//			System.out.println("Issue Arised here");
//			throw new Exception();
//
//		}
//	}
	
	public void VerifyItem(String VisibleItemName) throws Exception
	{
		AcutalItemName=driver.getPageSource();
		Assert.assertTrue(AcutalItemName.contains(VisibleItemName));
		{
			System.out.println("Item Name Found");
		}
		
	}
	
	
	public void ClickReloadItems()
	{
		driver.findElement(btnReloadItem);
		System.out.println("Items Reloaded");
	}
	
	public void ClickEditItem()
	{
		driver.findElement(btnEditItem).click();
	}
	
	public void ClickItemStatus()
	{
		driver.findElement(btnItemStatus).click();
	}
	
	public void ClickDraftStatus()
	{
		driver.findElement(btnDraftStatus).click();
	}
	
	public void ClickListingsStatus()
	{
		driver.findElement(btnItemListStatus).click();
	}
	
	public void ClickListingsDraftStatus()
	{
		driver.findElement(btnDraftStatuslist).click();
	}
	

   public void ClickInactiveStatus()
   {
	   driver.findElement(btnInActiveStatus).click();;
   }
	
   public void ClickListingsInactivetStatus()
   {
	   driver.findElement(btnIemInActiveStatus).click();
   }
   
   public void ClickCompactListings()
   {
	   driver.findElement(btnCopmactListings).click();
   }
   
   public void ClickActiveStatus()
   {
	   driver.findElement(btnActiveStatus).click();
   }
	
   public void ClickCategoryDropDown()
   {
	   driver.findElement(btnSelectCategory).click();
   }
   public void ClickCategoryTablets()
   {
	   driver.findElement(TxtTabletCategory).click();
   }
   
	public void ScrollTop()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
	}
	
	public void ScrollBottom()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
	}
}




