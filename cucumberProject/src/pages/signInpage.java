package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signInpage {

	
	
	WebDriver driver; 
	public signInpage(WebDriver x) {
		
		driver=x;
		
	}
	
	
public WebElement getemail() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"email\"]")); 
		return x; 
		
		
	}

public WebElement getpassword() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"passwd\"]")); 
	return x; 
	
	
}

	
}
