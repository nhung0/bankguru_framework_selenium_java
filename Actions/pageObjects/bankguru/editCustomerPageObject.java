package pageObjects.bankguru;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import bankguruPageUIs.editCustomerPageUI;
import bankguruPageUIs.newCustomerPageUI;
import commons.basePage;


public class editCustomerPageObject extends pageAction {
	WebDriver driver;

	public editCustomerPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

	

	public void enterNewAddress(String add) {
		waitForElementVisible(driver, editCustomerPageUI.EDIT_ADDRESS_TEXTAREA);
		sendKeysToElment(driver,  editCustomerPageUI.EDIT_ADDRESS_TEXTAREA, add);
		
		
	}

	public void enterNewCity(String city) {
		waitForElementVisible(driver, editCustomerPageUI.EDIT_CITY_TEXTBOX);
		sendKeysToElment(driver,  editCustomerPageUI.EDIT_CITY_TEXTBOX, city);
		
	}

	public void enterNewState(String state) {
		waitForElementVisible(driver, editCustomerPageUI.EDIT_STATE_TEXTBOX);
		sendKeysToElment(driver,  editCustomerPageUI.EDIT_STATE_TEXTBOX, state);
		
	}

	public void enterNewPIN(String pin) {
		waitForElementVisible(driver, editCustomerPageUI.EDIT_PIN_TEXTBOX);
		sendKeysToElment(driver,  editCustomerPageUI.EDIT_PIN_TEXTBOX, pin);
		
	}

	public void enterNewMoblieNum(String moblile) {
		waitForElementVisible(driver, editCustomerPageUI.EDIT_MOBILE_TEXBOX);
		sendKeysToElment(driver,  editCustomerPageUI.EDIT_MOBILE_TEXBOX, moblile);
		
	}

	public void clickToEditButton2() {
		waitForElementClickable(driver, editCustomerPageUI.EDIT_BUTTON);
		clickToElment(driver, editCustomerPageUI.EDIT_BUTTON);
	}


	


	





	
	

	

	
}
