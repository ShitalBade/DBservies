package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

public class ContactPage extends TestBase{

	@FindBy(xpath="//button[text()='New']")
	WebElement form;
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contact;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement fname;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lname;
	
	@FindBy(xpath="//input[@name='middle_name']")
	WebElement middlename;
	
	@FindBy(xpath="//input[@class='search']")
	WebElement company;
	
	@FindBy(xpath="//input[@name='value' and @placeholder='Email address']")
	WebElement email;
	
	@FindBy(xpath="//button[@class='ui red button']")
	WebElement ok;
	
	@FindBy(xpath="//input[@name='position']")
	WebElement position;
	
	@FindBy(xpath="//input[@name='department']")
	WebElement department;
	
	@FindBy(xpath="//div[@name='status']")
	WebElement status;
	
	@FindBy(xpath="//div[@name='category']")
	WebElement category;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement submit;
	
/*	@FindBy(xpath="//div[@class='ui basic button floating item dropdown']")
	WebElement setting;
	
	@FindBy(xpath="//span[text()='Log Out']")
	WebElement logout;*/
	
	public ContactPage(){
		
		super();
		PageFactory.initElements(driver, this);
	}
	

	public void enter_contact_deatails(String first,String middle,String last,String companyName,String email_id,String positionNew,String departmenet_New){
		
	
		ok.click();
		contact.click();
		form.click();
		fname.sendKeys(first);
		middlename.sendKeys(middle);
		lname.sendKeys(last);
		company.sendKeys(companyName);
		email.sendKeys(email_id);
		position.sendKeys(positionNew);
		department.sendKeys(departmenet_New);
		
		
	}
	
	public void enter_contact_Details_1(String categoryNew,String statusNew) throws InterruptedException {
		
		
		category.sendKeys(categoryNew);
		status.sendKeys(statusNew);
		Thread.sleep(2000);
		submit.click();
		//setting.click();
		//logout.click();
		
	}
}
