package background;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Homepage_Background {
	
	WebDriver driver = null;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login '] ")).click();

	}

	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
		driver.getPageSource().contains("Time at Work");
	}

	@When("user clicks on my info link")
	public void user_clicks_on_my_info_link() {
		
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		
	}

	@Then("navigated to personal details")
	public void navigated_to_personal_details() {
		
		driver.getTitle();
		
		driver.close();
		driver.quit();
	}

	@When("user clicks on Admin link")
	public void user_clicks_on_admin_link() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	}

	@Then("navigated to user details")
	public void navigated_to_user_details() {
		
		driver.getTitle();
		
		driver.close();
		driver.quit();
	}

}
