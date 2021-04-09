package AportalTestClasses;

import org.testng.annotations.Test;

import AportalLocatorClasses.DealsPage;
import AportalLocatorClasses.LoginPage;
import AportalLocatorClasses.ShipmentsPage;
import BasePackage.BaseClass;
import Utilities.ExcelModel;
import Utilities.ExcelUtils;
import Utilities.Log;

import org.testng.annotations.BeforeClass;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class TestShipments {
	private static WebDriver driver;
	BaseClass ObjBase= new BaseClass(driver);
	LoginPage Objlogin;
	public static String ShipTrackingNumber;
	public static String ShipUserEmail;
	public static String ShipKHNotes;
	public static String PayTrackingNumber;
	public static String PayUserEmail;
	public static String PayAmount;
	public static String PayAmount1;
	public static String PayAmount2;
	public static String PayAmount3;
	public static String PayAmount4;
	
  @Test (priority=0)
  public void CreatShipment() throws Exception {
	  
	  Log.startTestCase("CreateShipment");
	  ShipmentsPage ObjShip= new ShipmentsPage(driver);
	 // ExcelUtils ObjExcel= new ExcelUtils(driver);
	//  ArrayList<ExcelModel> model = ObjExcel.readShipmentsFromExcel();
	  //TestShipments.AddShipment(model);
	  
	  ObjShip.ClickShipmentsPage();
	  Log.info("****************************************Shipments Page has been Clicked ************************************************");
	  Thread.sleep(2000);
	  ObjShip.ClickCreateShipments();
	  Log.info("****************************************Create Manual has been Clicked ************************************************");
	  Thread.sleep(2000);
	 // ShipTrackingNumber = "TBA326"+ ShipmentsPage.randomWithRange(1,1000000000);
	  ShipTrackingNumber="TBA462146214610";
	  ObjShip.SetTrackingNumber(ShipTrackingNumber);
	  Log.info("****************************************Tracking Number Has been Entered ************************************************");
	  Thread.sleep(2000);
	  ObjShip.SetSenderEmail("farhanahmed.projectmarker@gmail.com");
	  Log.info("****************************************Sender Email has been set ************************************************");
	  Thread.sleep(5000);
	  ObjShip.SetStatus();
	  Log.info("****************************************Status has been Saved ************************************************");
	  Thread.sleep(2000);
	  ObjShip.SetKHNotes("Test KH Notes");
	  Log.info("****************************************KH Notes has been Added ************************************************");
	  Thread.sleep(2000);
	 ObjShip.SaveShipment();
	  Log.info("****************************************Shipments has been Saved ************************************************");

	  Thread.sleep(5000);
	  ObjShip.VerifyShipment(ShipTrackingNumber);
	  
	  

	  
	  
  }
  
  
  @Test(priority=1)
  public void CreatePayment() throws Exception
  {
	  ShipmentsPage ObjShip= new ShipmentsPage(driver);
	 // ExcelUtils ObjExcel= new ExcelUtils(driver);
	 // ArrayList<ExcelModel> model = ObjExcel.readPaymentsFromExcel();
	// TestShipments.AddPayment(model);
	  
	  Log.startTestCase("CreatePayment");
	  ObjShip.ClickShipmentsPage();
	  Log.info("****************************************Shipments Page has been Clicked ************************************************");

	  Thread.sleep(2000);
	  ObjShip.ClickCreateShipments();
	  Log.info("****************************************Manual Shipment Creation has been Clicked ************************************************");

	  Thread.sleep(2000);
	  ObjShip.ClickPaymentTab();
	  Log.info("****************************************PaymentTab  has been Clicked ************************************************");

	  Thread.sleep(2000);
	  PayTrackingNumber = "TBA326"+ ShipmentsPage.randomWithRange(1,1000000000);
	  ObjShip.SetTracking(PayTrackingNumber);
	  Log.info("****************************************Tracking Number has been Set ************************************************");
      
	  Thread.sleep(2000);
	  ObjShip.SetTitle();
	  Thread.sleep(2000);
	  ObjShip.SetUserEmail("farhanahmed.projectmarker@gmail.com");
	  Log.info("****************************************User Email has been Set ************************************************");

	  Thread.sleep(5000);
	  ObjShip.SetAmount("120");
	  
	  Log.info("****************************************Payment Amoutn has been Added ************************************************");

	  Thread.sleep(2000);
	  ObjShip.SavePayment();
	  
	  Log.info("****************************************Payment Has been Saved ************************************************");
	  Thread.sleep(5000);
	  
	  ObjShip.VerifyPayment(PayTrackingNumber);
  }
  
  
//  @Test(priority=2)
//  public void EditShipment() throws Exception
//  {
//	  ShipmentsPage ObjShip= new ShipmentsPage(driver);
//	  ObjShip.ClickShipmentsPage();
//	  Log.info("****************************************Shipments Page has been Clicked ************************************************");
//	  Thread.sleep(2000);
//	  ObjShip.SearchTrackingNumber(ShipTrackingNumber);
//	  Log.info("****************************************Shipments has been Searched ************************************************");
//	  Thread.sleep(2000);
//	  ObjShip.EditTracking();
//	  Log.info("****************************************Editing has been Done ************************************************");
//	  Thread.sleep(2000);
//	  ObjShip.VerifyMerge(ShipTrackingNumber);
//	  Log.info("****************************************Merge has been Verified ************************************************");
//	  
//	  
//  }
  
  @Test(priority=2)
  public void EditUserEmail() throws Exception
  {
	  ShipmentsPage ObjShip= new ShipmentsPage(driver);
	  ObjShip.ClickShipmentsPage();
	  Log.info("****************************************Shipments Page has been Clicked ************************************************");
	  Thread.sleep(2000);
	  ObjShip.SearchTrackingNumber(ShipTrackingNumber);
	  Log.info("****************************************Shipments has been Searched ************************************************");
	  Thread.sleep(2000);
	  ObjShip.EditEmail();
	  Thread.sleep(4000);
	  ObjShip.VerifyEmail();
	  
	 
  }
  
  @Test(priority=3)
  public void EditSubmission() throws Exception
  {
	  ShipmentsPage ObjShip= new ShipmentsPage(driver);
	  ObjShip.ClickShipmentsPage();
	  Log.info("****************************************Shipments Page has been Clicked ************************************************");
	  Thread.sleep(2000);
	  ObjShip.SearchTrackingNumber(ShipTrackingNumber);
	  Log.info("****************************************Shipments has been Searched ************************************************");
	  Thread.sleep(2000);
	  ObjShip.EditSubmissionDate();
	  Thread.sleep(5000);
	  ObjShip.VerifyDate();
	  
  }
  
  
  
  @Test(priority=4)
  public void ChangeStatus() throws Exception
  {
	  ShipmentsPage ObjShip= new ShipmentsPage(driver);
	  ObjShip.ClickShipmentsPage();
	  Log.info("****************************************Shipments Page has been Clicked ************************************************");
	  Thread.sleep(2000);
	  ObjShip.SearchTrackingNumber(ShipTrackingNumber);
	  Log.info("****************************************Shipments has been Searched ************************************************");
	  Thread.sleep(2000);
	  ObjShip.EditStatus();
	  Thread.sleep(2000);
	  ObjShip.VerifyStatus();
	  
  }
  
  
  @BeforeClass
 public void beforeClass() {
	  
	  
	  this.driver=ObjBase.LaunchBrowser();
	  
		Log.info("****************************************Browser has been initiated ************************************************");
		
		Objlogin= new LoginPage(driver);
		
		Objlogin.LoginToAportal("farhan", "qatest_603");
		
		Log.info("****************************************Login Done Via Developer Account  ************************************************");
  }

  @AfterClass
  public void afterClass() {
	//driver.quit:  
  }
  
  
//  public static Boolean AddShipment(ArrayList<ExcelModel> modelList)
// 	{
//	  ShipTrackingNumber=modelList.get(0).ShipmentTrackingNumer;
//	  ShipUserEmail=modelList.get(0).ShipmentUserEmail;
//	  ShipKHNotes=modelList.get(0).ShipmentKHNotes;
//		
// 		return true;
// 	}

//  public static Boolean AddPayment(ArrayList<ExcelModel> modelList)
//	{
//	  PayTrackingNumber=modelList.get(0).PaymentTrackingNumber;
//	  PayUserEmail=modelList.get(0).PaymentSenderEmail;
//	  PayAmount=modelList.get(0).PaymentAmount;
//		
//		return true;
//	}

  
  
}
