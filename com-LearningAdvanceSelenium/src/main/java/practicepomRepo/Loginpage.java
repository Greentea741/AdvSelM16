package practicepomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public Loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "user_name")
	private WebElement usertextbox;
	
	public WebElement getUsertextbox() {
		return usertextbox;
	}

	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getAdminButton() {
		return adminButton;
	}

	public WebElement getSignout() {
		return signout;
	}

	@FindBy(name = "user_password")
	private WebElement passwordtextbox;
	
	@FindBy(id = "submitButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[text()='Powered by vtiger CRM - 5.4.0']")
	private WebElement text;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminButton;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signout;
	

}
