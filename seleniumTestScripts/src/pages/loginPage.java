package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	
	
WebDriver driver;
	
	public loginPage(WebDriver x) {
		
		driver=x;
		
	}
	
	
	public WebElement getSelect() {
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\"login-signin\"]"));
		return button; 
	}
	
	
}
