package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automationPracRegistrarPage {

	
	
WebDriver driver; 
	
	public automationPracRegistrarPage(WebDriver x) {
		
		driver=x; 
		
	}
	
	
public WebElement getTitleMale() {
		
		WebElement x = driver.findElement(By.id("id_gender1"));
		return x; 
	}

public WebElement getTitleFemale() {
	
	WebElement x = driver.findElement(By.id("id_gender2"));
	return x; 
}
public WebElement getfirstName() {
		
		WebElement x = driver.findElement(By.id("customer_firstname"));
		return x; 
	}
		
public WebElement getlastName() {
	
	WebElement x = driver.findElement(By.id("customer_lastname"));
	return x; 
}

public WebElement getEmail() {
	
	WebElement x = driver.findElement(By.id("email"));
	return x; 
}

public WebElement getPassword() {
	
	WebElement x = driver.findElement(By.id("passwd"));
	return x; 
}

public WebElement getDay() {
	
	WebElement x = driver.findElement(By.id("days"));
	return x; 
}

public WebElement getMonth() {
	
	WebElement x = driver.findElement(By.id("months"));
	return x; 
}
public WebElement getYear() {
	
	WebElement x = driver.findElement(By.id("years"));
	return x; 
}	
	
	
}
