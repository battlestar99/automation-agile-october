package com.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.automationPracHomePage;
import com.pages.automationPracSignInPage;
import com.pages.signUpPage;

import junit.framework.Assert;

public class signUpTest {
	
	WebDriver driver; 
	automationPracHomePage homePage; 
	automationPracSignInPage signInPage; 
	
	@BeforeTest
	public void setupTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		homePage = new automationPracHomePage(driver);
		signInPage = new automationPracSignInPage(driver);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority=1)
	public void validateHomeSignIn() {
		
		boolean x = homePage.getSignInLink().isDisplayed(); 
		homePage.getSignInLink().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Assert.assertTrue(x);
	}
	
	
	
	@Test(priority=2)
	public void validateCreateAccountOption() {
		
		String title = driver.getTitle(); 
		
		signInPage.getSignUpTextBox().sendKeys("jordan123@test.com");
		boolean x = signInPage.getCreateAnAccountButton().isEnabled();
		Assert.assertEquals( "Login - My Store", title );
		Assert.assertTrue(x);
		
		
		
	}
	
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
		
		
	}
	

}
