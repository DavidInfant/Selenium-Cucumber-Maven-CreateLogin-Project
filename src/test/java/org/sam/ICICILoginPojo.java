package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ICICILoginPojo extends BaseClass{
	public ICICILoginPojo() {
		PageFactory.initElements(bingDriver, this);
	}
	@FindBy(xpath = "//a[text()='Personal ']")
	private WebElement loginPersonal;
	
	@FindBy(name = "DUMMY1")
	private WebElement userIdBox;
	
	@FindBy(id = "AuthenticationFG.ACCESS_CODE")
	private WebElement passwordBox;

	public WebElement getLoginPersonal() {
		return loginPersonal;
	}

	public WebElement getUserIdBox() {
		return userIdBox;
	}

	public WebElement getPasswordBox() {
		return passwordBox;
	}
	

}
