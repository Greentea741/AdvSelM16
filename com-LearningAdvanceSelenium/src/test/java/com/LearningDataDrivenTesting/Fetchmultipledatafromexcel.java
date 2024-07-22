package com.LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fetchmultipledatafromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		XSSFWorkbook xs = new XSSFWorkbook(fis);
		XSSFSheet sheet = xs.getSheet("Sheet3");
		int rownum = sheet.getPhysicalNumberOfRows();
		int colnum = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rownum;i++) {
			
			for(int j=0;j<colnum;j++)
			{
				XSSFCell cell = sheet.getRow(i).getCell(j);
				DataFormatter data=new DataFormatter();
				System.out.println(data.formatCellValue(cell));
			}
		}
		

	}

}
