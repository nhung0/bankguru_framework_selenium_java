package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.bankguru.balanceEnquiryPageObject;
import pageObjects.bankguru.deleteAccountPageObject;
import pageObjects.bankguru.deleteCustomerPageObject;
import pageObjects.bankguru.depositPageObject;

import pageObjects.bankguru.editAccountPageObject;

import pageObjects.bankguru.editCustomerPageObject;
import pageObjects.bankguru.fundTransferPageObject;
import pageObjects.bankguru.loginPageObject;
import pageObjects.bankguru.managerHomePageObject;
import pageObjects.bankguru.newAccountPageObject;
import pageObjects.bankguru.newCustomerPageObject;
import pageObjects.bankguru.pageAction;
import pageObjects.bankguru.withDrawalPageObject;


public class pageGeneratorManagerGuru extends basePage {
	
	
	public  static deleteCustomerPageObject getDeleteCustomerPage(WebDriver driver) {
		return new deleteCustomerPageObject(driver);
		
	}
	
	
	public  static loginPageObject getLoginPage(WebDriver driver) {
		return new loginPageObject(driver);
		
	}
	
	public  static newCustomerPageObject getNewCustomerPage(WebDriver driver) {
		return new newCustomerPageObject(driver);
		
	}
	
	
	public  static newAccountPageObject getnewAccountPage(WebDriver driver) {
		return new newAccountPageObject(driver);
		
	}
	
	public  static balanceEnquiryPageObject getbalanceEnquiryPage(WebDriver driver) {
		return new balanceEnquiryPageObject(driver);
		
	}
	
	public  static deleteAccountPageObject getdeleteAccountPage(WebDriver driver) {
		return new deleteAccountPageObject(driver);
		
	}
	
	public  static depositPageObject getdepositPage(WebDriver driver) {
		return new depositPageObject(driver);
		
	}
	
	
	public  static editAccountPageObject geteditAccountPage(WebDriver driver) {
		return new editAccountPageObject(driver);
		
	}
	
	public  static editCustomerPageObject geteditCustomerPage(WebDriver driver) {
		return new editCustomerPageObject(driver);
		
	}
	
	public  static fundTransferPageObject getfundTransferPage(WebDriver driver) {
		return new fundTransferPageObject(driver);
		
	}
	
	public  static managerHomePageObject getmanagerHomePage(WebDriver driver) {
		return new managerHomePageObject(driver);
		
	}
	

	public  static withDrawalPageObject getwithDrawalPage(WebDriver driver) {
		return new withDrawalPageObject(driver);
		
	}
	
	public  static pageAction getpageAction(WebDriver driver) {
		return new pageAction(driver);
		
	}
	
	
	

	
	
	
	
	
	
	
}
