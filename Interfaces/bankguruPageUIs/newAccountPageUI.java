package bankguruPageUIs;

import org.openqa.selenium.WebDriver;

import commons.basePage;

public class newAccountPageUI  {
	
	
	public static final String ACCOUNT_TYPE_DROPDOWN = "xpath=//td[text()= ' Account type']//following-sibling::td//option[text()='Savings']";
	public static final String INITIAL_DEPOSIT_TEXTBOX = "xpath=//input[@name='inideposit']";
	public static final String ACCOUNT_SUBMIT_BUTTON = "xpath=//input[@name='button2']";
	public static final String ACCOUNT_DROPDOWN = "xpath=//td[text()= ' Account type']//following-sibling::td//select";

	
}
