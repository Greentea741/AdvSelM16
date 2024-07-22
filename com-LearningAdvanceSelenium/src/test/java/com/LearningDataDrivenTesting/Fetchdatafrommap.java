package com.LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fetchdatafrommap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		XSSFWorkbook xs=new XSSFWorkbook(fis);
		XSSFSheet sheet = xs.getSheet("Sheet5");
		int row = sheet.getLastRowNum();
		LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
		for(int i=0;i<=row;i++) {
			
			String key = sheet.getRow(i).getCell(0).toString();
			String value = sheet.getRow(i).getCell(1).toString();
			map.put(key, value);
		}

		for(Entry<String, String> m:map.entrySet()) {
			
			System.out.println(m.getKey()+":"+m.getValue());
			
			
		}
	}

}
