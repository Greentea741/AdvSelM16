package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	//right click-go to source-generate getters and setters
	public WebElement getUserTxtbox() {
		return userTxtbox;
	}

	public WebElement getPasswordTxtbox() {
		return passwordTxtbox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(name = "user_name")
	private WebElement userTxtbox;
	
	@FindBy(name = "user_password")
	private WebElement passwordTxtbox;
	
	@FindBy(id = "submitButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[text()='Powered by vtiger CRM - 5.4.0']")
	private WebElement text;
	
	public WebElement getText() {
		
		return text;
	}
	
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminButton;
	
	public WebElement getAdminButton() {
		return adminButton;
	}

	@FindBy(linkText = "Sign Out")
	private WebElement signout;

	
	public WebElement getSignout() {
		return signout;
	}
	

}
