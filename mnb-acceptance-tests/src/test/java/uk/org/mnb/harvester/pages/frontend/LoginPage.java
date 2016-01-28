package uk.org.mnb.harvester.pages.frontend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
    
    @FindBy(name="email")
    WebElement username;
 
    @FindBy(name="password")
    WebElement password;
 
    @FindBy(xpath="//button[@class='main-btn primary-btn login--form-proceed']")
    WebElement logintoproceed;
    
    @FindBy(xpath="//a[@class='login-btn' and @title='Login']")
    WebElement loginbutton;
    
    @FindBy(xpath="Login")
    WebElement Forgot_Pasword;
    
    @FindBy(xpath="(//a[@title='My account'])")
    WebElement hometitle;
 
     public LoginPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
       }
 
            //Set user name in textbox
            public void setUserName(String userid)
            {
            username.sendKeys(userid);
            }
 
           //Set password in password textbox
           public void setPassword(String pass)
           {
           password.sendKeys(pass);
           }
 
           //Click on login button
           public void clickOnLogintoProceed()
           {
            logintoproceed.click();
           }
           public void clickOnLoginButton()
           {
            loginbutton.click();
           }
    
          //Get the title of Login Page
          public String LoginTitle()
          {
          return    hometitle.getText();
          }
 
    /**
 
     * This POM method will be exposed in test case to login in the application
 
     * @param strUserName
 
     * @param strPasword
 
     * @return
 
     */
 
    public void loginToHarvester(String userid,String pass){
 
        username.sendKeys(userid);
        password.sendKeys(pass);
        logintoproceed.click();
    
        
 
    }


 
}
