package bankguruPageUIs;

public class pageActionUI {
	
	public static final String DYNAMIC_SUCCESS_TITLE = "xpath=//p[contains(text(), '%s')]";
	public static final String DYNAMIC_GENDER_RADIO_BUTTON = "css=input[value='%s']";
	public static final String DYNAMIC_ID_TEXTBOX = "xpath=//input[@name='%s']";
	public static final String DYNAMIC_GURU_MODULE = "xpath=//ul[@class='menusubnav']//a[text()='%s']";
	public static final String CURRENT_AMOUNT_TEXTBOX = "xpath=//td[contains(text(),'Current Amount')]/following-sibling::td";
	public static final String DYMAMIC_TEXTBOX = "xpath=//input[@name='%s']";
	
	
	public static final String DYMAMIC_TEXT_INTO_TABLE = "xpath=//td[contains(text(),'%s')]/following-sibling::td";
	public static final String DYNAMIC_SUBMIT_BUTTON = "xpath=//input[@name='%s']";
	public static final String DYNAMIC_ID = "xpath=//td[contains(text(),'%s')]/following-sibling::td";
	public static final String DYNAMIC_DROPDOWN = "xpath=//td[text()= ' %s']//following-sibling::td//select";
}
