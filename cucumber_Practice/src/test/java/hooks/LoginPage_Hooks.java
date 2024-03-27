package hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginPage_Hooks {

//	WebDriver driver = null;
//	
//	@Before
//	public void browserSetUp() {
//		driver = new ChromeDriver();
//		System.err.println("------I'm inside the browser setup------");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		
//	}
//	
//	@After
//	public void tearDown() {
//		System.err.println("------I'm inside the teardown------");
//		driver.close();
//		driver.quit();
//	}
//
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		driver.get("https://www.saucedemo.com/v1/");
//		System.out.println(driver.getPageSource().contains("LOGIN"));
//	}
//
//
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_uername_and_password(String username, String password) throws Exception {
//		driver.findElement(By.id("user-name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(2000);
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("navigated to the homepage")
//	public void navigated_to_the_homepage() throws Exception {
//		System.out.println(driver.getPageSource().contains("Products"));
//		Thread.sleep(3000);
//
//
//		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("shopping_cart_container")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.className("bm-burger-button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("logout_sidebar_link")).click();
//		Thread.sleep(2000);
//
//		
//	}
}
