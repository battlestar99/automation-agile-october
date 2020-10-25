package testScriptsPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.signUpPage;

public class yahooSignupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 signUpPage sp=new signUpPage(driver);
		 
		driver.manage().window().maximize();
		 
		 driver.get("https://login.yahoo.com/account/create");
		 
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 sp.getFirstName().isDisplayed();
		 
		 

	}

}
