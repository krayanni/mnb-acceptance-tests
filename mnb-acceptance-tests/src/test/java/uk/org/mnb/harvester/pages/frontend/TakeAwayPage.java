package uk.org.mnb.harvester.pages.frontend;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeAwayPage {
	WebDriver driver;
	
    // Select location
    @FindBy(id="location-takeaway")
    WebElement takeawaylocation;
 
    @FindBy(name="time")
    WebElement takeawaytime;
    
    @FindBy(xpath="//a[@class='main-btn continue-to-create']")  
    WebElement ordertakeawaybutton;
    
    // Create you order
    @FindBy(xpath="//span[contains(text(),'Starters')]") 
    WebElement starters;
    
    @FindBy(xpath="//a[@class='main-btn add-to-order']") 
    WebElement addtoorder;
    
    @FindBy(xpath="//a[@class='main-btn select-choices']") 
    WebElement selectchoices;
 
    @FindBy(name="L10000035689_HVRDN14CarbChoice1[0]")
    WebElement selectchoiceitemfromdropdown1;
    
    @FindBy(name="L10000035689_HVRDN14SauceChoice1[0]") 
    WebElement selectchoiceitemfromdropdown2;
    
    @FindBy(xpath="//label[@for='L10000035689_HVRDN14BurgerUpsells_10000035653']") 
    WebElement selectitem_HRDN14AddCheese_049 ;
    
    @FindBy(xpath="//article[3]/a[@class='main-btn add-to-order']") 
    WebElement addtoorderafterselectingitems;
    
    @FindBy(xpath="//a[@class='main-btn forward-btn basket-continue-to-review']") 
    WebElement continuetoreview ;
        
    //Review section    
    @FindBy(xpath="//a[@class='main-btn forward-btn continue-to-details']") 
    WebElement confirmandenterdetails;
    
    @FindBy(xpath="//a[@class='main-btn backward-btn back-to-stage-1']") 
    WebElement addmoretomyorder;
    
    //Details Section
    @FindBy(name="firstName")
    WebElement firstname;
    
    @FindBy(name="lastName")
    WebElement lastname;
    
    @FindBy(name="email")
    WebElement email;
    
    @FindBy(name="contactNumber")
    WebElement contactnumber;
    
    @FindBy(name="addressLine1")
    WebElement address1;
    
    @FindBy(name="addressLine2")
    WebElement address2;
    
    @FindBy(name="addressTown")
    WebElement town;
    
    @FindBy(name="addressPostcode")
    WebElement postcode;
    
    @FindBy(name="termsAndCon")
    WebElement iagree;
    
    @FindBy(xpath="//button[@class='main-btn forward-btn' and @name='placeOrder']")
    WebElement placemyorder;
    
    // Confirmation registration elements
    
    @FindBy(name="password")
    WebElement password;
    
    @FindBy(name="confirmPassword")
    WebElement confirmpassword;
    
    @FindBy(name="dateOfBirth_proxy")
    WebElement dateofbirth;
    
    @FindBy(xpath="//label[contains(@for,'gender_male-takeaway')]")
    WebElement gender_male;
    
    @FindBy(name="addressPostcode")
    WebElement addresspostcode;
    
    @FindBy(xpath="//a[@class='main-btn takeaway--confirmation-register-btn']")
    WebElement register;
    
    @FindBy(xpath="//a[@class='main-btn takeaway--reset']")
    WebElement orderanothertakeaway;
    
    
    public TakeAwayPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
       }
           // Select location object methods
             public void SelectLocation()
             {
            	 takeawaylocation.click();
             }
             public void SelectTime()
             {
            	 takeawaytime.click();
             } 
             public void ClickOnOrderTakeAwayButton()
             {
            	 ordertakeawaybutton.click();
             }
     
           //Create section object methods
            public void ClickOnStarters()
             {
              starters.click();
             }
            public void ClickOnAddToOrder()
             {
              addtoorder.click();
             }
            public void ClickOnSelectChoices()
            {
             selectchoices.click();
            }
            public void SelectChoiceItemFromDropdown1()
            {
             selectchoiceitemfromdropdown1.click();
            }
            public void SelectChoiceItemFromDropdown2()
            {
             selectchoiceitemfromdropdown2.click();
            }
            public void SelectItem_HRDN14AddCheese_049()
            {
            selectitem_HRDN14AddCheese_049.click();
            }
            public void ClickOnAddToOrderAfterSection()
            {
            addtoorderafterselectingitems.click();
            }
            public void ClickOnContinueToReview()
            {
            continuetoreview.click();
            }

            //Review section object methods    
            public void ClickOnConfirmAndEnterDetails()
            {
            confirmandenterdetails.click();
            }
            
            public void ClickOnAddMoreToMyOrder()
            {
             addmoretomyorder.click();
            }
                                    
           //Details section object methods
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
           public void setContactNumber(String contact)
             {
            contactnumber.sendKeys(contact);
             }
           public void setAddress1(String Address1)
             {
            address1.sendKeys(Address1);
             }
           public void setAddress2(String Address2)
             {
            address2.sendKeys(Address2);
             }
           public void setTown(String Town)
             {
            town.sendKeys(Town);
             }        
           public void setPostCode(String postCode)
             {
            postcode.sendKeys(postCode);
             }
           public void ClickOnIAgree()
             {
            iagree.click();
             }
           public void ClickOnPlaceMyOrder()
             {
             placemyorder.click();
             }
           
           // Confirmation registration object methods
           public void setConfirmPassword(String confirmPassword)
             {
             confirmpassword.sendKeys(confirmPassword);
             }
           public void setDateOfBirth(String dateOfBirth)
             {
      	     dateofbirth.sendKeys(dateOfBirth);  
             }
           public void ClickOnGenderMale()
             {
             gender_male.click();
             }
        
           public void setAddressPostCode(String addressPostCode)
             {
             addresspostcode.sendKeys(addressPostCode);
             }
           public void ClickOnRegister()
             {
             register.click();
             }
           public void ClickOnOrderAnotherTakeAway()
           {
           orderanothertakeaway.click();
           }
           
           
        // method to select the location,time and continue
           public void SelectLocationTimeAndContinue() throws AWTException{
           	takeawaylocation.click();
           	takeawaylocation.sendKeys("Harvester Wych Way In, Worcester Road, DROITWICH, Worcestershire, WR9 7PA");
           	Robot robot = new Robot();
               robot.keyPress(KeyEvent.VK_DOWN);
               robot.keyRelease(KeyEvent.VK_DOWN);
           	robot.keyPress(KeyEvent.VK_ENTER);
           	robot.keyRelease(KeyEvent.VK_ENTER);
        	Utils.setDropdownValueByIndex(takeawaytime, 1);   	
           	ordertakeawaybutton.click();
           }
           
           // method to select only time and continue
           public void SelectOnlyTimeAndContinue() {
        	Utils.setDropdownValueByIndex(takeawaytime, 1);   	
           	ordertakeawaybutton.click();
           }
           
           // method to complete create your order section
           public void CompleteCreateYourOrderSection() throws InterruptedException {
        	Thread.sleep(15000);   
        	starters.click();
        	selectchoices.click();
        	Utils.setDropdownValueByIndex(selectchoiceitemfromdropdown1, 2);
        	Utils.setDropdownValueByIndex(selectchoiceitemfromdropdown2, 3);
        	addtoorderafterselectingitems.click();
        	selectitem_HRDN14AddCheese_049.click();
        	continuetoreview.click();
           }
           
          // method to complete review order section
           // Edit link functionality to be added this method
           public void CompleteReviewOrderSection() {   	
           	confirmandenterdetails.click();
           }
           
           // method to populate details in details section and complete order booking
           public void CompleteDetailsSection(String firstName,String lastName, String emailId, String contact, String Address1, String Address2, String Town, String postCode) throws InterruptedException{
        
               firstname.sendKeys(firstName);
               lastname.sendKeys(lastName);
               email.sendKeys(emailId);
               contactnumber.sendKeys(contact);
               address1.sendKeys(Address1);
               address2.sendKeys(Address2);
               town.sendKeys(Town);
               postcode.sendKeys(postCode);
               iagree.click();
               Thread.sleep(5000);
               placemyorder.click();
           }
          
           // method to details details section after login
           public void CompleteDetailsSectionWithLogin() throws InterruptedException{
          	        	    
               iagree.click();
               Thread.sleep(5000);
               placemyorder.click();
               
           }
           
           // Method to complete confirm registration 
           public void ConfirmRegistration(String Password, String confirmPassword, String dateOfBirth){
          	password.sendKeys(Password);
          	confirmpassword.sendKeys(confirmPassword);
          	dateofbirth.sendKeys(dateOfBirth);
          	gender_male.click();
         // 	addresspostcode.click();
          	register.click();
          	 
           }
           
           // Method to confirm order
           public boolean ConfirmOrder(){
       	    try {
       	    	driver.findElement(By.xpath("//a[@class='main-btn takeaway--reset']"));
       	    	System.out.println("Test1");
      	      return true;
      	    } catch (NoSuchElementException e) {
      	    	System.out.println("Test2");
		return false;
          	 
           }
      } 	    
           
}
