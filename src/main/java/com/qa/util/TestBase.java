package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		try {
			prop=new Properties();
FileInputStream ip=new FileInputStream("D:\\udemy_class\\Cucumber_Project\\Cucumber_POM\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(ip);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void initalization() {
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\udemy_setup\\chromedriver.exe");
			
		 //driver = new ChromeDriver(capabilities);
			
			ChromeOptions options  = new ChromeOptions();
			options.addArguments("disable-popup-blocing");
		   /* options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
		    DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability(ChromeOptions.CAPABILITY, options);*/
		    driver=new ChromeDriver(options);
		   
			
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);	
		driver.get(prop.getProperty("url"));
		}
	
}
