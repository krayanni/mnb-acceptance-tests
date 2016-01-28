package uk.org.mnb.harvester.regession.frontend;

import java.awt.AWTException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import uk.org.mnb.harvester.pages.frontend.TableBookingPage;
import uk.org.mnb.harvester.tests.AssertFactory;
import uk.org.mnb.harvester.tests.browserFactory;

public class VerifyTableBookingFromBrand {

	   @Test
	   public void checkTableBookingGuestFromBrand() throws AWTException, InterruptedException
	   {
	 	  WebDriver driver = browserFactory.startBrowser("firefox", "https://systest.harvester.172.26.161.242.xip.io/tablebooking");
	 	  TableBookingPage tablebooking = PageFactory.initElements(driver, TableBookingPage.class);
	 	  AssertFactory Assert = PageFactory.initElements(driver, AssertFactory.class);
	 	  tablebooking.SelectLocationAndContinue();
	 	  tablebooking.CompleteDateSection();
	 	  tablebooking.CompleteTimeSection();
	 	  tablebooking.CompleteReviewSection();
	 	  tablebooking.CompleteDetailsSection("guestfirstname", "guestlastname", "guest1@caci.co.uk", "07511111111");
	 	  //AssertFactory.Confirmbooking("Verify with Thankyou");
	 	//  Assert.assertTrue(driver.getPageSource().contains("Thank you, "));
	 	 Assert.Confirmbooking("THANK YOU, GUESTFIRSTNAME");
	 	 // driver.quit();
	   }
	
}
