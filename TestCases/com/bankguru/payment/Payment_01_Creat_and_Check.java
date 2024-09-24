package com.bankguru.payment;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.baseTest;
import commons.globalConstants;
import commons.pageGeneratorManagerGuru;
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
import pageObjects.bankguru.withDrawalPageObject;
import pojoData.bankGuru.AccountCusInfo;
import pojoData.bankGuru.EditCusInfo;
import pojoData.bankGuru.NewCusInfo;
import reportConfig1.ExtentManager;
import reportConfig1.ExtentTestManager;

public class Payment_01_Creat_and_Check extends baseTest {

	WebDriver driver;
	private loginPageObject loginPage;
	private newCustomerPageObject newCusPage;
	private editCustomerPageObject editCusPage;
	private deleteCustomerPageObject deleteCusPage;
	private managerHomePageObject managerPage;

	private NewCusInfo cusInfo;
	private String CurrentDateOfBirthValue;
	private String CusID;
	private String AccID;
	private EditCusInfo editInfo;
	private newAccountPageObject newAccPage;
	private editAccountPageObject editAccPage;

	private AccountCusInfo accInfo;
	private String firstAccountID;
	private String secondAccountID;
	private depositPageObject depositPage;
	private withDrawalPageObject withDrawalPage;
	private fundTransferPageObject fundTransferPage;
	private balanceEnquiryPageObject balancePage;
	private deleteAccountPageObject deleteAccPage;
	
	
	

	@Parameters({"url", "browser", })
	@BeforeClass
	public void beforeClass(String url, String browserName) {
		driver = getBrowserDriver(url, browserName);
		cusInfo = new NewCusInfo();
		editInfo = new EditCusInfo();
		accInfo = new AccountCusInfo();
		
		cusInfo.setCusName("AUTOMATION TESTING");
		cusInfo.setGender("f");
		cusInfo.setDateOfBirth("01-01-1989");
		cusInfo.setAddress("BO Box 911 8331 Duis Avenue");
		cusInfo.setCity("Tampa");
		cusInfo.setEmail(randomEmail());
		cusInfo.setMobile("4555442476");
		cusInfo.setPassword("automation");
		cusInfo.setPin("466250");
		cusInfo.setState("FL");
		
		
		editInfo.setEditaddress("1883 Cursus Avenue");
		editInfo.setEditcity("Houston");
		editInfo.setEditpin("166455");
		editInfo.setEditstate("Texas");
		editInfo.setEditmobile("0987685443");
		
		accInfo.setAccountType("Savings");
		accInfo.setInitialdeposit("50000");
		accInfo.setInitialdeposit2("10000");
		accInfo.setAccountAmount("5000");
		accInfo.setWithdAmount("15000");
		accInfo.setDepositdescription("Deposit");
		accInfo.setWithddescription("Withdrawal");
		
		accInfo.setFunddescription("Tranfer");
		accInfo.setFundAmount("10000");
		
		
		loginPage = pageGeneratorManagerGuru.getLoginPage(driver);

		loginPage.enterToUserIDTextbox(globalConstants.USER_BANKGURU_USERID);
		loginPage.enterToPasswordTextbox(globalConstants.USER_BANKGURU_PASSWORD);
		managerPage = loginPage.clickToLoginButton();
	
		

	}

	@Test
	public void payment_01_creat_new_customer_account(Method method) {
		ExtentTestManager.startTest(method.getName(), "Create new customer account");
		
		ExtentTestManager.getTest().log(Status.INFO, "Open new customer page");
		managerPage.openMultiplePageModule("New Customer");
		ExtentTestManager.getTest().log(Status.INFO, "Switch to new customer texbox");
		newCusPage = pageGeneratorManagerGuru.getNewCustomerPage(driver);
		ExtentTestManager.getTest().log(Status.INFO, "Enter to  name customer texbox");
		newCusPage.enterToDymamicTextbox("name", cusInfo.getCusName());
		ExtentTestManager.getTest().log(Status.INFO, "Select to  gender customer texbox");
		newCusPage.clickToGenderRadioButtonByValue(cusInfo.getGender());
		System.out.println("a");
		ExtentTestManager.getTest().log(Status.INFO, "Enter to  Date of Birth customer texbox");
		newCusPage.enterToDymamicTextbox("dob", cusInfo.getDateOfBirth());
		System.out.println(0);
		ExtentTestManager.getTest().log(Status.INFO, "Enter to  Address customer texbox");
		newCusPage.enterToAddressTextbox(cusInfo.getAddress());
		ExtentTestManager.getTest().log(Status.INFO, "Enter to  City customer texbox");
		newCusPage.enterToDymamicTextbox("city", cusInfo.getCity());
		ExtentTestManager.getTest().log(Status.INFO, "Enter to  State customer texbox");
		newCusPage.enterToDymamicTextbox("state", cusInfo.getState());
		ExtentTestManager.getTest().log(Status.INFO, "Enter to  Pin customer texbox");
		newCusPage.enterToDymamicTextbox("pinno", cusInfo.getPin());
		ExtentTestManager.getTest().log(Status.INFO, "Enter to  Mobile customer texbox");
		newCusPage.enterToDymamicTextbox("telephoneno", cusInfo.getMobile());
		ExtentTestManager.getTest().log(Status.INFO, "Enter to  Email customer texbox");
		newCusPage.enterToDymamicTextbox("emailid", cusInfo.getEmail());
		ExtentTestManager.getTest().log(Status.INFO, "Enter to  Password customer texbox");
		newCusPage.enterToDymamicTextbox("password", cusInfo.getPassword());
		ExtentTestManager.getTest().log(Status.INFO, "Get entered Date of Birth customer");
		CurrentDateOfBirthValue = newCusPage.getValueDate();
		System.out.println("b");
		ExtentTestManager.getTest().log(Status.INFO, "Click to Submit Button of New Customer Page");
		newCusPage.clickToDynamicPageButton("sub");
		System.out.println("c");
		ExtentTestManager.getTest().log(Status.INFO, "Verify Customer Registered Message displayed ");
		Assert.assertTrue(newCusPage.isSuccessMessageDisplayed("Customer Registered Successfully!!!"));
		System.out.println(1);
		ExtentTestManager.getTest().log(Status.INFO, "Verify Customer Name is True compare to initial value ");
		Assert.assertEquals(newCusPage.getDynamicTextValue("Customer Name"), cusInfo.getCusName());
		ExtentTestManager.getTest().log(Status.INFO, "Verify Customer Birthdate is True compare to initial value ");
		Assert.assertEquals(newCusPage.getDynamicTextValue("Birthdate"), CurrentDateOfBirthValue);
		ExtentTestManager.getTest().log(Status.INFO, "Verify Customer Address is True compare to initial value");
		Assert.assertEquals(newCusPage.getDynamicTextValue("Address"), cusInfo.getAddress());
		ExtentTestManager.getTest().log(Status.INFO, "Verify Customer City is True compare to initial value");
		Assert.assertEquals(newCusPage.getDynamicTextValue("City"), cusInfo.getCity());
		ExtentTestManager.getTest().log(Status.INFO, "Verify Customer Pin is True compare to initial value");
		Assert.assertEquals(newCusPage.getDynamicTextValue("Pin"), cusInfo.getPin());
		ExtentTestManager.getTest().log(Status.INFO, "Verify Customer Mobile No. is True compare to initial value");
		Assert.assertEquals(newCusPage.getDynamicTextValue("Mobile No."), cusInfo.getMobile());
		ExtentTestManager.getTest().log(Status.INFO, "Verify Customer Email is True compare to initial value");
		Assert.assertEquals(newCusPage.getDynamicTextValue("Email"), cusInfo.getEmail());
		
	}

	@Test
	public void payment_02_edit_customer_account(Method method) {
		
		ExtentTestManager.startTest(method.getName(), "Edit customer account");
		
		ExtentTestManager.getTest().log(Status.INFO, "Get Customer ID");
		CusID = newCusPage.getDynamicID("Customer ID");
		ExtentTestManager.getTest().log(Status.INFO, "Open Edit CUstomer Page");
		newCusPage.openMultiplePageModule("Edit Customer");
		editCusPage = pageGeneratorManagerGuru.geteditCustomerPage(driver);
		
		editCusPage.enterToDymamicTextbox("cusid", CusID);
		
		editCusPage.clickToDynamicPageButton("AccSubmit");
		
		editCusPage.enterNewAddress(editInfo.getEditaddress());
		
		editCusPage.enterToDymamicTextbox("city",editInfo.getEditcity());
		editCusPage.enterToDymamicTextbox("state",editInfo.getEditstate());
		editCusPage.enterToDymamicTextbox("pinno",editInfo.getEditpin());
		editCusPage.enterToDymamicTextbox("telephoneno",editInfo.getEditmobile());
	
		editCusPage.clickToDynamicPageButton("sub");
		
		editCusPage.isAlertDisplayedandAcceptAlert();
		
		

	}

	@Test
	public void payment_03_new_account(Method method) {
		ExtentTestManager.startTest(method.getName(), "Create new account");
		editCusPage.openMultiplePageModule("New Account");
		
		newAccPage = pageGeneratorManagerGuru.getnewAccountPage(driver);
		
		newAccPage.enterToDymamicTextbox( "cusid", CusID);
		
		newAccPage.selectDynamicDropdown("Account type", accInfo.getAccountType());
		
		newAccPage.enterToDymamicTextbox("inideposit", accInfo.getInitialdeposit());
		
		newAccPage.clickToDynamicPageButton("button2");
		
		Assert.assertTrue(newAccPage.isSuccessMessageDisplayed("Account Generated Successfully!!!"));
		Assert.assertEquals(newAccPage.getDynamicTextValue("Current Amount"), accInfo.getInitialdeposit());
		firstAccountID = newAccPage.getDynamicID("Account ID");
		
		
		newAccPage.openMultiplePageModule("New Account");
		newAccPage = pageGeneratorManagerGuru.getnewAccountPage(driver);
		
		newAccPage.enterToDymamicTextbox("cusid", CusID);
		
		newAccPage.selectDynamicDropdown("Account type", accInfo.getAccountType());
		
		newAccPage.enterToDymamicTextbox("inideposit",accInfo.getInitialdeposit2());
		
		newAccPage.clickToDynamicPageButton("button2");
		
		Assert.assertTrue(newAccPage.isSuccessMessageDisplayed("Account Generated Successfully!!!"));
		Assert.assertEquals(newAccPage.getDynamicTextValue("Current Amount"), accInfo.getInitialdeposit2());
		secondAccountID = newAccPage.getDynamicID("Account ID");
	}

	@Test
	public void payment_04_edit_account(Method method) {
		ExtentTestManager.startTest(method.getName(), "Edit new account");
		newAccPage.openMultiplePageModule("Edit Account");
		editAccPage = pageGeneratorManagerGuru.geteditAccountPage(driver);
		
		editAccPage.enterToDymamicTextbox("accountno",firstAccountID);
		
		//depositPage = editAccPage.clickToDynamicPageButton("AccSubmit");
		
		// khong truy cap duoc trang edit account
	

	}
	
	@Test
	public void payment_05_tranfer_money(Method method) {
		ExtentTestManager.startTest(method.getName(), "Switch Deposit Page");
		editAccPage.openMultiplePageModule("Deposit");
		depositPage = pageGeneratorManagerGuru.getdepositPage(driver);
		
		depositPage.enterToDymamicTextbox("accountno", firstAccountID);
		
		depositPage.enterToDymamicTextbox("ammount", accInfo.getAccountAmount());
		
		depositPage.enterToDymamicTextbox("desc", accInfo.getDepositdescription());
	
//		depositPage.clickToDynamicPageButton("AccSubmit");

//		
//		Assert.assertTrue(depositPage.isSuccessMessageDisplayed("Account Generated Successfully!!!"));

//		Assert.assertEquals(depositPage.getDynamicTextValue(""), "55000");

//		
		
		// deposit result khong try cap duoc
		
	

	}
	
	
	@Test
	public void payment_06_withdrawal_money() {
		
		 depositPage.openMultiplePageModule("Withdrawal");
		 withDrawalPage = pageGeneratorManagerGuru.getwithDrawalPage(driver);
		 
		 withDrawalPage.enterToDymamicTextbox("accountno", firstAccountID);
		 withDrawalPage.enterToDymamicTextbox("ammount", accInfo.getWithdAmount());
		
		withDrawalPage.enterToDymamicTextbox("desc", accInfo.getWithddescription());
		withDrawalPage.clickToDynamicPageButton("AccSubmit");
		
		Assert.assertTrue(withDrawalPage.isSuccessMessageDisplayed("Transaction details of Withdrawal for Account " + firstAccountID));
		//Assert.assertEquals(depositPage.getDynamicTextValue(""), "40000");
	

	}
	
	
	@Test
	public void payment_07_fund_transfer() {
		withDrawalPage.openMultiplePageModule("Fund Transfer");
		fundTransferPage = pageGeneratorManagerGuru.getfundTransferPage(driver);
		
		fundTransferPage.enterToDymamicTextbox("payersaccount", firstAccountID);
		fundTransferPage.enterToDymamicTextbox("payeeaccount", secondAccountID);
		fundTransferPage.enterToDymamicTextbox("ammount", accInfo.getFundAmount());

		fundTransferPage.enterToDymamicTextbox("desc", accInfo.getFunddescription());

		fundTransferPage.clickToDynamicPageButton("AccSubmit");
		Assert.assertTrue(fundTransferPage.isSuccessMessageDisplayed("Fund Transfer Details"));
		Assert.assertEquals(fundTransferPage.getDynamicTextValue("Amount"),accInfo.getFundAmount() );
		 


	}
	
	@Test
	public void payment_08_balance() {
		withDrawalPage.openMultiplePageModule("Balance Enquiry");
		balancePage = pageGeneratorManagerGuru.getbalanceEnquiryPage(driver);
		
		balancePage.enterToDymamicTextbox("accountno", firstAccountID);
		
//		balancePage.clickToDynamicPageButton("AccSubmit");
//		Assert.assertTrue(balancePage.isSuccessMessageDisplayed(""));
//		Assert.assertEquals(balancePage.getDynamicTextValue(""),"30000" );

		// balace Enquiry result khong truy cap duoc
	}

	@Test
	public void payment_09_delete_account() {
		balancePage.openMultiplePageModule("Delete Account");
		deleteAccPage = pageGeneratorManagerGuru.getdeleteAccountPage(driver);
		
		deleteAccPage.enterToDymamicTextbox("accountno", firstAccountID);
		
		deleteAccPage.clickToDynamicPageButton("AccSubmit");
		deleteAccPage.isAlertDisplayedandCancelAlert();
//		Assert.assertTrue(deleteAccPage.isSuccessMessageDisplayed(""));
		
		
		deleteAccPage.openMultiplePageModule("Edit Account"); 
		 editAccPage = pageGeneratorManagerGuru.geteditAccountPage(driver); 
		 editAccPage.enterToDymamicTextbox("accountno", firstAccountID);
//		 editAccPage.clickToDynamicPageButton("AccSubmit");
//		 Assert.assertTrue(editAccPage.isSuccessMessageDisplayed(""));
		
		// không thẻ truy cap duocj trang delete account result
		
		
		
		 


	}

	@Test
	public void payment_10_delete_customer() {
		editAccPage.openMultiplePageModule("Delete Customer");
		deleteCusPage = pageGeneratorManagerGuru.getDeleteCustomerPage(driver);
		
		deleteCusPage.enterToDymamicTextbox("cusid", CusID);
		deleteCusPage.clickToDynamicPageButton("AccSubmit");
		deleteCusPage.isAlertDisplayedandAcceptAlert();
		deleteCusPage.isAlertDisplayedandAcceptAlert();
//		Assert.assertTrue(deleteCusPage.isSuccessMessageDisplayed(""));
//		
//		deleteCusPage.openMultiplePageModule("Edit Customer");
//		editCusPage = pageGeneratorManagerGuru.geteditCustomerPage(driver);
//		editCusPage.enterToDymamicTextbox("cusid", CusID);
//		Assert.assertTrue(deleteCusPage.isSuccessMessageDisplayed(""));
		
		
		// không thẻ truy cap duocj trang delete customer result

	}

	
	

	@AfterClass
	public void afterClass() {
		//driver.quit();
	}

}

