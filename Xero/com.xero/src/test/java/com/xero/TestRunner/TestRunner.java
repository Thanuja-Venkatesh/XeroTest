package com.xero.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue = {"com\\xero\\test"},
dryRun = false,
monochrome=true,
plugin = {"html:target/cucumber-report.html", "json:target/Cucumber-reports/cucumber.json"}
		
		)
public class TestRunner {
	

}
