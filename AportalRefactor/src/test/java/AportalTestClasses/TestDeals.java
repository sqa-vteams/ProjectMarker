package AportalTestClasses;

import org.testng.annotations.Test;

import AportalLocatorClasses.DealsPage;
import AportalLocatorClasses.LoginPage;
import BasePackage.BaseClass;
import Utilities.ExcelModel;
import Utilities.ExcelUtils;
import Utilities.Log;
//import Utilities.Log;
//import Utilities.Log;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class TestDeals {
	
	private static WebDriver driver;
	BaseClass ObjBase= new BaseClass(driver);
	LoginPage Objlogin;
	public static int RowCount=3;
	
	public static String[] DealTitle= new String[RowCount];
	public static String[] DealSubTitle=new String[RowCount];
	public static String[] DealValue=new String[RowCount];
	public static String[] ItemName=new String[RowCount];
<<<<<<< HEAD
	

=======
	public static String sample;
	public static String sample1;
>>>>>>> refs/remotes/origin/master
	
//	
//	@Test(priority=0)
//	public void Function()
//	{
//		System.out.println("123");
//	}
	
  @Test(priority=0)
  public void CreateDeal() throws Exception {
	  
	  Log.startTestCase("CreateDeals");
	  
	  DealsPage ObjDeal= new DealsPage(driver);
	  
	  ExcelUtils ObjExcel= new ExcelUtils(driver);
		
		ArrayList<ExcelModel> model = ObjExcel.readDealsFromExcel();
		TestDeals.AddDeal(model);
		for (int i=1 ; i<RowCount ; i++ )
		{
			
		
	  ObjDeal.ClickDealsPage();
	  Log.info("****************************************Deals Page has been Clicked ************************************************");
	  ObjDeal.ClickCreateDeal();
	  Log.info("****************************************New Deal Form has been opened ************************************************");
	  ObjDeal.SetDealTitle(DealTitle[i]);
	  Log.info("****************************************Deal Title has been enterd ************************************************");
	  ObjDeal.SetDealSubTitle(DealSubTitle[i]);
	  Log.info("****************************************Deal Sub Title has been enterd ************************************************");
	  ObjDeal.SetDealvalue(DealValue[i]);
	  Log.info("****************************************Deal Value has been enterd ************************************************");
	  ObjDeal.ClickRetailTypeDropDown();
	  Thread.sleep(1000);
	  ObjDeal.SelectRetailType();
	  Log.info("****************************************Retail Type Selected ************************************************"); 
	  ObjDeal.ClickVendorDropDown();
	  Thread.sleep(1000);
	  ObjDeal.SelectVednorName();
	  Log.info("****************************************Vednor has been Selected ************************************************");
	  ObjDeal.ClickItemDropDown();
	  Thread.sleep(1000);
	  ObjDeal.SelectItemName(ItemName[i]);
	  Log.info("****************************************Item Name has been Selected ************************************************");
	  ObjDeal.ClickPublish();
	  Log.info("****************************************Deal has been Published ************************************************");
	  Thread.sleep(5000);
	  ObjDeal.ScrollTop();
	  ObjDeal.VerifyDeal(DealTitle[i]);
	  Thread.sleep(5000);
	  
  }
	  
	  
	  
  }
  
  @Test(priority=1)
  public void SendNewsletterEmail() throws Exception
  {
	  DealsPage ObjDeal= new DealsPage(driver);
	  Log.startTestCase("SendNewsletterEmail");
	  ObjDeal.SelectDeal();
	  Log.info("****************************************Deals Page has been Selected ************************************************");
	  Thread.sleep(3000);
	  ObjDeal.ClickCompose();
	  Log.info("****************************************Compose Newsletter Button has been Clicked ************************************************");
	  Thread.sleep(3000);
	  ObjDeal.ClickSend();
	  Log.info("****************************************Newsletter Emails have been dispatched ************************************************");
  }
  
  
//  @Test(priority=1)
//  public void EditDeal() throws Exception 
//  
//      {
//	  DealsPage ObjDeal= new DealsPage(driver);
//	  ObjDeal.ClickEditDeal();
//	  Thread.sleep(2000);
//	  ObjDeal.ClickCalendar();
//	  Thread.sleep(2000);
//	  ObjDeal.SelectDate();
//	  Thread.sleep(2000);
//	  ObjDeal.ClickSaveDate();
//	  Thread.sleep(2000);
//	  ObjDeal.ClickUpdateDeal();
//	  
//	  
//      }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  this.driver=ObjBase.LaunchBrowser();
	  
		Log.info("****************************************Browser has been initiated ************************************************");
		
		Objlogin= new LoginPage(driver);
		
		Objlogin.LoginToAportal("developer", "qatest_bfmr");
		
		Log.info("****************************************Login Done Via Developer Account  ************************************************");
  }

  @AfterClass
  public void afterClass() {
	  
	//driver.quit:  
  }
  
  
  public static Boolean AddDeal(ArrayList<ExcelModel> modelList)
	{
	  for (int i=1 ; i<RowCount ; i++ )
	  {
		  
	  
	    DealTitle[i]=modelList.get(0).DTitles[i];
	  //  System.out.println( DealTitle[i]);
	    DealSubTitle[i]=modelList.get(0).DSubs[i];
	    //System.out.println(DealSubTitle[i]);
	    DealValue[i]=modelList.get(0).DValues[i];
	    //System.out.println(DealValue[i]);
	    ItemName[i]=modelList.get(0).INames[i];
		
	  }
		return true;
	}

}
