package com.LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insertmultipledatatoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		XSSFWorkbook xs = new XSSFWorkbook(fis);
		XSSFSheet sheet = xs.getSheet("Sheet4");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for (int i = 0; i < links.size(); i++) {
			XSSFCell cell = xs.getSheet("Sheet4").createRow(i).createCell(0);
			cell.setCellValue(links.get(i).getAttribute("href"));
			
		}
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data.xlsx");
		xs.write(fos);
		xs.close();

	}

}
