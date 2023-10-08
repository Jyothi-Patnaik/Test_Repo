package Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowOpen {
	
	@Test
	public void window() throws InterruptedException {
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testapp.inlink.pro/");
		Thread.sleep(2000);
		WebElement signup = driver.findElement(By.xpath("//button[text()='sign up']"));
		signup.click();
		Thread.sleep(3000);
		
		//openeing New Tab
		((JavascriptExecutor)driver).executeScript("window.open()");
		
		ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		driver.get("https://www.yopmail.com");
		
}

}
