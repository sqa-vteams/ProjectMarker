package AportalTestClasses;


import org.openqa.selenium.io.FileHandler;



import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AportalLocatorClasses.ItemsPage;
import AportalLocatorClasses.LoginPage;
import BasePackage.BaseClass;
import Utilities.ExcelModel;
import Utilities.ExcelUtils;

public class TestItems implements ITestListener{

	public WebDriver driver;
	BaseClass ObjBase= new BaseClass(driver);
	
	LoginPage Objlogin;
	
	ExcelUtils ObjExcel;
	
	public static String ItemName;
	public	static String ItemColor;
	public	static String ItemModel;
	public	static String ItemQBSKU;
	public	static String ItemUPC;
	public	static String ItemASIN;
	public	static String ItemSerialNumber;
	public	static String ItemLink;




	@Test(priority=0)
	public void CreateItem() throws Exception {
		ItemsPage ObjItem= new ItemsPage(driver);
		

		ObjItem.ClickItemsPage();
		ExcelUtils ObjExcel= new ExcelUtils(driver);
		
		ArrayList<ExcelModel> model = ObjExcel.readItemsFromExcel();
		TestItems.AddItem(model);

		ObjItem.ClickCreateItem();
		ObjItem.SetItemName(ItemName);                                    
		ObjItem.SetItemColor(ItemColor);
		ObjItem.SetItemModel(ItemModel);
		ObjItem.SetItemQBSKU(ItemQBSKU);
		ObjItem.SetItemUPC(ItemUPC);
		//ObjItem.SetItemASIN(ItemASIN);
		ObjItem.SetItemSerialNumber(ItemSerialNumber);
		Thread.sleep(2000);
		ObjItem.ClickCategoryDropDown();
		Thread.sleep(2000);
		ObjItem.ClickCategoryTablets();
		Thread.sleep(2000);
		ObjItem.AddLinkClick();
		ObjItem.ItemVednorDropDown();
		//ObjItem.ScrollBottom();
		ObjItem.SelectItemVendor();
		ObjItem. SetItemLink(ItemLink);
		ObjItem.SaveItemClick();
		Thread.sleep(6000);
		ObjItem.ScrollTop();
		Thread.sleep(2000);
		ObjItem.ClickListingsStatus();
		Thread.sleep(2000);
		ObjItem.ClickActiveStatus();
		Thread.sleep(4000);
		ObjItem.VerifyItem("Apple Ipad 10.2 inch 128gb");
		Thread.sleep(2000);
//	//	ObjItem.ClickReloadItems();		
//	//  Thread.sleep(2000);

	}
	
	public static Boolean AddItem(ArrayList<ExcelModel> modelList)
	{
		ItemName=modelList.get(0).IName;
		ItemColor=modelList.get(0).IColor;
		ItemModel=modelList.get(0).IModel;
		ItemQBSKU=modelList.get(0).IQBSKU;
		ItemUPC=modelList.get(0).IUPC;
		//ItemASIN=modelList.get(0).IASIN;
		ItemSerialNumber=modelList.get(0).ISerialNumber;
		ItemLink=modelList.get(0).ILink;
	
	//	System.out.println(ItemName);
		
		return true;
	}
	
	
//	@Test(priority=1)
//	public void DraftItem() throws Exception {
//
//		ItemsPage ObjItem= new ItemsPage(driver);
//		ObjItem.ClickEditItem();
//		System.out.println("Items Click ");
//		Thread.sleep(2000);
//		ObjItem.ClickItemStatus();
//		ObjItem.ClickDraftStatus();
//		ObjItem.SaveItemClick();
//		Thread.sleep(2000);
//		ObjItem.ClickListingsStatus();
//		Thread.sleep(2000);
//		ObjItem.ClickListingsDraftStatus();
//		Thread.sleep(5000);
//		ObjItem.VerifyItem("Nothing To verify");
//		Thread.sleep(2000);
//
//	}



//	@Test(priority=2)
//	public void InactiveItems() throws Exception {
//		ItemsPage ObjItem= new ItemsPage(driver);
//		ObjItem.ClickEditItem();
//		ObjItem.ClickItemStatus();
//		Thread.sleep(2000);
//		ObjItem.ClickInactiveStatus();
//		ObjItem.SaveItemClick();
//		ObjItem.ClickListingsStatus();
//		Thread.sleep(2000);
//		ObjItem.ClickListingsInactivetStatus();
//		Thread.sleep(2000);
//		ObjItem.VerifyItem("Nothing To verify");
//		Thread.sleep(2000);
//
//
//
//
//	}

//	@Test(priority=3)
//	public void CompactListings() throws InterruptedException {
//
//		ItemsPage ObjItem= new ItemsPage(driver);
//		ObjItem.ClickCompactListings();
//		Thread.sleep(3000);
//		ObjItem.ClickCompactListings();
//		Thread.sleep(3000);
//
//
//	}

	@BeforeMethod
	public void beforeClass() {

		this.driver=ObjBase.LaunchBrowser();
		
		Objlogin= new LoginPage(driver);
		//System.out.println("In @test");
		Objlogin.LoginToAportal("developer", "qatest_bfmr");


	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test Failed");
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy-mm-hh-ss");
			Date date = new Date();
			String date1= dateFormat.format(date);
			capture(driver,"S1"+date1);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@AfterMethod
	public void afterClass()
	{
		//driver.quit:  
	}






	public static String capture(WebDriver driver,String screenShotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationPath=System.getProperty("user.dir")+"/TestReport/screenshots/"+screenShotName+".png";
		File destination=new File(destinationPath);
		FileHandler.copy(source, destination);
		return destinationPath;
	}



}




