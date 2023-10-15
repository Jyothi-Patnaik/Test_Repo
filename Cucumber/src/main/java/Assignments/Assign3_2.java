package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign3_2 {
	
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
	public void login() throws IOException, InterruptedException {
		 Properties properties = new Properties();
	     FileInputStream fis = new FileInputStream("src/main/resources/data.properties");
	     properties.load(fis);

	     // Read data from the properties file
	     String email = properties.getProperty("email");
	     String password = properties.getProperty("password");
		
		WebElement email1=driver.findElement(By.xpath("//input[@id='email']"));
		email1.sendKeys(email);
		WebElement password1=driver.findElement(By.xpath("//input[@id='passwd']"));
		password1.sendKeys(password);
		
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		login.click();

	}
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
