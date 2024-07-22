package genericlib;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import pomRepo.LoginPage;

@Listeners(Listeners1.class)
public class BaseClass {
	
	
	public static WebDriver driver;
	public static WebdriverUtil wb=new WebdriverUtil();
	public static ExcelUtil um=new ExcelUtil();
	public static JavaUtil ja=new JavaUtil();
	public static ExtentSparkReporter reporter;
	public static ExtentReports reports;
	public ExtentTest test;
	
	
@BeforeSuite(alwaysRun = true)
	
public void beforeSuite() {
	Reporter.log("Report generation",true);
	
	reporter= new ExtentSparkReporter(IConstant.reportpath);
	reports = new ExtentReports();
	reports.attachReporter(reporter);
}
@Parameters("browser")
@BeforeClass(alwaysRun = true)
public void beforeClass(@Optional("chrome") String bname) throws IOException {
	if(bname.contains("chrome")) {
	driver= new ChromeDriver();
	}
	else if (bname.contains("firefox")) {
		driver=new FirefoxDriver();
	}
	else if (bname.contains("edge")) {
		
		driver=new EdgeDriver();
	}
	wb.maximizeTheWindow(driver);
	wb.implicitlyWait(driver);
	driver.get(um.getDataFromPropertyFile("url"));
}

@BeforeMethod(alwaysRun = true)
public void beforeMethod(Method method) throws IOException {
	test = reports.createTest(method.getName());
	LoginPage lp= new LoginPage(driver);
	lp.getUserTxtbox().sendKeys(um.getDataFromPropertyFile("username"));
	lp.getPasswordTxtbox().sendKeys(um.getDataFromPropertyFile("password"));
	lp.getLoginButton().click();	
}

@AfterMethod(alwaysRun = true)
public void afterMethod() throws InterruptedException {
	LoginPage lp= new LoginPage(driver);
	lp.getAdminButton().click();
	Thread.sleep(2500);
	lp.getSignout().click();
}

@AfterClass(alwaysRun = true)
public void afterClass() {
	wb.closethenrowsermethod(driver);;
}

@AfterSuite(alwaysRun = true)
public void afterSuite() {
	Reporter.log("report close",true);
	reports.flush();
}

}