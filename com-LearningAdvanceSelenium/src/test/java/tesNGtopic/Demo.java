package tesNGtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test(priority = -1)
	public void login() {
		Reporter.log("user has login to appn",true);
	}
	@Test(priority = 0)
	public void addtocart() {
		Reporter.log("user has added to cart",true);
	}
	@Test(priority = 1)
	public void logoutt() {
		Reporter.log("user has logout the appn",true);
	}


}
