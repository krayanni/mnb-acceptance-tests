package uk.org.mnb.harvester.regession.frontend;

import java.awt.AWTException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uk.org.mnb.harvester.pages.frontend.LoginPage;
import uk.org.mnb.harvester.pages.frontend.PaymentPage;
import uk.org.mnb.harvester.pages.frontend.TakeAwayPage;
import uk.org.mnb.harvester.tests.AssertFactory;
import uk.org.mnb.harvester.tests.browserFactory;

public class VerifyTakeAwayKrantiRefusedPayment {

	   @Test
	   public void checkTakeawayKrantiRefusedPayment() throws AWTException, InterruptedException
	   {
	 	  WebDriver driver = browserFactory.startBrowser("firefox", "https://systest.harvester.172.26.161.242.xip.io/restaurants/eastandwestmidlands/thewychwayinndroitwich/takeaway");
	 	  TakeAwayPage takeaway = PageFactory.initElements(driver, TakeAwayPage.class);
	 	  PaymentPage payment = PageFactory.initElements(driver, PaymentPage.class);
	 	  LoginPage  login = PageFactory.initElements(driver, LoginPage.class);
	 	  AssertFactory Assert = PageFactory.initElements(driver, AssertFactory.class);
	 	  takeaway.SelectOnlyTimeAndContinue();
	 	  takeaway.CompleteCreateYourOrderSection();
	 	  takeaway.CompleteReviewOrderSection();
	 	  login.clickOnLoginButton();
	 	  login.loginToHarvester("krayanni@caci.co.uk", "password1234");
	 	  takeaway.CompleteDetailsSectionWithLogin();
	 	  payment.ApprovedPayment();
	 //	  Assert.assertTrue(driver.getPageSource().contains("Thank you, "));
	 	  Assert.Confirmbooking("THANK YOU, KRANTI"); 
	 	  driver.quit();
	   }
	
}
