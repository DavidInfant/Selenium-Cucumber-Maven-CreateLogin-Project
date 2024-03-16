package org.stepdefinition;

import org.sam.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass{
	@Before
	private void preconditions() {
		launchBingBrowser();
		bingWindowMaximizer();
	}
	@After
	private void postcondition() {
		closeEntireBingBrowser();
	}

}
