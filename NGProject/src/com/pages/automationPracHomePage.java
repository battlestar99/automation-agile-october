package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automationPracHomePage {
	
	WebDriver driver; 
	
	public automationPracHomePage(WebDriver x) {
		
		driver=x; 
		
	}
	
	
	public WebElement getSignInLink() {
		
		WebElement x = driver.findElement(By.linkText("Sign in"));
		return x; 
	}
	
	
	
	

}
