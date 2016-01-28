package uk.org.mnb.harvester.regession.frontend;

import java.awt.AWTException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uk.org.mnb.harvester.pages.frontend.LoginPage;
import uk.org.mnb.harvester.pages.frontend.PaymentPage;
import uk.org.mnb.harvester.pages.frontend.TableBookingPage;
import uk.org.mnb.harvester.tests.AssertFactory;
import uk.org.mnb.harvester.tests.browserFactory;

public class VerifyTableBookingKrantiWithDeposit {

	 @Test
	   public void checkTableBookingKrantiWithDeposit() throws AWTException, InterruptedException
	   {
	 	  WebDriver driver = browserFactory.startBrowser("firefox", "https://systest.harvester.172.26.161.242.xip.io/restaurants/eastandwestmidlands/thewychwayinndroitwich/tablebooking");
	 	  TableBookingPage tablebooking = PageFactory.initElements(driver, TableBookingPage.class);
	 	  LoginPage  login = PageFactory.initElements(driver, LoginPage.class);
	 	  PaymentPage payment = PageFactory.initElements(driver, PaymentPage.class);
	 	  AssertFactory Assert = PageFactory.initElements(driver, AssertFactory.class);
	 	  tablebooking.CompleteDateSectionWithEvent();
          tablebooking.CompleteTimeSectionWithEvent();
	 	  tablebooking.CompleteReviewSection();
	 	  login.clickOnLoginButton();
	 	  login.loginToHarvester("krayanni@caci.co.uk", "password1234");
	 	  tablebooking.CompleteDetailsSectionWithLogin();
	 	  payment.ApprovedPayment();
	   	//  Assert.assertTrue(driver.getPageSource().contains("Thank you, "));
	 	  Assert.Confirmbooking("THANK YOU, KRANTI"); 
	 	  driver.quit();
	 	  
	   }
	
}
