package Utilities;

import java.util.ArrayList;

public class ExcelModel {
	
public	String IName;
public	String IColor;
public	String IModel;
public	String IQBSKU;
public	String IUPC;
public	String IASIN;
public	String ISerialNumber;
public	String ILink;
public String DTitle;
public String DSub;
public String Dvalue;
public int RowNumber=3;

//public String[] DTitle = new String[RowNumber];
	
public String[] DTitles= new String[RowNumber]; 
public String[] DSubs= new String[RowNumber];
public String[] DValues= new String[RowNumber];
public String[] INames= new String[RowNumber];

	public static ExcelModel getExcelModel() {
		return new ExcelModel();
	}

}
