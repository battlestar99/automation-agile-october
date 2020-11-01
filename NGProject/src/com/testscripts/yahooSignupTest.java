package com.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.signUpPage;



public class yahooSignupTest {
	
	
	 WebDriver driver; 
	signUpPage sp;
	 
 
	
	
	@BeforeTest
	public void setupTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		sp=new signUpPage(driver);

		
		 
		driver.manage().window().maximize();
		 
		 driver.get("https://login.yahoo.com/account/create");
		 
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
		
	}
	
	@Test(priority=1)
	public void signupValidation() throws InterruptedException {
		
	//	WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
		boolean displayFirstName = sp.getFirstName().isDisplayed();
		sp.getFirstName().sendKeys("Michael");
		
		
		//WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
		boolean displaylastName = sp.getlastName().isDisplayed();
		sp.getlastName().sendKeys("Scott");
		
		Reporter.log("signup validation test");
		Thread.sleep(2000);
	
		
	}
	
	
	@Test(priority=2)
	public void privacyOptionValidation() throws InterruptedException {
		
	  String privactyOption = sp.getPrivacyOption().getText();
	  boolean privacyPresent = sp.getPrivacyOption().isDisplayed();
	  sp.getPrivacyOption().click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	 String privacyPageTitle =  driver.getTitle();
	 System.out.println(privacyPageTitle);
	 String privacyPageUrl =  driver.getCurrentUrl();
		
		Assert.assertEquals( privacyPageTitle, "Yahoo");
		Assert.assertEquals("https://login.yahoo.com/account/create", privacyPageUrl);
		Assert.assertTrue(privacyPresent);
		
		
		Thread.sleep(2000);
	
		
	}

}
