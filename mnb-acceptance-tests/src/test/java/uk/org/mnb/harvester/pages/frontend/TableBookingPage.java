package uk.org.mnb.harvester.pages.frontend;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TableBookingPage {
WebDriver driver;
     
    @FindBy(id="location-tablebooking")
    WebElement TBlocation;
 
    @FindBy(xpath="//a[@class='main-btn continue-to-date']")
    WebElement continuetobook;
 
    // Date section
    @FindBy(name="people")
    WebElement people;
    
    @FindBy(name="bookingdate")
    WebElement bookingdate;
    
    @FindBy(partialLinkText="25")
    WebElement date;
    
    @FindBy(partialLinkText="29")
    WebElement eventdate;
    
    @FindBy(name="mealtime")
    WebElement mealtime;
    
    @FindBy(xpath="//a[@class='main-btn forward-btn show-available-times']") 
    WebElement showavailabletimes;
   
   //Time section
   //xpath("//span[contains(text(),'Starters')]")
   //@FindBy(xpath="//input[@name='time' and value='09:15:00']" )
   //  @FindBy(xpath="//input[contains(@id,'tablebooking_timeslot_091500')]")
    @FindBy(xpath="//input[@name='time' and @value='08:30:00']" )
    WebElement time;
    
    @FindBy(xpath="//a[@class='main-btn forward-btn continue-to-review']")
    WebElement reviewbooking;
    
    //Continue to choose event menu
    @FindBy(xpath="//a[@class='main-btn forward-btn continue-to-review']") 
    WebElement chooseeventmenu;
    
    @FindBy(xpath="//label[@class='main-btn tablebooking--meal-option']")
    WebElement selectthisoption;
    
    @FindBy(xpath="//a[@class='main-btn forward-btn continue-to-review-with-event']") 
    WebElement reviewbookingevent;
    
    //Review section
    @FindBy(linkText="Back")
    WebElement backlink;
    
    @FindBy(xpath="//a[@class='main-btn forward-btn continue-to-details']")
    WebElement proceedtobooking;
    
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
    WebElement booknow;
    
    // Confirmation registration elements
    
    @FindBy(name="password")
    WebElement password;
    
    @FindBy(name="confirmPassword")
    WebElement confirmpassword;
    
    @FindBy(name="dateOfBirth_proxy")
    WebElement dateofbirth;
    
    @FindBy(xpath="//label[contains(@for,'gender_male-tablebooking')]")
    WebElement gender_male;
    
    @FindBy(name="addressPostcode")
    WebElement addresspostcode;
    
    @FindBy(xpath="//a[@class='main-btn tablebooking--confirmation-register-btn']")
    WebElement register;
 
 
     public TableBookingPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
       }
           // Select location object methods
             public void ClickOnLocation()
             {
            	 TBlocation.click();
             }
             
             public void ClickOnContinueBooking()
             {
            	 continuetobook.click();
             }
     
           //Date section object methods
            public void ClickOnPeople()
             {
              people.click();
             }

            public void ClickOnBookingDate()
             {
              bookingdate.click();
             }
            
            public void ClickOnDate()
            {
             date.click();
            }
            
            public void ClickOnEventDate()
            {
             eventdate.click();
            }
            
            public void SelectMealTime()
            {
             mealtime.click();
            }
            
            public void ClickOnShowTimings()
            {
             showavailabletimes.click();
            }
            
            //time section object methods
            public void ClickOnTime()
            {
             time.click();
            }
            
            public void ClickOnReviewBooking()
            {
             reviewbooking.click();
            }
            
            //Review section object methods
            
            public void ClickBackLink()
            {
             backlink.click();
            }
            
            public void ClickProceedToBooking()
            {
             proceedtobooking.click();
            }
            
            //Select event main method
            public void ClickOnChooseEventMenu()
            {
             chooseeventmenu.click();
            } 
            public void ClickOnSelectThisOption()
            {
             selectthisoption.click();
            }
            public void ClickOnReviewBookingEvent()
            {
             reviewbookingevent.click();
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

     
           // Confirmation registration object methods
           public void setPassword(String Password)
           {
           password.sendKeys(Password);
           }
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
           
           
          //Get the title of Login Page
        /*  public String ConfirmText()
          {
          return    confirmtext.getText();
          }*/
          
          // method to select the location and continue
    public void SelectLocationAndContinue() throws AWTException{
    	TBlocation.click();
    	TBlocation.sendKeys("Harvester Wych Way In, Worcester Road, DROITWICH, Worcestershire, WR9 7PA");
    	Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	continuetobook.click();
    }
 
          // method to populate details in date section and continue
    public void CompleteDateSection() throws InterruptedException{
        
    	Utils.setDropdownValueByIndex(people, 1);   	
    	bookingdate.click();
    	date.click();
    	Thread.sleep(15000);
    	Utils.setDropdownValueByIndex(mealtime, 1);   	
    	showavailabletimes.click();
    }
    
      // method to populate details in date section with event and continue
   public void CompleteDateSectionWithEvent() throws InterruptedException{
     
 	  Utils.setDropdownValueByIndex(people, 1);   	
 	  bookingdate.click();
 	  eventdate.click();
 	  Thread.sleep(15000);
 	  Utils.setDropdownValueByIndex(mealtime, 1);   	
 	  showavailabletimes.click();
  }
    
 
         // method to complete time section and continue
    public void CompleteTimeSection(){
    	time.click();
    	reviewbooking.click();
    }
    
    // method to complete choose event menu
    public void CompleteTimeSectionWithEvent(){
    	time.click();
    	chooseeventmenu.click();
    	selectthisoption.click();
    	reviewbookingevent.click();
    }
    
    // method to continue review booking
    public void CompleteReviewSection(){
    	proceedtobooking.click();
    }
    
    // method to populate details in details section and complete booking
    public void CompleteDetailsSection(String firstName,String lastName, String emailId, String contact) throws InterruptedException{
 
        firstname.sendKeys(firstName);
        lastname.sendKeys(lastName);
        email.sendKeys(emailId);
        contactnumber.sendKeys(contact);
        iagree.click();
        Thread.sleep(5000);
        booknow.click();
    }
    
    public void CompleteDetailsSectionWithDeposit(String firstName,String lastName, String emailId, String contact, String Address1, String Address2, String Town, String postCode) throws InterruptedException{
        
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
        booknow.click();
    }
    
    
    
    public void CompleteDetailsSectionWithLogin() throws InterruptedException{
    	 
    
        iagree.click();
        Thread.sleep(5000);
        booknow.click();
    }
    
        // Method to complete confirm registration 
     public void ConfirmRegistration(String Password, String confirmPassword, String dateOfBirth){
    	password.sendKeys(Password);
    	confirmpassword.sendKeys(confirmPassword);
    	dateofbirth.sendKeys(dateOfBirth);
    	gender_male.click();
    	addresspostcode.click();
    	register.click();
    	 
     }
    
        
 
}
