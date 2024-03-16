package org.stepdefinition;

import io.cucumber.datatable.*;

import java.util.Map;

import org.sam.BaseClass;
import org.sam.MyntraPojo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraSearchProduct extends BaseClass{
	MyntraPojo mp;
	@When("To launch the url on myntra application")
	public void to_launch_the_url_on_myntra_application() {
	    launchBingUrl("https://www.myntra.com/");
	}

	@When("To click the product search box")
	public void to_click_the_product_search_box() {
	    mp = new MyntraPojo();
	    clickBtn(mp.getProductSearchBox());
	}

	@When("To pass the product that to be search")
	public void to_pass_the_product_that_to_be_search(DataTable d) {
	    Map<String, String> map = d.asMap(String.class, String.class);
		mp = new MyntraPojo();
		passText(map.get("product2"), mp.getProductSearchBox());
	}

	@When("To click the search button")
	public void to_click_the_search_button() {
	    mp = new MyntraPojo();
	    clickBtn(mp.getSearchBtn());
	}

	@Then("To close the applications")
	public void to_close_the_applications() {
	    //closeEntireBrowser();
	}

}
