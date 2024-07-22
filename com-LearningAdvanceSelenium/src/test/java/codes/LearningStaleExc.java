package codes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.WebdriverUtil;

public class LearningStaleExc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		WebdriverUtil wb=new WebdriverUtil();
		wb.maximizeTheWindow(driver);
		ExcelUtil um=new ExcelUtil();
		driver.get(um.getDataFromPropertyFile("url"));
		driver.findElement(By.name("user_name")).sendKeys(um.getDataFromPropertyFile("username"));
		driver.findElement(By.name("user_password")).sendKeys(um.getDataFromPropertyFile("password"));
		driver.findElement(By.id("submitButton")).click();
		WebElement searchbox = driver.findElement(By.name("query_string"));
		searchbox.sendKeys("contacts");
		wb.refershThePage(driver);
		searchbox.sendKeys("Contacts");

	}

}
