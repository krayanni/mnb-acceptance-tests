package uk.org.mnb.harvester.regession.frontend;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uk.org.mnb.harvester.pages.frontend.PaymentPage;
import uk.org.mnb.harvester.pages.frontend.TakeAwayPage;
import uk.org.mnb.harvester.tests.AssertFactory;
import uk.org.mnb.harvester.tests.browserFactory;

public class VerifyTakeAwayGuestRegistration {

	   @Test
	   public void checkTakeawayGuestRegistration() throws AWTException, InterruptedException
	   {
	 	  WebDriver driver = browserFactory.startBrowser("firefox", "https://systest.harvester.172.26.161.242.xip.io/restaurants/eastandwestmidlands/thewychwayinndroitwich/takeaway");
	 	  TakeAwayPage takeaway = PageFactory.initElements(driver, TakeAwayPage.class);
	 	  PaymentPage payment = PageFactory.initElements(driver, PaymentPage.class);
	 	  AssertFactory Assert = PageFactory.initElements(driver, AssertFactory.class);
	 	  takeaway.SelectOnlyTimeAndContinue();
	 	  takeaway.CompleteCreateYourOrderSection();
	 	  takeaway.CompleteReviewOrderSection();
	 	  takeaway.CompleteDetailsSection("Guestfn", "Guestlt", "abcdee@gmail.com", "07511111111", "Address1", "Address2", "Town", "WR9 7PA");
	 	  payment.ApprovedPayment();
	// 	  Assert.assertTrue(driver.getPageSource().contains("Thank you, "));
	 	  takeaway.ConfirmRegistration("password12", "password12", "01/01/1980");
	 	  driver.quit();
	 	
	   }
}
