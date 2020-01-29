package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath="//a[@class='item']/span[@class='item-text' and text()='Contacts']")
	WebElement contactpagelink;
	
	@FindBy(xpath="//span[@class=\"user-display\"]")
	WebElement username;
	
	@FindBy(xpath="//button[@class='ui red button']")
	WebElement ok;
	
/*	@FindBy(xpath="//div[@class='ui basic button floating item dropdown']")
	WebElement setting;
	
	@FindBy(xpath="//span[text()='Log Out']")
	WebElement logout;*/
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getHomepageTitle() {
		ok.click();
		return driver.getTitle();		
	}
	
	public String getUsername() {
		return username.getText();
		
	}
	public ContactPage clickOnContacts() {
	     contactpagelink.click();
	   //  setting.click();
	     //logout.click();
	     return new ContactPage();
	}
	
	
	
}
