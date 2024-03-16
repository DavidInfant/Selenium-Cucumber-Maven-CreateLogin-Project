package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass{
	public AmazonPojo() {
		PageFactory.initElements(bingDriver, this);
	}
	@FindBy(xpath = "//a[@class='a-button-text']")
	private WebElement createNewAccount;
	
	@FindBy(id = "ap_customer_name")
	private WebElement firstAndLastname;
	
	@FindBy(id = "ap_phone_number")
	private WebElement mobileNumber;
	
	@FindBy(id = "ap_password")
	private WebElement passwordBox;

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public WebElement getFirstAndLastname() {
		return firstAndLastname;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getPasswordBox() {
		return passwordBox;
	}
	
	

}
