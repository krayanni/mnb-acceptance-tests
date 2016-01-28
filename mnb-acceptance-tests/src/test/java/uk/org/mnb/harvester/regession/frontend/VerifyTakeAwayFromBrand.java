package uk.org.mnb.harvester.regession.frontend;

import java.awt.AWTException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uk.org.mnb.harvester.pages.frontend.PaymentPage;
import uk.org.mnb.harvester.pages.frontend.TakeAwayPage;
import uk.org.mnb.harvester.tests.AssertFactory;
import uk.org.mnb.harvester.tests.browserFactory;

public class VerifyTakeAwayFromBrand {

	   @Test
	   public void checkTakeawayFromBrand() throws AWTException, InterruptedException
	   {
	 	  WebDriver driver = browserFactory.startBrowser("firefox", "https://systest.harvester.172.26.161.242.xip.io/takeaway");
	 	  TakeAwayPage takeaway = PageFactory.initElements(driver, TakeAwayPage.class);
	 	  PaymentPage payment = PageFactory.initElements(driver, PaymentPage.class);
	 	  AssertFactory Assert = PageFactory.initElements(driver, AssertFactory.class);
	 	  takeaway.SelectLocationTimeAndContinue();
	 	  takeaway.CompleteCreateYourOrderSection();
	 	  takeaway.CompleteReviewOrderSection();
	 	  takeaway.CompleteDetailsSection("Guestfn", "Guestlt", "abcde@gmail.com", "07511111111", "Address1", "Address2", "Town", "WR9 7PA");
	 	  payment.ApprovedPayment();
	 	 // Assert.assertTrue(driver.getPageSource().contains("Thank you, "));
	 	  Assert.Confirmbooking("THANK YOU, GUESTFN"); 
	 	  driver.quit();
	 	  
	   }
	
}
