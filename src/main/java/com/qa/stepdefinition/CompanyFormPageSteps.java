package com.qa.stepdefinition;
import java.util.Map;

import com.qa.pages.CompaniesPage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CompanyFormPageSteps extends TestBase {

	LoginPage loginpage;
	CompaniesPage companypage;
	
	@Given("^User is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {
	    TestBase.initalization();
	    
	    loginpage=new LoginPage();   
	    loginpage.loginPage(prop.getProperty("username"), prop.getProperty("password"));
	    
		
	}

	@Then("^User get Search Methods$")
	public void user_get_Search_Methods() throws Throwable {
	
	}

	@Then("^User find Company details$")
	public void user_find_Company_details(DataTable data) throws Throwable {
	   
		companypage = new CompaniesPage();
		companypage.countrysearch();
		companypage.priority_Search();
		companypage.status_details();
		companypage.category_details();
		
		for(Map<String,String> mapdata : data.asMaps(String.class, String.class))
		 {
			companypage.company_Details(mapdata.get("name"), mapdata.get("address"),
					mapdata.get("ZipCode") ,mapdata.get("state"),mapdata.get("city"));
			
		}
		
	    	}

	@Then("^User Find remaing company details$")
	public void user_Find_remaing_company_details(DataTable datas) throws Throwable {
	   

	for	(Map<String,String> mapdata : datas.asMaps(String.class, String.class)) {
		

		companypage.company_Details_I(mapdata.get("Description"), mapdata.get("Industry"),
				mapdata.get("EmployeeID"),mapdata.get("AnnualRvenue"), mapdata.get("VatNumber"));
		
	}
	
	}

	@Then("^ClicK on save button$")
	public void click_on_save_button() throws Throwable {
	    
		driver.quit();
		
	    
	}

	
	
}
