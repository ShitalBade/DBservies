package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class CompaniesPage  extends TestBase
{
 
	@FindBy(xpath="//button[@class='ui red button']")
	WebElement ok;
	
	@FindBy(xpath="//span[text()='Companies']")
	WebElement compagion; 
	
	@FindBy(xpath="//button[text()='New']")
	WebElement New ; 
	
	@FindBy(xpath="//div[@class='ui right corner labeled input']//input")
	WebElement name; 
	
	@FindBy(xpath="//button[@class='ui small fluid positive toggle button']")
	WebElement access; 
	
	@FindBy(xpath="//input[@name='address']")
	WebElement address; 
	
	@FindBy(xpath="//input[@name='zip']")
	WebElement zip ;
	
	@FindBy(xpath="//input[@placeholder='State / County']")
	WebElement  state;
	
	@FindBy(xpath="//div[@class='ui input']//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//div[@class='ui active visible fluid search selection dropdown']//div")
	List<WebElement> country;
	public void countrysearch()
	{
		
		ok.click();
		compagion.click();
		New.click();
       for(WebElement option :country) {
			
			System.out.println(option.getText());
		     System.out.println();
		     if(option.getText().equals("India"))
		     {
		    	 option.click();
		     }	
		}
	}
	
	@FindBy(xpath="//div[@class='visible menu transition']//div")
	List<WebElement>  phone;
	
	@FindBy(xpath="//input[@placeholder='Number']")
	WebElement number;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement description ;
	
	@FindBy(xpath="//div[@class='ui active visible selection dropdown']")
	WebElement socialchannels;
	
	@FindBy(xpath="//input[@name='industry']")
	WebElement industry;
	
	@FindBy(xpath="//input[@name='num_employees']")
	WebElement numberemp;
	
	@FindBy(xpath="//input[@name='annual_revenue']")
	WebElement  annualrevenue;
	

	@FindBy(xpath="//div[@name='priority']")
	WebElement priority;
	
	@FindBy(xpath="//div[@name='priority']//div")
	List<WebElement> priority_select;
	
	public void priority_Search() {
		priority.click();
		for(WebElement option : priority_select) {
			System.out.println(option.getText());
			if (option.getText().equals("High")) {
				option.click();
			}
		}
}
	
	@FindBy( xpath="//div[@name='status']")
	WebElement status;
	
	@FindBy( xpath="//div[@name='status']//div")
	List<WebElement> status_details;
	
	public void status_details() {
		status.click();
		for(WebElement option :status_details) {
			
			if(option.getText().equals("Hot")) {
				option.click();	
			}
		}
	}
	
	@FindBy(xpath="//div[@name='source']")
	WebElement source;
	
	@FindBy(xpath="//div[@name='source']//div")
	List<WebElement> source_list;
	
	public void source_Details() {
		source.click();
		for(WebElement option : source_list) {
		
			if(option.getText().equals("Web Service")) {
				
				option.click();
				
			}
		}
	
	}
	
	
	@FindBy(xpath="//div[@name='category']")
	WebElement category;
	
	@FindBy(xpath="//div[@name='category']//div")
	List<WebElement> category_list;
	
	public void category_details() {
		category.click();
		for(WebElement options:category_list) {
			if(options.getText().equals("Partner")) {
				options.click();
				
			}
		}
		
	}
	
	
	@FindBy(xpath="//input[@name='vat_number']")
	WebElement vatnumber ;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement save ;
	
	
	
	public CompaniesPage() {
		super();
		PageFactory.initElements(driver,this);
	}

	
	public void company_Details(String Name,String Address,String Zipcoade,String State,String City) {
		
		
		name.sendKeys(Name);
		access.click();
		address.sendKeys(Address);
		zip.sendKeys(Zipcoade);
		state.sendKeys(State);
		city.sendKeys(City);
		
	}
	
	public void company_Details_I(String Description,String Industry,String NumberEmp,String AnnualRev,String VatNum) {
		
		description.sendKeys(Description);
		industry.sendKeys(Industry);
		numberemp.sendKeys(NumberEmp);
		annualrevenue.sendKeys(AnnualRev);
		vatnumber.sendKeys(VatNum);
		save.click();
	
	}
	
}
