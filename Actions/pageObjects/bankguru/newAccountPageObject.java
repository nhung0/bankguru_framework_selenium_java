package pageObjects.bankguru;

import org.openqa.selenium.WebDriver;

import bankguruPageUIs.managerHomePageUI;
import bankguruPageUIs.newAccountPageUI;
import commons.basePage;

import commons.pageGeneratorManagerGuru;

public class newAccountPageObject extends pageAction {
	WebDriver driver;

	public newAccountPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

	
	public void enterToIntitialDeposit(String depositValue) {
		waitForElementVisible(driver, newAccountPageUI.INITIAL_DEPOSIT_TEXTBOX);
		sendKeysToElment(driver, newAccountPageUI.INITIAL_DEPOSIT_TEXTBOX, depositValue);
		
	}

	public managerHomePageObject clickToAccountButton() {
		waitForElementClickable(driver, newAccountPageUI.ACCOUNT_SUBMIT_BUTTON);
		clickToElment(driver, newAccountPageUI.ACCOUNT_SUBMIT_BUTTON);
		return pageGeneratorManagerGuru.getmanagerHomePage(driver);
		
	}

	


	


	
	

	
}


