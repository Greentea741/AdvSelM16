package com.LearningDataDrivenTesting;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fetchsingledtatfromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		
		XSSFWorkbook xs = new XSSFWorkbook(fis);
		
		System.out.println(xs.getSheet("Sheet1").getRow(5).getCell(2).getBooleanCellValue());
		
	

	}
}