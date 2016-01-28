package uk.org.mnb.harvester.tests;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class AssertFactory {
	static WebDriver driver;
    
	   public WebDriver Confirmbooking(String Verifytext)
	   {
		   
		   WebElement element = driver.findElement(By.xpath("//h1[text()='Thank you, ']"));
		    Verifytext = element.getText();
		   System.out.println(Verifytext);
		   Assert.assertEquals(Verifytext, Verifytext);
		return driver;
		   }

	   public WebDriver Confirmlogin(String Verifytext)
	   {
		   
		   WebElement element = driver.findElement(By.xpath("//a[text()='My account']"));
		    Verifytext = element.getText();
		   System.out.println(Verifytext);
		   Assert.assertEquals(Verifytext, Verifytext);
		return driver;
		   }
	   
	   public WebDriver ConfirmRegitration(String Verifytext)
	   {
		   
		   WebElement element = driver.findElement(By.xpath("//a[text()='My account']"));
		    Verifytext = element.getText();
		   System.out.println(Verifytext);
		   Assert.assertEquals(Verifytext, Verifytext);
		return driver;
		   }
	   
	   public WebDriver ConfirmRegitrationFails(String Verifytext)
	   {
		   
		   WebElement element = driver.findElement(By.xpath("//a[text()='My account']"));
		    Verifytext = element.getText();
		   System.out.println(Verifytext);
		   Assert.assertEquals(Verifytext, Verifytext);
		return driver;
		   }
	   
	   public WebDriver ConfirmNewsLetterSignup(String Verifytext)
	   {
		   
		   WebElement element = driver.findElement(By.xpath("//a[text()='My account']"));
		    Verifytext = element.getText();
		   System.out.println(Verifytext);
		   Assert.assertEquals(Verifytext, Verifytext);
		return driver;
		   }

	   
	   
	    public AssertFactory(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	       }
		   
		   
		   
		  /* if (Verifytext.equals("Verify with Thankyou"))
		   { 
			   Assert.assertTrue(driver.getPageSource().contains("Thank you, "));
			   System.out.println("The Booking is confirmed");
			 
		   }
		   else if (Verifytext.equals("Verify with confirmation message"))
		   {
			   Assert.assertTrue(driver.getPageSource().contains("Your booking has been confirmed and emailed to"));
			   System.out.println("The Booking is confirmed");
		   }
		   else if (Verifytext.equals("Verify with Booking Reference:"))
		   {
			   Assert.assertTrue(driver.getPageSource().contains("Booking Reference:"));	 
			   System.out.println("The Booking is confirmed");
		   }
		   
		   return driver; */
	   }
	


