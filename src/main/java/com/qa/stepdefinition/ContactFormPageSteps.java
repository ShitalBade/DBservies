package com.qa.stepdefinition;

import java.util.Map;

import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactFormPageSteps extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	ContactPage contctpagestep;
	
	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {
	   TestBase.initalization();
	}

	@Then("^Get homepage title$")
	public void get_homepage_title() throws Throwable {
	   
		loginpage=new LoginPage();
		loginpage.loginPage(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@Then("^Enter user details$")
	public void enter_user_details(DataTable  data) throws Throwable {
		 
		contctpagestep=new  ContactPage();
		
		
		
		for(Map <String,String> details : data.asMaps(String.class, String.class)) {
			contctpagestep.enter_contact_deatails( details.get("fname"),details.get("Mname"),details.get("Lname"),details.get("CompanyName"),details.get("id"),details.get("Position"),
					details.get("Department"));
			
			contctpagestep.enter_contact_Details_1(details.get("Category"),details.get("Status"));
			
			 
		}
	    
	}

	@Then("^User Clic on save button$")
	public void user_Clic_on_save_button() throws Throwable {
		
		driver.quit();
	}

	
}
