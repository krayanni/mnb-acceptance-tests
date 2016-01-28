package uk.org.mnb.harvester.regession.frontend;

import java.awt.AWTException;






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import uk.org.mnb.harvester.pages.frontend.LoginPage;
import uk.org.mnb.harvester.pages.frontend.RegisterPage;
import uk.org.mnb.harvester.tests.AssertFactory;
import uk.org.mnb.harvester.tests.browserFactory;

public class VerifyUserRegistration {
	
	
	   @Test
	   public void checkUserRegistration() throws AWTException, InterruptedException
	   {
	 	  WebDriver driver = browserFactory.startBrowser("firefox", "https://systest.harvester.172.26.161.242.xip.io/register");
	 	  RegisterPage register = PageFactory.initElements(driver, RegisterPage.class);
	 	//  AssertFactory Assert = PageFactory.initElements(driver, AssertFactory.class); 
	 	  register.UserRegisgter("guest1234@gmail.com", "GuestFN", "GuestLN", "07511111111", "01/01/1988", "WR9 7PA", "address", "town", "password123", "password123");
	 	// Assert.assertTrue(driver.getTitle().contains("My Account"));
	 	 Assert.assertTrue(driver.getPageSource().contains("Thank you for registering!"));
	 	 
	 	//  Assert.Confirmlogin("MY ACCOUNT");
	 	  driver.quit();
	   }
	   
	   @Test(priority=1)
	   // To check that registration should get failed if the user is already registered
	   public void checkUserRegistrationFail() throws AWTException, InterruptedException
	   {
		 	  WebDriver driver = browserFactory.startBrowser("firefox", "https://systest.harvester.172.26.161.242.xip.io/register");
		 	  RegisterPage register = PageFactory.initElements(driver, RegisterPage.class);
		 	  AssertFactory Assert = PageFactory.initElements(driver, AssertFactory.class); 
		 	  register.UserRegisgter("guest1234@gmail.com", "GuestFN", "GuestLN", "07511111111", "01/01/1988", "WR9 7PA", "address", "town", "password123", "password123");
		 	 // Assert.assertTrue(driver.getTitle().contains("My Account"));
		 	  Assert.ConfirmRegitrationFails("MY ACCOUNT");
		 	  
	   }

}
