package Utilities;


import java.awt.List;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelUtils {
	

	
	   public WebDriver driver;
	   
	   public ExcelUtils(WebDriver driver)
		{
			this.driver=driver;                                                   //Constructor without argument
		}
			 ExcelModel model = ExcelModel.getExcelModel();
		   
			 public ArrayList<ExcelModel> readItemsFromExcel() throws IOException {
					// Specify the path of file
					File src = new File("C:\\Users\\Farhan\\eclipse-workspace\\AportalRefactor\\src\\main\\java\\Utilities\\Items.xlsx");
					
					// load file
					FileInputStream fi = new FileInputStream(src);
					// Load workbook
					XSSFWorkbook workbook = new XSSFWorkbook(fi);
					// Load Sheet
					XSSFSheet sheet = workbook.getSheet("Sheet1");
					ArrayList<ExcelModel> modelList = new ArrayList<ExcelModel>();
					int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

					for (int i = 1; i < rowCount + 1; i++) {
						//ExcelModel excelModel = new ExcelModel();
						XSSFRow row = sheet.getRow(i);
			/*			excelModel.fname = row.getCell(0).toString();
						excelModel.lname = row.getCell(1).toString();
						excelModel.email = row.getCell(2).toString();
						excelModel.mobile = row.getCell(3).toString();*/
					
						model.IName = row.getCell(0).toString();
						model.IColor = row.getCell(1).toString();
						model.IModel = row.getCell(2).toString();
						model.IQBSKU = row.getCell(3).toString();
						model.IUPC = row.getCell(4).toString();
						//model.IASIN = row.getCell(5).toString();
						model.ISerialNumber = row.getCell(5).toString();
						model.ILink = row.getCell(6).toString();
						
						
						modelList.add(model);
					}
					return modelList;
				}
		 
			 public ArrayList<ExcelModel> readDealsFromExcel() throws IOException {
					// Specify the path of file
					File src = new File("C:\\Users\\Farhan\\eclipse-workspace\\AportalRefactor\\src\\main\\java\\Utilities\\Items.xlsx");
					
					// load file
					FileInputStream fi = new FileInputStream(src);
					// Load workbook
					XSSFWorkbook workbook = new XSSFWorkbook(fi);
					// Load Sheet
					XSSFSheet sheet = workbook.getSheet("Sheet2");
					ArrayList<ExcelModel> modelList = new ArrayList<ExcelModel>();
					int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
				//	model.RowNumber=rowCount+1;

					for (int i = 1; i < rowCount+1 ; i++) {
						//int j=0;
						//ExcelModel excelModel = new ExcelModel();
						XSSFRow row = sheet.getRow(i);
			/*			excelModel.fname = row.getCell(0).toString();
						excelModel.lname = row.getCell(1).toString();
						excelModel.email = row.getCell(2).toString();
						excelModel.mobile = row.getCell(3).toString();*/
					//	System.out.println(rowCount);
						model.DTitles[i]=row.getCell(0).toString();
						//model.DTitle=row.getCell(0).toString();
						//model.DTitles[i]=model.DTitle.toString();
						//System.out.println(model.DTitles[i]);
						model.DSubs[i] = row.getCell(1).toString();
						//System.out.println(model.DSubs[i]);
						model.DValues[i]= row.getCell(2).toString();
						//System.out.println(model.DValues[i]);
						//j++;
						model.INames[i]=row.getCell(3).toString();
						
						
						
						modelList.add(model);
					}
					return modelList;
				}
		   
		 
		  }
	


