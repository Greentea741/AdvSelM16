package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {
	
	public OrganisationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateOrganisation() {
		return CreateOrganisation;
	}

	public WebElement getOrgNameTxtBox() {
		return orgNameTxtBox;
	}

	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreateOrganisation;
	
	@FindBy(name = "accountname")
	private WebElement orgNameTxtBox;
	
	@FindBy(name = "industry")
	private WebElement industryDropdown;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(id = "phone")
	private WebElement getPhoneTxtBox;
	
	@FindBy(id = "email")
	private WebElement getEmailTxtBox;
	
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement getCreateOrgnText;

	public WebElement getGetCreateOrgnText() {
		return getCreateOrgnText;
	}
	public WebElement getGetPhoneTxtBox() {
		return getPhoneTxtBox;
	}
	public WebElement getGetEmailTxtBox() {
		return getEmailTxtBox;
	}
	

}
