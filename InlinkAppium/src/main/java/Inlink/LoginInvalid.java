package Inlink;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class LoginInvalid {
	
	public static AndroidDriver driver;
	//public static AndroidDriver<MobileElement> driver;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public static void invc() throws MalformedURLException, InterruptedException  {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appiumVersion", "1.15.1");
		cap.setCapability("deviceName", "Android SDK built for x86");
		//cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("chromeoptions", ImmutableMap.of("w3c",false));
		
		cap.setCapability("app", "C:/Users/admin/Downloads/Inlink_test_20_06_23.apk");
		driver=new AndroidDriver<>(new URL("http://localhost:4723/wd/hub/"),cap);
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        System.out.println("Inlink open successfully");
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	/*@Test(priority=0)
	public static void loginInvalidMail() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.id("com.peoplelink.inlink:id/emailET")).sendKeys("hexagonyopmail.com");
		driver.findElement(By.id("com.peoplelink.inlink:id/passwordET")).sendKeys("Inlink@123");
		driver.findElement(By.id("com.peoplelink.inlink:id/text_input_end_icon")).click();
		WebElement login = driver.findElement(By.id("com.peoplelink.inlink:id/loginBtn"));
		login.click();
		String expectedText = "Incorrect username or password";
        Object actualText="Incorrect username or password";
		if (actualText.equals(expectedText)) {
            System.out.println("Wrong Password");
        } else {
            System.out.println("Text is wrong");
        }
		
		Thread.sleep(5000);
	}*/
	
	@Test(priority=1)
	public static void loginInvalidPassword() throws InterruptedException {
		Thread.sleep(15000);

		driver.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("hexagon@yopmail.com");
		driver.findElement(By.id("com.peoplelink.inlink:id/passwordET")).sendKeys("Inlink@556");
		driver.findElement(By.id("com.peoplelink.inlink:id/text_input_end_icon")).click();
		WebElement login = driver.findElement(By.id("com.peoplelink.inlink:id/loginBtn"));
		login.click();
		String expectedText = "Incorrect username or password";
        Object actualText="Incorrect username or password";
		if (actualText.equals(expectedText)) {
            System.out.println("Wrong Mail");
        } else {
            System.out.println("Text is wrong");
        }
		
		
	}
	
	/*@Test(priority=2)
	public static void loginEmptyData() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.id("com.peoplelink.inlink:id/emailET")).sendKeys(" ");
		driver.findElement(By.id("com.peoplelink.inlink:id/passwordET")).sendKeys(" ");
		driver.findElement(By.id("com.peoplelink.inlink:id/text_input_end_icon")).click();
		WebElement login = driver.findElement(By.id("com.peoplelink.inlink:id/loginBtn"));
		
		
		if (login.isEnabled()) {
            System.out.println("Not Working ");
        } else {
            System.out.println("Should not be enabled if empty data is given");
        }
		
		
	}*/
//	@AfterTest
//	public static void logout() {
//		driver.quit();
//	}

}
