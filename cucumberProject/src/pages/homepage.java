package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	
	WebDriver driver; 
	public homepage(WebDriver x) {
		
		driver=x;
		
	}
	
	public WebElement getSignInlink() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")); 
		return x; 
		
		
	}
	
	
	

}
