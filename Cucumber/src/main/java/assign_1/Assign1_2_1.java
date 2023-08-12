package assign_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign1_2_1 {
	
	@Test
	public void option1() throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(3000);
		WebElement option1= driver.findElement(By.id("vfb-7-1"));
		option1.click();
		Thread.sleep(3000);
		WebElement checkbox2= driver.findElement(By.id("vfb-6-1"));
		checkbox2.click();
		WebElement checkbox3= driver.findElement(By.id("vfb-6-2"));
		checkbox3.click();
		driver.quit();
	}
	}
		


