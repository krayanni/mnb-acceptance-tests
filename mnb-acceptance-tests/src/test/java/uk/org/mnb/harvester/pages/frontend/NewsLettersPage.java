package uk.org.mnb.harvester.pages.frontend;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsLettersPage {

	WebDriver driver;
    
    @FindBy(name="location")
    WebElement location;
	
	@FindBy(name="email")
    WebElement email;
 
    @FindBy(name="firstName")
    WebElement firstname;
    
    @FindBy(name="lastName")
    WebElement lastname;
    
    @FindBy(xpath="//label[@for='gender_male']")
    WebElement gendermale;
    
    @FindBy(name="dateOfBirth")
    WebElement dateofbirth;
   
    @FindBy(name="mobile")
    WebElement mobile;
        
    @FindBy(name="postcode")
    WebElement postcode;
    
    @FindBy(xpath="//button[@class='main-btn primary-btn register--form-proceed']")
    WebElement signup;
    
 
     public NewsLettersPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
       }
 
        public void selectLocation()
          {
          location.click();
          }  
        public void setFirstName(String firstName)
          {
          firstname.sendKeys(firstName);
          }

        public void setLastName(String LastName)
          {
          lastname.sendKeys(LastName);
          }

        public void setEmail(String emailId)
          {
          email.sendKeys(emailId);
          }
  
        public void setMobile(String Mobile)
          {
          mobile.sendKeys(Mobile);
          }      
         public void setDateOfBirth(String dateOfBirth)
           {
           dateofbirth.sendKeys(dateOfBirth);
           }
         public void ClickOnGenderMale()
           {
           gendermale.click();
           }
         public void setPostCode(String postCode)
           {
           postcode.sendKeys(postCode);
           }
         public void ClickOnSignUp()
           {
           signup.sendKeys();
           }
 
    /**
 
     * This POM method will be exposed in test case to Sign-up news letter
 
     * @param strUserName
 
     * @param strPasword
 
     * @return
     * @throws AWTException 
 
     */
 
    public void NewsLetterSignUp(String emailId,String firstName, String lastName, String Mobile, String dateOfBirth, String postCode) throws AWTException{
 
       location.click();
   	   location.sendKeys("Harvester Wych Way In, Worcester Road, DROITWICH, Worcestershire, WR9 7PA");
   	   Robot robot = new Robot();
       robot.keyPress(KeyEvent.VK_DOWN);
       robot.keyRelease(KeyEvent.VK_DOWN);
   	   robot.keyPress(KeyEvent.VK_ENTER);
   	   robot.keyRelease(KeyEvent.VK_ENTER);
   	   email.sendKeys(emailId);
   	   firstname.sendKeys(firstName);
   	   lastname.sendKeys(lastName);
   	   gendermale.click();
   	   dateofbirth.sendKeys(dateOfBirth);
   	   postcode.sendKeys(postCode);
   	   mobile.sendKeys(Mobile);
   	   signup.click();
    
    }
	
}
