package com.LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Insertdatainexcelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		XSSFWorkbook xs = new XSSFWorkbook(fis);
		xs.getSheet("Sheet2").createRow(0).createCell(0).setCellValue("advselenium");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data.xlsx");
		xs.write(fos);
		xs.close();
		System.out.println("data added to excel sheet");
		
		

	}

}
