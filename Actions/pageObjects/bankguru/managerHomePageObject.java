package pageObjects.bankguru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bankguruPageUIs.managerHomePageUI;
import bankguruPageUIs.pageActionUI;
import commons.basePage;

import commons.pageGeneratorManagerGuru;


public class managerHomePageObject extends pageAction {
	WebDriver driver;

	public managerHomePageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

	
	public newCustomerPageObject openNewCusModule() {
		waitForElementVisible(driver, managerHomePageUI.NEW_CUSTOMER_MODULE);
		clickToElment(driver, managerHomePageUI.NEW_CUSTOMER_MODULE);
		return pageGeneratorManagerGuru.getNewCustomerPage(driver);
	}

	

	public String getNameCusValue() {
		waitForElementVisible(driver, managerHomePageUI.CUSTOMER_NAME_TEXTBOX);
		return getElmentText(driver, managerHomePageUI.CUSTOMER_NAME_TEXTBOX);
		
	}

	public String getDateOfBirthValue() {
		waitForElementVisible(driver, managerHomePageUI.DATE_OF_BIRTH_TEXTBOX);
		return getElmentText(driver, managerHomePageUI.DATE_OF_BIRTH_TEXTBOX);
	}

	public String getAddressValue() {
		waitForElementVisible(driver, managerHomePageUI.ADDRESS_TEXTAREA);
		return getElmentText(driver, managerHomePageUI.ADDRESS_TEXTAREA);
	}

	public String getPinValue() {
		waitForElementVisible(driver, managerHomePageUI.PIN_TEXTBOX);
		return getElmentText(driver, managerHomePageUI.PIN_TEXTBOX);
	}

	public String getCityValue() {
		waitForElementVisible(driver, managerHomePageUI.CITY_TEXTBOX);
		return getElmentText(driver, managerHomePageUI.CITY_TEXTBOX);
	}

	public String getMobileNumberValue() {
		waitForElementVisible(driver, managerHomePageUI.MOBILE_NUMBER);
		return getElmentText(driver, managerHomePageUI.MOBILE_NUMBER);
	}

	public String getEmailValue() {
		waitForElementVisible(driver, managerHomePageUI.EMAIL_TEXTBOX);
		return getElmentText(driver, managerHomePageUI.EMAIL_TEXTBOX);
	}


	public boolean isDateOfBirthDisplayed() {
		waitForElementVisible(driver, managerHomePageUI.DATE_OF_BIRTH_TEXTBOX );
		return isElementDisplayed(driver, managerHomePageUI.DATE_OF_BIRTH_TEXTBOX );
	}


	public String getCusID() {
		waitForElementVisible(driver, managerHomePageUI.CUSTOMER_ID);
		return getElmentText(driver, managerHomePageUI.CUSTOMER_ID);
		
	}


	public editCustomerPageObject openEditCusModule() {
		waitForElementClickable(driver, managerHomePageUI.EDIT_CUSTOMER_MODULE);
		clickToElment(driver, managerHomePageUI.EDIT_CUSTOMER_MODULE);
		return pageGeneratorManagerGuru.geteditCustomerPage(driver);
	}


	

	


	



	public String getAccountID() {
		waitForElementVisible(driver, managerHomePageUI.ACCOUNT_ID);
		return getElmentText(driver, managerHomePageUI.ACCOUNT_ID);
	}


	
	


	
	
	
	





}
