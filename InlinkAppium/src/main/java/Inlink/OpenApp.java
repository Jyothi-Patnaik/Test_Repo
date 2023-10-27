package Inlink;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpenApp {
	
	public static AndroidDriver driver;
	//public static AndroidDriver<MobileElement> driver;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public static void inlink() throws MalformedURLException, InterruptedException  {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appiumVersion", "v1.15.1");
		//cap.setCapability("deviceName", "vivo");
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("chromeoptions", ImmutableMap.of("w3c",false));
		
		cap.setCapability("app", "C:/Users/admin/Downloads/Inlink_test_20_06_23.apk");
		cap.setCapability(MobileCapabilityType.FULL_RESET, false);
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		driver=new AndroidDriver<>(new URL("http://localhost:4723/wd/hub/"),cap);
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        System.out.println("Inlink open successfully");
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
//	@AfterTest
//	public static void logout() {
//		driver.quit();
//	}

}


/*driver.findElement(By.id("com.peoplelink.inlink:id/ic_menu")).click();
driver.findElement(By.id("com.peoplelink.inlink:id/bookmarkTitle")).click();

driver.findElement(By.id("com.peoplelink.inlink:id/ic_menu")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView")).click();
driver.findElement(By.id("com.peoplelink.inlink:id/feed_description")).sendKeys("Appium Feed");
driver.findElement(By.id("com.peoplelink.inlink:id/post_feed_btn")).click();*/

