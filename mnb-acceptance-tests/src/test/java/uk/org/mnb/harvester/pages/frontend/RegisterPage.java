package uk.org.mnb.harvester.pages.frontend;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
WebDriver driver;
    	
	@FindBy(name="email")
    WebElement email;
 
    @FindBy(name="firstName")
    WebElement firstname;
    
    @FindBy(name="surname")
    WebElement lastname;
    
    @FindBy(xpath="//label[@for='gender_male']")
    WebElement gendermale;
    
    @FindBy(name="dateOfBirth_proxy")
    WebElement dateofbirth;
   
    @FindBy(name="mobile")
    WebElement mobile;
        
    @FindBy(name="postcode")
    WebElement postcode;
    
    @FindBy(name="address")
    WebElement address;
    
    @FindBy(name="town")
    WebElement town;
    
    @FindBy(name="password")
    WebElement password;
    
    @FindBy(name="verifyPassword")
    WebElement verifypassword;
    
    @FindBy(name="location")
    WebElement location;
    
    @FindBy(xpath="//label[@for='termsAndconditions']")
    WebElement termsandconditions;
      
    @FindBy(xpath="//button[@class='main-btn primary-btn register--form-proceed']") 
    WebElement signupnow;
    
 
     public RegisterPage(WebDriver driver){
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
         public void setAddress(String Address)
           {
           address.sendKeys(Address);
           }
         public void setTown(String Town)
         {
         town.sendKeys(Town);
         }
         public void setPassword(String Password)
         {
         password.sendKeys(Password);
         }
         public void setVerifyPassword(String verifyPassword)
         {
         verifypassword.sendKeys(verifyPassword);
         }
         public void ClickOnTermsAndConditions()
         {
         termsandconditions.click();
         }
         public void ClickOnSignUpNow()
           {
           signupnow.sendKeys();
           }
 
    /**
 
     * This POM method will be exposed in test case to Sign-up news letter
 
     * @param strUserName
 
     * @param strPasword
 
     * @return
     * @throws AWTException 
     * @throws InterruptedException 
 
     */
 
    public void UserRegisgter(String emailId,String firstName, String lastName, String Mobile, String dateOfBirth, String postCode, String Address, String Town, String Password, String verifyPassword ) throws AWTException, InterruptedException{
 

   	   email.sendKeys(emailId);
   	   firstname.sendKeys(firstName);
   	   lastname.sendKeys(lastName);
   	   gendermale.click();
   	   dateofbirth.sendKeys(dateOfBirth);
   	   address.sendKeys(Address);
   	   town.sendKeys(Town);
   	   postcode.sendKeys(postCode);
   	   mobile.sendKeys(Mobile);
   	   password.sendKeys(Password);
   	   verifypassword.sendKeys(verifyPassword);
       location.click();
   	   location.sendKeys("Harvester Wych Way In, Worcester Road, DROITWICH, Worcestershire, WR9 7PA");
   	   Robot robot = new Robot();
       robot.keyPress(KeyEvent.VK_DOWN);
       robot.keyRelease(KeyEvent.VK_DOWN);
   	   robot.keyPress(KeyEvent.VK_ENTER);
   	   robot.keyRelease(KeyEvent.VK_ENTER);
   	   Thread.sleep(10000);
   	   termsandconditions.click();
   	   signupnow.click();
    
    }
}
