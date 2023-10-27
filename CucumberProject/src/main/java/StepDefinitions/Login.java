package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver=null;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    driver=new ChromeDriver();
	    driver.get("https://testapp.inlink.pro/news");
	    }

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
	    driver.findElement(By.name("email")).sendKeys("meera@yopmail.com");
	    driver.findElement(By.name("password")).sendKeys("Inlink@123");
	}

	@And("clicks login button")
	public void clicks_login_button() {
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("login page is opened")
	public void login_page_is_opened() throws InterruptedException {
	   System.out.println("Login done");
	   Thread.sleep(2000);
	   WebElement ele=driver.findElement(By.xpath("//span[text()='News Feed ']"));
	   System.out.println(ele.getText());
	}



}
