package assign_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class one_2 {
	
	@Test
	public void faceBook() throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
	}
		

}
