package assign_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assign1_2_2 {
	@Test
	public void countryDropdown() throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebElement country = driver.findElement(By.name("country"));
		
		//country.sendKeys("KUWAIT");
		//Thread.sleep(3000);
		//driver.quit();
		WebElement country = driver.findElement(By.name("country"));
		js.executeScript("arguments[0].scrollIntoView();", country);
		// Create an instance of the Select class
		Select dropdown = new Select(country);

		// Select an option by visible text
		dropdown.selectByValue("KUWAIT");
	}
		
}
