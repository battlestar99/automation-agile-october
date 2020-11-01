package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automationPracSignInPage {
	
	
WebDriver driver; 
	
	public automationPracSignInPage(WebDriver x) {
		
		driver=x; 
		
	}

public WebElement getSignUpTextBox() {
		
		WebElement x = driver.findElement(By.id("email_create"));
		return x; 
	}
	

public WebElement getCreateAnAccountButton() {
	
	WebElement x = driver.findElement(By.id("SubmitCreate"));
	return x; 
}

	
	
}
