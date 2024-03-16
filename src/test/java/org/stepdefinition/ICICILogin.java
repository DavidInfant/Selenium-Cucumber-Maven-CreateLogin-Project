package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sam.BaseClass;
import org.sam.ICICILoginPojo;

import io.cucumber.datatable.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ICICILogin extends BaseClass{
	ICICILoginPojo ilp;
	@Given("Launch the browser and maximise the window")
	public void launch_the_browser_and_maximise_the_window() {
		launchBingBrowser();
	    bingWindowMaximizer();
	}
	@When("Launch the ICICI url in the browser")
	public void launch_the_ICICI_url_in_the_browser() {
		launchBingUrl("https://www.icicibank.com/");   
	}
	@When("Click the login button")
	public void click_the_login_button() throws InterruptedException {
		Actions a = new Actions(bingDriver);
		WebElement mouse = bingDriver.findElement(By.xpath("//button[@class='hed-dropdown-toggle login-toggle']"));
		a.moveToElement(mouse).build().perform();
	    ilp = new ICICILoginPojo();
	    clickBtn(ilp.getLoginPersonal());
	    Thread.sleep(3000);
	    clickBtn(ilp.getUserIdBox());
	}
	@When("To pass the userid in userid box")
	public void to_pass_the_userid_in_userid_box(DataTable d) {
		Map<String, String> map = d.asMap(String.class, String.class);
		ilp = new ICICILoginPojo();
		passText(map.get("userid1"), ilp.getUserIdBox());   
	}
	@When("To pass the password in password box")
	public void to_pass_the_password_in_password_box(DataTable d) {
		List<List<String>> lists = d.asLists();
		ilp = new ICICILoginPojo();
	    passText(lists.get(0).get(2), ilp.getPasswordBox());
	}
	@Then("Close the browser")
	public void close_the_browser() {
		//closeEntireBingBrowser();
	}
	
}
