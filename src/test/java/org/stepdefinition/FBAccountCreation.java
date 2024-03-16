package org.stepdefinition;

import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.sam.BaseClass;
import org.sam.FBPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBAccountCreation extends BaseClass{
	FBPojo fb;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	   launchBingBrowser();
	   bingWindowMaximizer();
	}
	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
	 launchBingUrl("https://www.facebook.com/");   
	}
	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
	 fb = new FBPojo();
	 clickBtn(fb.getCreateNewAccount());
	}
	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(5000);
		Map<String, String> m = d.asMap(String.class, String.class);
		fb = new FBPojo();
		passText(m.get("firstname2"), fb.getFirstName());
	}
	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
		fb = new FBPojo();
		passText("Doe", fb.getLastName());
	}
	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
		List<List<String>> lists = d.asLists();
		fb = new FBPojo();
		passText(lists.get(1).get(2), fb.getmobileNumberOrEmailTxtBox());
		
	}	
	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		fb = new FBPojo();
		passText("selenium123", fb.getPassword());
	}

	@Then("To close the edge browser")
	public void to_close_the_edge_browser() {
	    //closeEntireBingBrowser();
	}


}
