package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign2_2 {
	
	@Test
	public void navigate() throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234679");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		alert.accept();
		driver.quit();
	}

}
