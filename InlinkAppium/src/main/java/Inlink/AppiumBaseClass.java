package Inlink;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppiumBaseClass {
	//public static AndroidDriver driver;
	public static AndroidDriver<MobileElement> driver;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public static void inlink() throws MalformedURLException, InterruptedException  {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appiumVersion", "v1.15.1");
		//cap.setCapability("deviceName", "vivo");
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		//cap.setCapability("chromeoptions", ImmutableMap.of("w3c",false));
		cap.setCapability("waitForIdleTimeout", 0);
		cap.setCapability("appPackage", "com.peoplelink.inlink" );
		cap.setCapability("app", "C:\\Users\\admin\\Downloads\\Inlink_21_10_23_test.apk");
		cap.setCapability(MobileCapabilityType.FULL_RESET, false);
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		driver=new AndroidDriver<>(new URL("http://localhost:4723/wd/hub/"),cap);
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        System.out.println("Inlink open successfully");
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public static void login() throws InterruptedException {
		Thread.sleep(10000);

		driver.findElement(By.id("com.peoplelink.inlink:id/emailET")).sendKeys("meera@yopmail.com");
		driver.findElement(By.id("com.peoplelink.inlink:id/passwordET")).sendKeys("Inlink@123");
		driver.findElement(By.id("com.peoplelink.inlink:id/text_input_end_icon")).click();
		driver.findElement(By.id("com.peoplelink.inlink:id/loginBtn")).click();
		//driver.findElement(By.id("com.peoplelink.inlink:id/create_post")).click();
		
	}
	
/*@AfterTest
public static void logout() {
driver.close();*/
	}
	

//}
