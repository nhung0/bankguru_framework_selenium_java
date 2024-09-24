package pageObjects.bankguru;

import org.openqa.selenium.WebDriver;

import bankguruPageUIs.depositPageUI;
import commons.basePage;

public class depositPageObject extends pageAction {
	WebDriver driver;

	public depositPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

	public void enterToAmounTextbox(String accountAmount) {
		waitForElementVisible(driver, depositPageUI.AMOUNT_TEXTBOX);
		sendKeysToElment(driver,  depositPageUI.AMOUNT_TEXTBOX, accountAmount);
		
	}

	public void enterToDescriptionTextbox(String description) {
		
		waitForElementVisible(driver, depositPageUI.DESCRIPTION_TEXTBOX);
		sendKeysToElment(driver,  depositPageUI.DESCRIPTION_TEXTBOX, description);
	}

	public void clickToSubmitButton() {
		waitForElementClickable(driver, depositPageUI.DEPOSIT_BUTTON);
		clickToElment(driver, depositPageUI.DEPOSIT_BUTTON);
		
	}

	public java.lang.String getCurrentAmountText() {
		
		return null;
	}


}
