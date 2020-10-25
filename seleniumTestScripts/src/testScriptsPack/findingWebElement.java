package testScriptsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingWebElement {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
			
	     WebDriver driver = new ChromeDriver();	
	     
	     driver.get("https://login.yahoo.com/account/create");
	     
	     
	  //   driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/fieldset/div/div[1]/input")).clear();
	  //   driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/fieldset/div/div[1]/input")).sendKeys("Michael");
	    
	     WebElement firstNameTextbox= driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/fieldset/div/div[1]/input"));
	     
	     firstNameTextbox.clear();
	     firstNameTextbox.sendKeys("Micahel");
	     
	     
	     driver.findElement(By.name("lastName")).sendKeys("jordan");
	     
		
		

	}

}
