package pageObjects.bankguru;

import org.openqa.selenium.WebDriver;

import bankguruPageUIs.managerHomePageUI;
import bankguruPageUIs.newCustomerPageUI;
import commons.basePage;

import commons.pageGeneratorManagerGuru;


public class newCustomerPageObject extends pageAction {
	WebDriver driver;

	public newCustomerPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}



	public void clickToResetButton() {
		waitForElementClickable(driver, newCustomerPageUI.RESET_BUTTON);
		clickToElment(driver, newCustomerPageUI.RESET_BUTTON);
		
		
		
	}

	public void enterToNameCusTextbox(String cusName) {
		
		waitForElementVisible(driver, newCustomerPageUI.CUSTOMER_NAME_TEXTBOX);
		sendkeyToElementByJS(driver, newCustomerPageUI.CUSTOMER_NAME_TEXTBOX, cusName);
		
	}

	

	public void enterToDateOfBirthPicker(String dob) {


		
		waitForElementVisible(driver, newCustomerPageUI.DATE_OF_BIRTH_TEXTBOX);
	
		sendKeysToElment(driver, newCustomerPageUI.DATE_OF_BIRTH_TEXTBOX, dob);
		sleepInSecond(5);
		
		
	}

	public void enterToAddressTextbox(String add) {
		waitForElementVisible(driver, newCustomerPageUI.ADDRESS_TEXTAREA);
		sleepInSecond(5);
		sendKeysToElment(driver, newCustomerPageUI.ADDRESS_TEXTAREA, add);
		
		
	}

	public void enterToCityTextbox(String city) {
		waitForElementVisible(driver, newCustomerPageUI.CITY_TEXTBOX);
		sendKeysToElment(driver, newCustomerPageUI.CITY_TEXTBOX, city);
		
		
	}

	public void enterToStateTextbox(String state) {
		waitForElementVisible(driver, newCustomerPageUI.STATE_TEXTBOX);
		sendKeysToElment(driver, newCustomerPageUI.STATE_TEXTBOX, state);
		
		
	}

	public void enterToPinTextbox(String pin) {
		waitForElementVisible(driver, newCustomerPageUI.PIN_TEXTBOX);
		sendKeysToElment(driver, newCustomerPageUI.PIN_TEXTBOX, pin);
		
		
	}

	public void enterMobileNumberTextbox(String mobileNum) {
		waitForElementVisible(driver, newCustomerPageUI.MOBILE_NUMBER);
		sendKeysToElment(driver, newCustomerPageUI.MOBILE_NUMBER, mobileNum);
		
		
	}

	public void enterToEmailTextbox(String email) {
		waitForElementVisible(driver, newCustomerPageUI.EMAIL_TEXTBOX);
		sendKeysToElment(driver, newCustomerPageUI.EMAIL_TEXTBOX, email);
		
		
	}

	public void enterToPasswordTextbox(String pass) {
		waitForElementVisible(driver, newCustomerPageUI.PASSWORD_TEXTBOX);
		sendKeysToElment(driver, newCustomerPageUI.PASSWORD_TEXTBOX, pass);
		
		
	}

	public managerHomePageObject clickToNewCusButton() {
		waitForElementClickable(driver, newCustomerPageUI.SUBMIT_BUTTON);
		clickToElment(driver, newCustomerPageUI.SUBMIT_BUTTON);
		sleepInSecond(4);
		return pageGeneratorManagerGuru.getmanagerHomePage(driver);
	}






	public String getValueDate() {
		waitForElementVisible1(driver, newCustomerPageUI.DATE_OF_BIRTH_TEXTBOX);
		return getElmentAttribute(driver, newCustomerPageUI.DATE_OF_BIRTH_TEXTBOX, "value");
		
		
	}



	public void closeAd() {
		waitForElementClickable(driver, getValueDate());
		clickToElment(driver, getValueDate());
		
	}



	




	



	


	


}
