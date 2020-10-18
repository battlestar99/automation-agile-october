package testScriptsPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testRunOne {

	public static void main(String[] args) {
		
		String url; 
		String title; 
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		// navigating to an url 
		
		url = driver.getCurrentUrl();
		title = driver.getTitle();
		
		String xy = driver.getCurrentUrl();
		
		
		
	
		
		System.out.println(url);
		
		System.out.println(title);
		
		driver.quit();
		

	}

}
