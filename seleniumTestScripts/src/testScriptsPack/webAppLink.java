package testScriptsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webAppLink {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		 driver.get("http://automationpractice.com/index.php");
		 
		 Thread.sleep(2000);
		 
		WebElement specialLink = driver.findElement(By.linkText("Specials"));
		 
		String x = specialLink.getText();
		
		
		
	     System.out.println(x);
		
		specialLink.click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		WebElement productlink = driver.findElement(By.linkText("New products"));
		
		productlink.click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.close();

	}

}
