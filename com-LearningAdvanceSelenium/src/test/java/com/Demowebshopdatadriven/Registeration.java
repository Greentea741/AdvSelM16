package com.Demowebshopdatadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registeration {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties pro = new Properties();
		pro.setProperty("url", "https://demowebshop.tricentis.com/");
		pro.setProperty("firstname", "anurag");
		pro.setProperty("lastname", "dmp");
		pro.setProperty("email", "anuragdmp02@gmail.com");
		pro.setProperty("password", "Aeroplane@2024");
		pro.setProperty("cnfpassword", "Aeroplane@2024");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/regdata.properties");
		pro.store(fos, "regdata");
		
		FileInputStream fis=new FileInputStream("./src/test/resources/regdata.properties");
		pro.load(fis);
		
		WebDriver driver=new ChromeDriver();
		String url = pro.getProperty("url");
		String firstname = pro.getProperty("firstname");
		String lastname = pro.getProperty("lastname");
		String email = pro.getProperty("email");
		String password = pro.getProperty("password");
		
	
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	driver.findElement(By.id("FirstName")).sendKeys(firstname);
	driver.findElement(By.id("LastName")).sendKeys(lastname);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
	//driver.findElement(By.id("register-button")).click();
	
	
		

	}

}
