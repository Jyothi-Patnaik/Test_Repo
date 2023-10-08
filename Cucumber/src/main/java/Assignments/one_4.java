package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class one_4 {
	
	@Test
	/*public void firefoxbrowser() {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	public void edgeBrowser() {
		WebDriver driver=null;
		WebDriverManager.edgedriver().setup();	
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}*/
	public void operabrowser() {
		WebDriver driver=null;
		//WebDriverManager.operadriver().setup();	
		driver=new OperaDriver();
		driver.manage().window().maximize();
	}

}
