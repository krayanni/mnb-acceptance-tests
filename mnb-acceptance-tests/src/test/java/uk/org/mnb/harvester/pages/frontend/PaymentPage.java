package uk.org.mnb.harvester.pages.frontend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	WebDriver driver;
    
	//Payment page elements
    @FindBy(name="VISA_brand")
    WebElement visa;
 
    @FindBy(id="Ecom_Payment_Card_Name")
    WebElement cardname;
    
    @FindBy(id="Ecom_Payment_Card_Number")
    WebElement cardnumber;
 
    @FindBy(id="Ecom_Payment_Card_ExpDate_Year")
    WebElement expyear;
    
    @FindBy(id="Ecom_Payment_Card_ExpDate_Month")
    WebElement expmonth;
    
    @FindBy(id="Ecom_Payment_Card_Verification")
    WebElement cardverification;
    
    @FindBy(id="submit3")
    WebElement submit;
    
    @FindBy(id="input.ncol")
    WebElement ok;
 
     public PaymentPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
       }
 
          // Payment page object methods
           public void ClickOnVisa()
            {
            visa.click();	
            }
           public void setCardName(String cardName)
            {
            cardname.sendKeys(cardName);
            }
           public void setCardNumber(String cardNumber)
           {
            cardnumber.sendKeys(cardNumber);
           }
           public void setExpYear(String expYear)
           {
        	   expyear.sendKeys(expYear);
           }
           public void setExpMonth(String expMonth)
           {
        	   expmonth.sendKeys(expMonth);
           }
           public void setCardVerification(String cardVerification)
           {
        	   cardverification.sendKeys(cardVerification);
           }
           public void ClickOnSubmit()
           {
        	   submit.click();
           }
           public void ClickOnOk()
           {
        	   ok.click();
           }
 
     // method for payment process
    public void ApprovedPayment(){
 
        visa.click();
    	cardname.sendKeys("kranti");
        cardnumber.sendKeys("4111111111111111");
        Utils.setDropdownValueByIndex(expyear, 4);   
        Utils.setDropdownValueByIndex(expmonth, 4);   
        cardverification.sendKeys("123");       
        submit.click();
      //  ok.click();  
        
    }
        
        //  card_accepted = '4111111111111111'
    	//	card_refused = '4111113333333333'
    	//	card_uncertain = '4111116666666666'  
    
        public void RefusedPayment(){
        	 
            visa.click();
        	cardname.sendKeys("kranti");
            cardnumber.sendKeys("4111113333333333");
            Utils.setDropdownValueByIndex(expyear, 4);   
            Utils.setDropdownValueByIndex(expmonth, 4);   
            cardverification.sendKeys("123");       
            submit.click();
         //   ok.click();     
  
    }
    
    public void UncertainPayment(){
    	 
        visa.click();
    	cardname.sendKeys("kranti");
        cardnumber.sendKeys("4111116666666666");
        Utils.setDropdownValueByIndex(expyear, 4);   
        Utils.setDropdownValueByIndex(expmonth, 4);   
        cardverification.sendKeys("123");       
        submit.click();
       // ok.click();
        
    }

}
