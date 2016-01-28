package uk.org.mnb.harvester.pages.frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {
	public static void setDropdownValue(WebElement element, String value) {
		Select droplist = new Select(element);
		droplist.selectByVisibleText(value);
	}
	
	public static void setDropdownValueByIndex(WebElement element, int index) {
		Select droplist = new Select(element);
		droplist.selectByIndex(index);
	}
	
}
