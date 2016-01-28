package uk.org.mnb.harvester.regession.frontend;

import java.awt.AWTException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uk.org.mnb.harvester.pages.frontend.TableBookingPage;
import uk.org.mnb.harvester.tests.AssertFactory;
import uk.org.mnb.harvester.tests.browserFactory;

public class VerifyTableBookingGuestRegistration {

	   @Test
	   public void checkTableBookingGuestRegistration() throws AWTException, InterruptedException
	   {
	 	  WebDriver driver = browserFactory.startBrowser("firefox", "https://systest.harvester.172.26.161.242.xip.io/restaurants/eastandwestmidlands/thewychwayinndroitwich/tablebooking");
	 	  TableBookingPage tablebooking = PageFactory.initElements(driver, TableBookingPage.class);
	   	  AssertFactory Assert = PageFactory.initElements(driver, AssertFactory.class);
	 	  tablebooking.CompleteDateSection();
	 	  tablebooking.CompleteTimeSection();
	 	  tablebooking.CompleteReviewSection();
	 	  tablebooking.CompleteDetailsSection("guestfirstname", "guestlastname", "guest@caci.co.uk", "07511111111");
	 	  Assert.Confirmbooking("THANK YOU, GUESTFIRSTNAME");
	 	  //  Assert.assertTrue(driver.getPageSource().contains("Thank you, "));
	 	  tablebooking.ConfirmRegistration("password12", "password12", "01/01/1980");
	 	  driver.quit();
	   }
	
}
