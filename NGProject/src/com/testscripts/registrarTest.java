package com.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.automationPracHomePage;
import com.pages.automationPracRegistrarPage;
import com.pages.automationPracSignInPage;

public class registrarTest {
	
	
	WebDriver driver; 
	automationPracHomePage homePage; 
	automationPracSignInPage signInPage; 
	automationPracRegistrarPage registrarPage; 
	
	@BeforeTest
	public void setupTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		homePage = new automationPracHomePage(driver);
		signInPage = new automationPracSignInPage(driver);
		registrarPage = new automationPracRegistrarPage(driver);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@BeforeMethod
	public void navigateRegistrarPage() throws InterruptedException {
		
		homePage.getSignInLink().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		signInPage.getSignUpTextBox().sendKeys("jordan123@test.com");
		signInPage.getCreateAnAccountButton().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	
	
	@Test
	public void registrarPageTest() {
		
		registrarPage.getTitleMale().click();
		registrarPage.getfirstName().sendKeys("Bob");
		registrarPage.getlastName().sendKeys("Vance");
		registrarPage.getEmail().clear();
		registrarPage.getEmail().sendKeys("bobvance@test.com");
		
		Select daydd=new Select(registrarPage.getDay());
		Select monthdd=new Select(registrarPage.getMonth());
		Select yeardd = new Select(registrarPage.getYear());
		
		
		daydd.selectByIndex(12);
		monthdd.selectByIndex(4);
		yeardd.selectByIndex(13);
		
		
		
	}
	
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
		
	}
	

}
