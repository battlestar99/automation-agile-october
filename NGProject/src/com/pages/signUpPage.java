package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPage {
	
	WebDriver driver;
	
	
	public signUpPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	
	public WebElement getFirstName() {
		
		WebElement firstName =  driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]"));	
		return firstName; 
		
	}
	
public WebElement getlastName() {
		
	WebElement lastName =  driver.findElement(By.id("usernamereg-lastName"));
		return lastName; 
		
	}



public WebElement getemail() {
	
	WebElement email =  driver.findElement(By.id("usernamereg-yid"));
	return email; 
	
}



public WebElement getpassword() {
	
	 WebElement password =  driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
	return password; 
	
}


public WebElement getbirthMonth() {
	
	WebElement birthMonth = driver.findElement(By.id("usernamereg-month"));
	return birthMonth; 
	
}


public WebElement getPrivacyOption() {
	
	WebElement x = driver.findElement(By.linkText("Privacy Policy"));
	return x; 
	
}

















}
