package testScriptsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserInteraction {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		
		// creating an object of the webdriver/chromedriver so we can use the functions 
		WebDriver driver = new ChromeDriver();	
		
	//	driver.get("https://www.progressivecommercial.com/");
		
		driver.navigate().to("https://www.progressivecommercial.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
		driver.findElement(By.linkText("Commercial Auto")).click();
		
		Thread.sleep(2000);
		
		url = driver.getCurrentUrl();
		title=driver.getTitle();
		
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		System.out.println(url);
		System.out.println(title);
		
		
		
		driver.close();

	}

}
