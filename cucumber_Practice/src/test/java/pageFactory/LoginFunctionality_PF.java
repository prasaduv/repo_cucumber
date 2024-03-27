package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.LoginPage_PF;

//public class LoginFunctionality_PF {
//	
//	WebDriver driver = new ChromeDriver();
//	
//	LoginPage_PF login;
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws Exception {
//		login = new LoginPage_PF(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		
//		
//	}
//
//	@And("user clicks on login button")
//	public void user_clicks_on_login_button() {
//		
//		login.txt_button.click();
//		
//	}
//
//	@Then("user navigated to the homepage")
//	public void user_navigated_to_the_homepage() {
//		
//		driver.getPageSource().contains("Products");
//
//	}

//}
