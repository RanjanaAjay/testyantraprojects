package com.excel;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProvider{

	public static void main(String[] args) {
		String path="c://excel"
		FileInputStream fis=new FileInputStream(path);
		WorkBook workbook = WorkbookFactory.create(fis);Sheet sh=workBook.getSheet("Sheet1");
		
		
	}

}
