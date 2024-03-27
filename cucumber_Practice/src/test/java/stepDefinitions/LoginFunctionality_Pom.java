package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage_pom;

public class LoginFunctionality_Pom {

//	WebDriver driver = new ChromeDriver();
//	LoginPage_pom login;
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.manage().window().maximize();
//		System.out.println(driver.getPageSource().contains("LOGIN"));
//	}
//	
////	@When("user enter username and password")
////	public void user_enter_username_and_password() {
////	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
////	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
////	}
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_uername_and_password(String username, String password) throws Exception {
//		login = new LoginPage_pom(driver);
//		login.enterUserName(username);
//		login.enterPassword(password);
//		
//		
////		driver.findElement(By.id("user-name")).sendKeys(username);
////		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(2000);
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//
//		login.clicksOnLogin();
//		
//		
////		driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("navigated to the homepage")
//	public void navigated_to_the_homepage() throws Exception {
//		System.out.println(driver.getPageSource().contains("Products"));
//		Thread.sleep(3000);
//		
////		driver.switchTo().alert().accept();
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
//		driver.close();
//		driver.quit();
//		
//	}


}
