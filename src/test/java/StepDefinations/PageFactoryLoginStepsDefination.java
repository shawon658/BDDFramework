package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;
import pageFactory.LoginPageFactory;

public class PageFactoryLoginStepsDefination {

	 WebDriver driver;
	LoginPageFactory login;
	HomePageFactory home;
	
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
	public void user_enters_valid_username_and_password(String username, String password) {
	    login = new LoginPageFactory(driver);
	    login.enterUsername(username);
	    login.enterPassword(password);
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
	    login.clickOnLoginButton();
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		home = new HomePageFactory(driver);
		home.isCartDisplayed();
		
		/*
	    // Write code here that turns the phrase above into concrete actions
	   String actualTitle = driver.getTitle();
	   String expectedTitle = "Swag Labs";
	   Assert.assertEquals(actualTitle, expectedTitle);*/
	}

	@And("Close the browser")
	public void close_the_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	    driver.close();
	    
	}


}
