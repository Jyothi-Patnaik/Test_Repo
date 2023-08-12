package assign_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class one_1 {

	@Test
	public void amazon() throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.quit();
	}
		
}
