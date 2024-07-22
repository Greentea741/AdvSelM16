package com.PracticeDatadriventesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomRepo.OrganisationPage;
//import genericlib.ExcelUtil;
//import genericlib.WebdriverUtil;
import practicegenlib.SampleExcelUtil;
import practicegenlib.Webdriverutility;
import practicepomRepo.Homepage;
import practicepomRepo.Loginpage;
import practicepomRepo.Organisation;

public class PracticeTC4usingpom {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		Webdriverutility wb=new Webdriverutility();
		SampleExcelUtil um=new SampleExcelUtil();
		wb.maximizeTheWindowmethod(driver);
		wb.implicitlyWaitmethod(driver);
		driver.get(um.getDataFromPropertyFile("url"));
		Loginpage lp=new Loginpage(driver);
		lp.getUsertextbox().sendKeys(um.getDataFromPropertyFile("username"));
		lp.getPasswordtextbox().sendKeys(um.getDataFromPropertyFile("password"));
		lp.getLoginButton().click();
		Homepage hp=new Homepage(driver);
		hp.getOrganisationLink().click();
		Organisation op=new Organisation(driver);
		op.getCreateOrganisation().click();
		op.getOrgNameTxtBox().sendKeys(um.getDataFromExcel("Organisation", 0, 0));
		wb.selectDropdownByVisibleTextmethod(op.getIndustryDropdown(), "Healthcare");
		op.getSaveButton().click();
		
	}
	
	
	
	
	
	
	
	

}
