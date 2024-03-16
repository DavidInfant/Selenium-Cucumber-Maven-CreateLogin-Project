package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition", monochrome = true, snippets = SnippetType.UNDERSCORE,
tags = "@ICICIBank", plugin = {"html:Report", "junit:Report\\Junitreport.xml", "json:Report\\Jasonreport.json"})
public class TestRunnerClass {

}
