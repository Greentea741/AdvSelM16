package com.LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.google.common.collect.Multiset.Entry;

public class Insertdatausingmap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		XSSFWorkbook xs=new XSSFWorkbook(fis);
		XSSFSheet sheet = xs.getSheet("Sheet6");
		LinkedHashMap<String, String>map=new LinkedHashMap<String, String>();
		map.put("Anurag", "Dmp");
		map.put("Anoushka", "Dmp");
		map.put("krishna", "dmp");
		int row=0;
		for(Entry<String, String>m:map.entrySet()) {
			
			XSSFRow rownum = sheet.createRow(row++);
			rownum.createCell(0).setCellValue((String)m.getKey());
			rownum.createCell(1).setCellValue((String)m.getValue());
			
		}
FileOutputStream fos=new FileOutputStream("./src/test/resources/data.xlsx");
xs.write(fos);
xs.close();

	}

}
