package com.PracticeDatadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream("./src/test/resources/commondata.properties");
		Properties p= new Properties();
		p.load(fis);
		String Url = p.getProperty("url");
		String userTxtBox = p.getProperty("username");
		String pswd = p.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		Thread.sleep(2000);
		driver.findElement(By.name("user_name")).sendKeys(userTxtBox);
		driver.findElement(By.name("user_password")).sendKeys(pswd);
		driver.findElement(By.id("submitButton")).click();
		Actions ac=new Actions(driver);
		WebElement hover = driver.findElement(By.linkText("More"));
		ac.moveToElement(hover).perform();
		
				
		

	}

}
