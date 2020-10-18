package testScriptsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drodDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		 driver.get("https://login.yahoo.com/account/create");
		 
		 Thread.sleep(2000);
		 
		 WebElement countryCode = driver.findElement(By.name("shortCountryCode"));
		 
		 Select countryDrop = new Select(countryCode);
		 
		Thread.sleep(2000);
		 
		 countryDrop.selectByValue("AU");
		 
		 Thread.sleep(2000);
		 
		 
		 WebElement birthMonth = driver.findElement(By.id("usernamereg-month"));
		 Select BirthMonthDD = new Select(birthMonth);
		 
		// BirthMonthDD.selectByVisibleText("March");
		 
		 BirthMonthDD.selectByIndex(2);
		 
		 Thread.sleep(2000);
		 driver.close();
		 

	}

}
