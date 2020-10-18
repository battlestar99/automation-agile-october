package testScriptsPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testRun {

	public static void main(String[] args) {
		
		
		// setting up the location and properties of the browser 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		
		// creating an object of the webdriver/chromedriver so we can use the functions 
		WebDriver driver = new ChromeDriver();	
		WebDriver xy = new ChromeDriver();
		WebDriver x1 = new ChromeDriver();
		
		// get functions will navigate us to an url 
		driver.get("https://www.progressivecommercial.com/");
		xy.get("https://www.google.com/");
		x1.get("https://www.facebook.com");
	
		String title = driver.getTitle();
		String y = driver.getCurrentUrl();
		
		driver.quit();
		xy.quit();
		x1.quit();
		
		System.out.println(title);
		System.out.println(y);
		
		
		
		
		
		
		
		

	}

}
