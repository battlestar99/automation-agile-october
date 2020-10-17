package testScriptsPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testRun {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.progressivecommercial.com/");
		
		WebDriver xy = new ChromeDriver();	
		
		
		
		
		String title = driver.getTitle();
		String y = driver.getCurrentUrl();
		
		driver.quit();
		
		System.out.println(title);
		System.out.println(y);
		
		
		
		
		
		
		
		

	}

}
