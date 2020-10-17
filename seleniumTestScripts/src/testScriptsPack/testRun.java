package testScriptsPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testRun {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.progressivecommercial.com/");
		
		
		String x = driver.getTitle();
		String y = driver.getCurrentUrl();
		
		driver.quit();
		
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		
		
		
		

	}

}
