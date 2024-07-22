package com.LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1. Create fileinputstream object
		FileInputStream fis=new FileInputStream("./src/test/resources/config.properties");
		
		//create property file object
		Properties p=new Properties();
		
		//load your data
		p.load(fis);
		
		//fetch data
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = p.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Log in")).click();
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		driver.findElement(By.id("Email")).sendKeys(username,Keys.TAB,password,Keys.ENTER);
		
	}

}
