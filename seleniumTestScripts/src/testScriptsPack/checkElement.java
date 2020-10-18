package testScriptsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		 driver.get("http://automationpractice.com/");
		 
		
       WebElement contactUs =  driver.findElement(By.linkText("Contact us"));
       WebElement addToCart= driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span"));
       
       
       
       
       
       
       String x = addToCart.getText();
       
       boolean contactUsDisplay = contactUs.isDisplayed();
       
       boolean contactUsEnable =  contactUs.isEnabled();
      
       
       System.out.println(x);
       System.out.println(contactUsDisplay);
       System.out.println(contactUsEnable);
       
       
       
       
       
       
       
	}

}
