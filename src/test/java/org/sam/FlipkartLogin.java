package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin extends BaseClass {
	public FlipkartLogin() {
		PageFactory.initElements(bingDriver, this);
	}
	@FindBy(id="email")
	private WebElement email;
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement password;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return loginBtn;
	}

}
