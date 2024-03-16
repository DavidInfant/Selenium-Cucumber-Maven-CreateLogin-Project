package org.stepdefinition;
import io.cucumber.datatable.*;
import org.sam.BaseClass;

import java.util.List;
import java.util.Map;

import org.sam.AmazonPojo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonAccountCreation extends BaseClass{
	AmazonPojo am;
	@When("To launch url of amazon application")
	public void to_launch_url_of_amazon_application() {
		launchBingUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		am = new AmazonPojo();
		clickBtn(am.getCreateNewAccount());		
	}
	@When("To pass the first and lastname in first and last text box")
	public void to_pass_the_first_and_lastname_in_first_and_last_text_box(DataTable d) {
	    Map<String, String> map = d.asMap(String.class, String.class);
		am = new AmazonPojo();
		passText(map.get("firstandlastname3"), am.getFirstAndLastname()); 
	}
	@When("To pass the mobile number in mobile number text box")
	public void to_pass_the_mobile_number_in_mobile_number_text_box() {
	    am = new AmazonPojo();
	    passText("9500315396", am.getMobileNumber());
	}
	@When("To pass the password in password text box")
	public void to_pass_the_password_in_password_text_box(DataTable d) {
	    List<List<String>> l = d.asLists();
		am = new AmazonPojo();
		passText(l.get(1).get(2), am.getPasswordBox());
	}
	@Then("close the browswer")
	public void close_the_browswer() {
	    //closeEntireBrowser();
	}
}
