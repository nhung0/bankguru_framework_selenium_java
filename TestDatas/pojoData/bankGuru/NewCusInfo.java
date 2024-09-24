package pojoData.bankGuru;

import pageObjects.bankguru.newCustomerPageObject;

public class NewCusInfo {
	
	
	
	private String cusName;
	private String gender;
	private String dateOfBirth;
	
	private String address;
	private String	city;
	private String	state;
	private String	pin;	
	private String mobile;
	private String email;
	private String password;
	private String CurrentDateOfBirth;
	
	
	public String getCurrentDateOfBirth() {
		return CurrentDateOfBirth;
	}
	public void setCurrentDateOfBirth(String currentDateOfBirth) {
		CurrentDateOfBirth = currentDateOfBirth;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		
		this.gender = gender;
	}
	
	
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
