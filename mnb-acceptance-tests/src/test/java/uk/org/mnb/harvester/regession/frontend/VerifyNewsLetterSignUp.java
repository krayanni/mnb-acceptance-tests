package uk.org.mnb.harvester.regession.frontend;

import java.awt.AWTException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uk.org.mnb.harvester.pages.frontend.NewsLettersPage;
import uk.org.mnb.harvester.pages.frontend.RegisterPage;
import uk.org.mnb.harvester.tests.AssertFactory;
import uk.org.mnb.harvester.tests.browserFactory;

public class VerifyNewsLetterSignUp {
	
	   @Test
	   public void checkNewsLetterSignup() throws AWTException
	   {
	 	  WebDriver driver = browserFactory.startBrowser("firefox", "https://systest.harvester.172.26.161.242.xip.io/login");
	 	  NewsLettersPage newsletter = PageFactory.initElements(driver, NewsLettersPage.class);
	 	  newsletter.NewsLetterSignUp("guest12@gmail.com", "GuestFN", "GuestLN", "07511111111", "01/01/1988", "WR9 7PA");
	 	  AssertFactory Assert = PageFactory.initElements(driver, AssertFactory.class);
	 	 // Assert.assertTrue(driver.getTitle().contains("My Account"));
	 	  Assert.Confirmlogin("MY ACCOUNT");
	 	  driver.quit();
	   }

}
