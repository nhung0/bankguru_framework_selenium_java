package pageObjects.bankguru;

import org.openqa.selenium.WebDriver;

import commons.basePage;

public class withDrawalPageObject extends pageAction {
	WebDriver driver;

	public withDrawalPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

}
