package codes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.JavaUtil;
import genericlib.WebdriverUtil;
import pomRepo.HomePage;
import pomRepo.LoginPage;
import pomRepo.OrganisationPage;

public class Script_OrgUsingPom1 {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		WebdriverUtil wb= new WebdriverUtil();
		ExcelUtil um= new ExcelUtil();
		wb.maximizeTheWindow(driver);
		wb.implicitlyWait(driver);
		driver.get(um.getDataFromPropertyFile("url"));
		LoginPage lp= new LoginPage(driver);
		lp.getUserTxtbox().sendKeys(um.getDataFromPropertyFile("username"));
		lp.getPasswordTxtbox().sendKeys(um.getDataFromPropertyFile("password"));
		lp.getLoginButton().click();
		Thread.sleep(2000);
		HomePage hp=new HomePage(driver);
		hp.getOrganisationLink().click();
		OrganisationPage op= new OrganisationPage(driver);
		
		op.getCreateOrganisation().click();
		Thread.sleep(2000);
		JavaUtil ja= new JavaUtil();
		int num = ja.getRandonNumber();
		op.getOrgNameTxtBox().sendKeys(um.getDataFromExcelFile("Organisation", 0, 0)+num);
		Thread.sleep(3000);
		wb.selectDropdownByValue(op.getIndustryDropdown(), "Healthcare");
		Thread.sleep(3000);
		op.getSaveButton().click();

	}

}
