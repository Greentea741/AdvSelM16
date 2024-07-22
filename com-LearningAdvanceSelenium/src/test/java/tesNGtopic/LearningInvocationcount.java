package tesNGtopic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericlib.ExcelUtil;
import genericlib.WebdriverUtil;
import pomRepo.LoginPage;

public class LearningInvocationcount {
	
	//helper attribute
	
	@Test(invocationCount=3)
	public void script() throws IOException {
		
		WebDriver driver=new ChromeDriver();
		WebdriverUtil wb=new WebdriverUtil();
		ExcelUtil um=new ExcelUtil();
		wb.maximizeTheWindow(driver);
		driver.get(um.getDataFromPropertyFile("url"));
		LoginPage lp=new LoginPage(driver);
		lp.getUserTxtbox().sendKeys(um.getDataFromPropertyFile("username"));
		lp.getPasswordTxtbox().sendKeys(um.getDataFromPropertyFile("password"));
		lp.getLoginButton().click();
	}
	
		
		
	}


