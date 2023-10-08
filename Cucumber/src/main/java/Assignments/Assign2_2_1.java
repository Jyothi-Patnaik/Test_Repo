package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign2_2_1 {
	
	@Test
	public void navigate() throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.id("a077aa5e"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		//driver.switchTo().frame("a077aa5e");
		ele.click();
		

		
	}
	
	
}
