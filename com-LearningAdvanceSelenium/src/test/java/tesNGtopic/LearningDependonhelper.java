package tesNGtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningDependonhelper {
	
	@Test(priority = 1)
	public void login() {
		
		int i=1/0;
		
		Reporter.log("user has login the app",true);
		
	}

@Test(dependsOnMethods = "login" ,priority = 2)	
public void addCart() {
	
	Reporter.log("user add prod to cart",true);
		
	}

@Test(dependsOnMethods = "login",priority  = 3)
public void logout() {
	
Reporter.log("user has logout the app",true);
}
	
}
