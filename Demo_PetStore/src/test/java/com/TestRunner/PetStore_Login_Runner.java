package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/TestCases.feature",
		plugin = { "pretty","html:reports/cucumber-html-report","json:reports/cucumber-json-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/cucumber-extent-report/extentreport.html" },
		//tags = {"@TC02_PetStore"},
		glue = {"com.StepsDefinition"},
		monochrome = true
		)

public class PetStore_Login_Runner {
	@AfterClass
    public static void writeExtentReport() {
    Reporter.loadXMLConfig("src/test/resources/TestData/extent-config.xml");
}
	

}
