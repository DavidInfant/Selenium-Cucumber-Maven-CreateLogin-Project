package org.stepdefinition;

import org.sam.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHook extends BaseClass{
	@Before(order = 2, value = "@ICICIBank")
	private void precondition1() {
		bingWindowMaximizer();
	}
	@Before(order = 1, value = "@ICICIBank")
	private void precondition2() {
		launchBingBrowser();
}	
	@After(order = 2, value = "@ICICIBank")
	private void postcondition1() {
		System.out.println("TakesScreenshot");
	}
	@After(order = 1, value = "@ICICIBank")
	private void postcondition2() {
		System.out.println("Close the browser");
	}
	
}