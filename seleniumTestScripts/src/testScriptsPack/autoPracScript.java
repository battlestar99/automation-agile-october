package testScriptsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoPracScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		 driver.get("http://automationpractice.com/");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.linkText("Sign in")).click();
		 
		 String title = driver.getTitle();
		 
		 System.out.println(title);
		 
		 driver.findElement(By.id("email_create")).sendKeys("test12123@test.com");
		 
		 Thread.sleep(2000);
	
		 driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		
		 String url =  driver.getCurrentUrl();
		  
		  System.out.println(url);
		  
		  Thread.sleep(2000);
		  
		  driver.close();

	}

}
