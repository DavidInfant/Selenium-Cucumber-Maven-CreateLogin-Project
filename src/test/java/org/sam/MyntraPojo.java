package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPojo extends BaseClass{
	public MyntraPojo() {
		PageFactory.initElements(bingDriver, this);
	}
	@FindBy(xpath = "//input[@class='desktop-searchBar']")
	private WebElement productSearchBox;
	
	@FindBy(xpath = "//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")
	private WebElement searchBtn;

	public WebElement getProductSearchBox() {
		return productSearchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	

}
