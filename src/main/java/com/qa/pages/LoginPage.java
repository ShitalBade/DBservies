package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	HomePage homepage;

	
	@FindBy(xpath="//input[@name=\"email\"]")
	//static
	WebElement user;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	 //static 
	 WebElement pass;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbtn;
	
	/*@FindBy(xpath="//div[@class='ui basic button floating item dropdown']")
	WebElement setting;
	
	@FindBy(xpath="//span[text()='Log Out']")
	WebElement logout;*/
	
	
	
	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		return driver.getTitle();
		
	}
	
	public HomePage loginPage(String uname,String pwd) throws InterruptedException {
		user.sendKeys(uname);
		pass.sendKeys(pwd);
		Thread.sleep(3000);
		loginbtn.click();
		//logout.click();
		
	return new HomePage();
		
	}
}
