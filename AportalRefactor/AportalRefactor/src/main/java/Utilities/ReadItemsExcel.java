//package Utilities;
//import java.io.File;
//
//import java.io.FileInputStream;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//
//import org.apache.poi.ss.usermodel.Row;
//
//import org.apache.poi.ss.usermodel.Sheet;
//
//import org.apache.poi.ss.usermodel.Workbook;
//
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//
//public class ReadItemsExcel {
//	
//	//String[][] Items=null;
//	
//	public static Object[][]  readExcel(String filePath,String fileName,String sheetName) throws IOException{
//		
//		
//		String[][] tabArray = null;
//	    //Create an object of File class to open xlsx file
//
//	    File file =    new File(filePath+"\\"+fileName);
//
//	    //Create an object of FileInputStream class to read excel file
//
//	    FileInputStream inputStream = new FileInputStream(file);
//
//	    Workbook ItemsWorkkbook = null;
//
//	    //Find the file extension by splitting file name in substring  and getting only extension name
//
//	    String fileExtensionName = fileName.substring(fileName.indexOf("."));
//
//	    //Check condition if the file is xlsx file
//
//	    if(fileExtensionName.equals(".xlsx")){
//
//	    //If it is xlsx file then create object of XSSFWorkbook class
//
//	    	ItemsWorkkbook = new XSSFWorkbook(inputStream);
//
//	    }
//
//	    //Check condition if the file is xls file
//
//	    else if(fileExtensionName.equals(".xls")){
//
//	        //If it is xls file then create object of HSSFWorkbook class
//
//	    	ItemsWorkkbook = new HSSFWorkbook(inputStream);
//
//	    }
//
//	    //Read sheet inside the workbook by its name
//
//	    Sheet ItemSheet = ItemsWorkkbook.getSheet(sheetName);
//
//	    //Find number of rows in excel file
//
//	    int rowCount = ItemSheet.getLastRowNum()-ItemSheet.getFirstRowNum();
//
//	    //Create a loop over all the rows of excel file to read it
//
//	    for (int i = 1; i < rowCount+1; i++) {
//
//	        Row row = ItemSheet.getRow(i);
//
//	        //Create a loop to print cell values in a row
//
//	        for (int j = 0; j < row.getLastCellNum(); j++) {
//
//	            //Print Excel data in console
//	        	//Items[i][j]=(row.getCell(j).getStringCellValue());
//	           System.out.print(row.getCell(j).getStringCellValue()+"|| ");
//	        	//System.out.print( Items[i][j]+" ");
////
//	        }
//
//	        System.out.println();
//	    }
//		return tabArray;
//	
//	    
//	 //   return ItemsArray;
//
//	    }  
//
//	    //Main function is calling readExcel function to read data from excel file
//
////	    public static void main(String...strings) throws IOException{
////
////	    //Create an object of ReadGuru99ExcelFile class
////
////	    	ReadItemsExcel objExcelFile = new ReadItemsExcel();
////
////	    //Prepare the path of excel file
////
////	   String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\Utilities";
//    //Call read file method of the class to read data
//
//     ReadItemsExcel.readExcel(filePath,"Items.xlsx","Sheet1");
//     
//	     
//
//	    }
//
//	}
//
