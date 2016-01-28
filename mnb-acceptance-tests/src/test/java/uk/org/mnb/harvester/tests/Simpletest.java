package uk.org.mnb.harvester.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Simpletest {

	@Test
	public void main(){
		 WebDriver driver = null;
		 driver = new FirefoxDriver();
		 driver.get("http://newtours.demoaut.com/");
		 driver.findElement(By.name("userName")).sendKeys("kranti");
		 System.out.println("Successfully opened login page and entered username");
	}


	
}
