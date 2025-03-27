/*package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefination {

	static WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).click();
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   String actualTitle = driver.getTitle();
	   String expectedTitle = "Swag Labs";
	   Assert.assertEquals(actualTitle, expectedTitle);
	}

	@And("Close the browser")
	public void close_the_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	    driver.close();
	    
	}


}*/
