package pageObjects.bankguru;

import org.openqa.selenium.WebDriver;

import commons.basePage;

public class fundTransferPageObject extends pageAction {
	WebDriver driver;

	public fundTransferPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

}
