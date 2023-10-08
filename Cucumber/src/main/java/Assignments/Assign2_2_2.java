package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign2_2_2 {
	
	@Test
	public void countryDropdown() throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(3000);
		driver.getWindowHandle();
		WebElement ele =driver.findElement(By.name("emailid"));
		ele.click();
		ele.sendKeys("jyothi@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
	}

}
