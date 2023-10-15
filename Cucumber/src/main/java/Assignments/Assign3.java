package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign3 {
	
	WebDriver driver;

	@BeforeMethod
		public void openBrowser() throws InterruptedException
		{

		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/login.html");
		}
	@Test
	public void login() {
		
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("jyothi@gmail.com");

		WebElement password=driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("Jyothi@123");
		WebElement login=driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		login.click();

	}
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
