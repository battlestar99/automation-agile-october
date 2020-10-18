package testScriptsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webAppTest {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		 driver.get("https://login.yahoo.com/account/create");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("usernamereg-firstName")).sendKeys("Michael");
		 Thread.sleep(1000);
		 driver.findElement(By.name("lastName")).sendKeys("Jordan");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]")).sendKeys("Mjordan");
		 
		 
		 driver.close();
		
	}

}
