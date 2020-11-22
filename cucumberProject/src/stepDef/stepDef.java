package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.homepage;

public class stepDef {
	
	WebDriver driver; 
	homepage hm; 
	
	

	@Given("^user is in the homepage$")
	public void user_is_in_the_homepage()  {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		hm=new homepage(driver);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	

	@When("^user clicks on the specials$")
	public void user_clicks_on_the_specials()  {
		
		driver.findElement(By.linkText("Specials")).click();
	}

	@Then("^user should navigate to the special page$")
	public void user_should_navigate_to_the_special_page()  {
		
		String title = driver.getTitle();
		
	}

	@When("^user clicks on the new products$")
	public void user_clicks_on_the_new_products()  {
		
		driver.navigate().back();
		driver.findElement(By.linkText("New products")).click();
	}
	
	
	@Then("^user should navigate to the new products page$")
	public void user_should_navigate_to_the_new_products_page()  {
		
		driver.getTitle();
	}
	
	//------------------------------------------------------------
	

	@When("^user clicks on the sign in link$")
	public void user_clicks_on_the_sign_in_link() throws Throwable {
	   
		hm.getSignInlink().click();
		
		
	}

	@When("^user enters user name$")
	public void user_enters_user_name() throws Throwable {
	    
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
	  
	}

	@When("^user clicks on sign in button$")
	public void user_clicks_on_sign_in_button() throws Throwable {
	   
	}

	@Then("^user should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	    
	}
	
	

	@When("^user enters invalid user name$")
	public void user_enters_invalid_user_name() throws Throwable {
	
	}

	@When("^user enters invlid password$")
	public void user_enters_invlid_password() throws Throwable {
	 
	}

	@Then("^user should see a message of invalid credentials$")
	public void user_should_see_a_message_of_invalid_credentials() throws Throwable {
	  
	}

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
	  
	}



	
	

}
