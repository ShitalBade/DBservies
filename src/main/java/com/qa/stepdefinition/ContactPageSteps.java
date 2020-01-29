package com.qa.stepdefinition;

import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactPageSteps extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	
	@Given("^user on loginpage$")
	public void user_on_loginpage() throws Throwable {
	    TestBase.initalization();
	}

	@Then("^Login  user$")
	public void login_user() throws Throwable {
	  
		loginpage=new LoginPage();
		 loginpage.loginPage(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@Then("^user on  homepage$")
	public void user_on_homepage() throws Throwable {
	  
		homepage=new HomePage();
		 String homepagetitle =homepage.getHomepageTitle();
		 System.out.println("HomePageTitile is = "+homepagetitle);
	}

	@Then("^validate current user$")
	public void validate_current_user() throws Throwable {
		String str=homepage.getUsername();
	System.out.println("Current user name is = " +str);
	}

	@Then("^click on contacts$")
	public void click_on_contacts() throws Throwable {
		
	homepage.clickOnContacts();
		
	  
	}


	
	
	
	
	
}
