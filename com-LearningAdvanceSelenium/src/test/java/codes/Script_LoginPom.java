package codes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.WebdriverUtil;
import pomRepo.LoginPage;

public class Script_LoginPom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		WebdriverUtil wb= new WebdriverUtil();
		ExcelUtil um= new ExcelUtil();
		wb.maximizeTheWindow(driver);
		driver.get(um.getDataFromPropertyFile("url"));
		LoginPage lp=new LoginPage(driver);
		lp.getUserTxtbox().sendKeys(um.getDataFromPropertyFile("username"));
		lp.getPasswordTxtbox().sendKeys(um.getDataFromPropertyFile("password"));
		lp.getLoginButton().click();

	}

}