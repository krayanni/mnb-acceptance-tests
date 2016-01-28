package uk.org.mnb.harvester.regession.frontend;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uk.org.mnb.harvester.pages.frontend.LoginPage;
import uk.org.mnb.harvester.tests.AssertFactory;
import uk.org.mnb.harvester.tests.browserFactory;


public class VerifyLogin {
	
	   @Test
	   public void checkValidUser()
	   {
	 	  WebDriver driver = browserFactory.startBrowser("firefox", "https://systest.harvester.172.26.161.242.xip.io/login");
	 	  LoginPage  login = PageFactory.initElements(driver, LoginPage.class);
	 	  AssertFactory Assert = PageFactory.initElements(driver, AssertFactory.class); 
	 	  login.loginToHarvester("krayanni@caci.co.uk", "password1234");
	 	 // Assert.assertTrue(driver.getTitle().contains("My Account"));
	 	  Assert.Confirmlogin("MY ACCOUNT");
	 	  driver.quit();
	   }

}
