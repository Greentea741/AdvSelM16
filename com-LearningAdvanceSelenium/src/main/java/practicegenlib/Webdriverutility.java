package practicegenlib;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverutility {
	
	public void maximizeTheWindowmethod(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void refreshThePagemethod(WebDriver driver) {
		driver.navigate().refresh();
	}
	public void forwardThePagemethod(WebDriver driver) {
		driver.navigate().forward();
	}
	public void implicitlyWaitmethod(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void elementClickableWaitmethod(WebDriver driver, WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void elementToBeSelectedWaitmethod(WebDriver driver, WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	public void switchFramemethod(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchBackFramemethod(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	public void selectDropdownByValuemethod(WebElement element, String value) {
		Select sel= new Select(element);
		sel.selectByValue(value);
	}
	public void selectDropdownByVisibleTextmethod(WebElement element, String text) {
		Select sel= new Select(element);
		sel.selectByVisibleText(text);
	}
	public void deSelectDropdownByValuemethod(WebElement element, String value) {
		Select sel= new Select(element);
		sel.deselectByValue(value);
	}
	public void acceptAlertmethod(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void dismissAlertmethod(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void rightClickonElementmethod(WebDriver driver, WebElement element) {
		
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
		
	}
	public void scrollDownWindowmethod(WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		
	}
	public void scrollUpWindowmethod(WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500);");
		
	}
	public void closethewindowmethod(WebDriver driver) {
		
		driver.quit();
	}
    public void closethenrowsermethod(WebDriver driver) {
		
		driver.close();
	}
	

}
