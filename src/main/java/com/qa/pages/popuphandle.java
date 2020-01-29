package com.qa.pages;

import java.util.List;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class popuphandle {

  WebDriver driver;
	
	
public  void test() throws InterruptedException
	{
		

	System.setProperty("webdriver.chrome.driver", "D:\\udemy_setup\\chromedriver.exe");
	
	//driver.manage().window().maximize();
	driver=new ChromeDriver();
	driver.get("https://ui.freecrm.com/");
		//Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shitalkendre25@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Wint@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	Thread.sleep(5000);
	//driver.refresh();
	driver.findElement(By.xpath("//button[@class='ui red button']")).click();
	
	
	
	
	
	driver.findElement(By.xpath("//span[text()='Companies']")).click();
	
	
WebElement ele=driver.findElement(By.xpath("//button[text()='New']"));
	ele.click();
	
	Thread.sleep(3500);
	
	driver.findElement(By.xpath("//div[@name='source']")).click();
	Thread.sleep(2000);
	
	List<WebElement>option=driver.findElements(By.xpath("//div[@name='source']//div"));
	for(WebElement options : option) {
		
		System.out.println(options.getText());
		
			
			  if (options.getText().equals("Web Service")) {
				  
				  options.click();
			  
			  }
			 	}
		
		
	}
	
	
	
	
	
	
	
		
	
	
	public static void main(String[] args) throws InterruptedException {
		
		popuphandle pop=new popuphandle();
		
		pop.test();
		
		
		
		
	}

}
