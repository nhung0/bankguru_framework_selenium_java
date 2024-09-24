package pageObjects.bankguru;

import org.openqa.selenium.WebDriver;

import bankguruPageUIs.loginPageUI;
import commons.basePage;

import commons.pageGeneratorManagerGuru;

public class loginPageObject extends basePage {
	WebDriver driver;

	public loginPageObject(WebDriver driver) {
		this.driver = driver;
		
	}

	public void enterToUserIDTextbox(String userName ) {
		
		waitForElementVisible(driver, loginPageUI.USERID_TEXTBOX);
		sendKeysToElment(driver, loginPageUI.USERID_TEXTBOX, userName);
		
	}

	public void enterToPasswordTextbox(String password ) {
		waitForElementVisible(driver, loginPageUI.PASSWORD_TEXTBOX);
		sendKeysToElment(driver, loginPageUI.PASSWORD_TEXTBOX, password);
		
		
	}

	public void clickToResetButton() {
		waitForElementClickable(driver, loginPageUI.RESET_BUTTON);
		clickToElment(driver,loginPageUI.RESET_BUTTON);
		
	}

	public managerHomePageObject clickToLoginButton() {
		waitForElementClickable(driver, loginPageUI.LOGIN_BUTTON);
		clickToElment(driver, loginPageUI.LOGIN_BUTTON);
		return pageGeneratorManagerGuru.getmanagerHomePage(driver);
		
	}

}
