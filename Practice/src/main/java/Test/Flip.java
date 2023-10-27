package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flip {
	
	@Test
	public void flipOpen() {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Grocery')]")).click();
		driver.findElement(By.name("pincode")).sendKeys("500060");
		driver.findElement(By.xpath("//div[@class='_2eyON6']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1IsWyb _3dESVI']")).click();
		
	}

}
