package uk.org.mnb.harvester.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserFactory {
	static WebDriver driver;
    
	   public static WebDriver startBrowser(String browserName, String url)
	   {
		   if (browserName.equals("firefox"))
		   {
			   driver = new FirefoxDriver();
		   }
		   else if (browserName.equals("chrome"))
		   {
			   driver = new ChromeDriver();
		   }
		   else if (browserName.equals("IE"))
		   {
			   driver = new InternetExplorerDriver();
		   }
		   
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get(url);
		   return driver; 
	   }
}
