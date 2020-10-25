package testScriptsPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pages.loginPage;
import pages.signUpPage;

public class yahooSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 signUpPage sp=new signUpPage(driver);
		 loginPage lp = new loginPage(driver);
		 
		driver.manage().window().maximize();
		 
		 driver.get("https://login.yahoo.com/account/create");
		 
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 sp.getFirstName().sendKeys("John");
		 
		 Thread.sleep(2000);
		 
		 sp.getFirstName().clear();
		 
		 sp.getlastName().sendKeys("rubin");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 // 
		/*
		 * WebElement firstName =
		 * driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]"));
		 * firstName.sendKeys("michael");
		 * 
		 * 
		 * WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
		 * lastName.sendKeys("oliver");
		 * 
		 * WebElement email = driver.findElement(By.id("usernamereg-yid"));
		 * email.sendKeys("John3423@gmail.com");
		 * 
		 * WebElement password =
		 * driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
		 * password.sendKeys("dfads+=12");
		 * 
		 * 
		 * WebElement birthMonth = driver.findElement(By.id("usernamereg-month"));
		 * Select bm = new Select(birthMonth); bm.selectByIndex(2);
		 * 
		 * 
		 */
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
