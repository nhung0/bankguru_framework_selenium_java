package pageObjects.bankguru;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;


import bankguruPageUIs.editCustomerPageUI;
import bankguruPageUIs.managerHomePageUI;
import bankguruPageUIs.newAccountPageUI;
import bankguruPageUIs.newCustomerPageUI;
import bankguruPageUIs.pageActionUI;
import commons.basePage;

import pojoData.bankGuru.NewCusInfo;

public class pageAction extends basePage { // ddooir thafnh baseAction chua cac ham dung chung cua cac page object
	private WebDriver driver;

	private NewCusInfo cusInfo;

	private WebDriver pageGeneratorManager;

	public pageAction(WebDriver driver) {

		this.driver = driver;
	}
	
	
	
	

	protected pageAction(WebDriver driver, NewCusInfo cusInfo, WebDriver pageGeneratorManager) {
		
		this.pageGeneratorManager = pageGeneratorManager;
	}





	public boolean isSuccessMessageDisplayed(String successMess) {
		waitForElementVisible(driver, pageActionUI.DYNAMIC_SUCCESS_TITLE, successMess);
		return isElementDisplayed(driver, pageActionUI.DYNAMIC_SUCCESS_TITLE, successMess);

	}
	
	public void clickToGenderRadioButtonByValue(String gender) {
		
		clickToElementByJS(driver, pageActionUI.DYNAMIC_GENDER_RADIO_BUTTON, gender);

}
	
	
	public void openDymamicModule(String pageName) {
		waitForElementClickable(driver, pageActionUI.DYNAMIC_GURU_MODULE, pageName);
		clickToElment(driver, pageActionUI.DYNAMIC_GURU_MODULE, pageName);
		
	}
	

	
	public String getCurrentAmountText() {
		waitForElementVisible(driver, pageActionUI.CURRENT_AMOUNT_TEXTBOX);
		return getElmentText(driver, pageActionUI.CURRENT_AMOUNT_TEXTBOX);
	}

	

	public void enterToDymamicTextbox(String locator,String value ) {
		waitForElementVisible(driver, pageActionUI.DYMAMIC_TEXTBOX, locator);
		sendKeysToElment(driver, pageActionUI.DYMAMIC_TEXTBOX, value, locator );
		
	}
	
	public String getDynamicTextValue(String locatorName) {
		waitForElementVisible(driver, pageActionUI.DYMAMIC_TEXT_INTO_TABLE,locatorName);
		return getElmentText(driver, pageActionUI.DYMAMIC_TEXT_INTO_TABLE, locatorName );
		
	}
	
	public void clickToDynamicPageButton(String locatorName) {
		waitForElementClickable(driver, pageActionUI.DYNAMIC_SUBMIT_BUTTON, locatorName);
		clickToElment(driver, pageActionUI.DYNAMIC_SUBMIT_BUTTON, locatorName);
		
	}
	
	public String getDynamicID(String locatorName) {
		waitForElementVisible(driver, pageActionUI.DYNAMIC_ID, locatorName);
		return getElmentText(driver, pageActionUI.DYNAMIC_ID, locatorName);
	}
	

	public void openMultiplePageModule(String locatorName) {
		waitForElementClickable(driver, pageActionUI.DYNAMIC_GURU_MODULE,locatorName);
		clickToElment(driver, pageActionUI.DYNAMIC_GURU_MODULE,locatorName);
		
	}

	
	


	public void selectDynamicDropdown(String locatorName, String accountType) {
		selectItemInDefaultDropdown(driver,pageActionUI.DYNAMIC_DROPDOWN,accountType, locatorName );
		
	}
	
	public void isAlertDisplayedandAcceptAlert() {
		waitForAlertPresence(driver);
		acceptAlert(driver);
		
	}
	
	public void isAlertDisplayedandCancelAlert() {
		waitForAlertPresence(driver);
		cancelAlert(driver);
		
	}
	
	
	







	

}
