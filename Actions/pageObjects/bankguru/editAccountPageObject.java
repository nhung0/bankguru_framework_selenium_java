package pageObjects.bankguru;

import org.openqa.selenium.WebDriver;

import bankguruPageUIs.editAccountPageUI;
import commons.basePage;

public class editAccountPageObject extends pageAction {
	WebDriver driver;

	public editAccountPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

	
}
