package script_Vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomRepo.HomePage;
//import pomRepo.OrganisationPage;

public class Script3_Test extends BaseClass{
	
	@Test(groups = "organisation")
	
	public void script3() throws EncryptedDocumentException, IOException, InterruptedException {
		
		HomePage hp= new HomePage(driver);
		hp.getOrganisationLink().click();
		
		Thread.sleep(2000);
	}

}
