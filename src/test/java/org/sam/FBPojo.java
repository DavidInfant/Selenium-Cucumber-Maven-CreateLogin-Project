package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBPojo extends BaseClass{
	public FBPojo() {
		PageFactory.initElements(bingDriver, this);
	}
	
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAccount;
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	
	@FindBy(name = "lastname")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@aria-label='Mobile number or email address']")
	private WebElement mobileNumberOrEmailTxtBox;
	
	@FindBy(xpath = "//input[@id='password_step_input']")
	private WebElement password;

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getmobileNumberOrEmailTxtBox() {
		return mobileNumberOrEmailTxtBox;
	}

	public WebElement getPassword() {
		return password;
	}
	
	

}
