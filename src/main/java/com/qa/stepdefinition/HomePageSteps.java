package com.qa.stepdefinition;

import static org.testng.Assert.assertEquals;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase {

	LoginPage loginpag;
	HomePage homepage;
	
	
	@Given("^User opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase.initalization();
		
	}

	@Given("^User on browser$")
	public void user_on_browser() throws Throwable {
		loginpag=new LoginPage();
	   String str= loginpag.validateTitle();
	   System.out.println(str);
	   assertEquals("Cogmento CRM", str);
	}

	@When("^User enter uname and pwd$")
	public void user_enter_uname_and_pwd() throws Throwable {
		 
		
		homepage= loginpag.loginPage(prop.getProperty("username"), prop.getProperty("password"));
	}



	@When("^home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
	   driver.quit();
	}


	
}
