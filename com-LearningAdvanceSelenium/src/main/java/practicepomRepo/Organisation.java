package practicepomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisation {
public Organisation(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement CreateOrganisation;

@FindBy(name = "accountname")
private WebElement orgNameTxtBox;

@FindBy(name = "industry")
private WebElement industryDropdown;

@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement saveButton;

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

}
