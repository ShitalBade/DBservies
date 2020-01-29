package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\udemy_class\\Cucumber_Project\\Cucumber_POM\\src\\main\\java\\com\\qa\\feature\\Login.feature",
		glue= {"com/qa/stepdefinition"},
		dryRun=false,
		monochrome=true,
		strict=true,
		format= {"pretty","html:html_output"}
		//tags= {"@Tag1"}
		
		

		
		)

public class TestRunner {

}
