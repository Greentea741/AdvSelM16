package script_Vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass;
//import pomRepo.HomePage;
import pomRepo.OrganisationPage;
import pomRepo.ProductPage;

public class Script5 extends BaseClass{
	
	@Test(groups = "organisation")

	public void script5() throws EncryptedDocumentException, IOException, InterruptedException {
		
		ProductPage pp= new ProductPage(driver);
		
		
		pp.getProductLink().click();
		pp.getCreateProduct().click();
		pp.getProductName().sendKeys(um.getDataFromExcelFile("Products", 0, 0));
		OrganisationPage op= new OrganisationPage(driver);
		op.getSaveButton().click();
	}
}
