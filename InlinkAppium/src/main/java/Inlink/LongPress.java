package Inlink;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class LongPress {
	
	@Test
	public static WebElement longPressFunction(int i,AndroidDriver driver) {
//		AndroidDriver<MobileElement> driver=null;
//		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		//group//MobileElement longpress =  (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]"));
		//broadCast--MobileElement longpress =  (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]"));
		MobileElement longpress =  (MobileElement) driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]"));
		
		
				LongPressOptions longPressOptions = new LongPressOptions();
	    longPressOptions.withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(longpress));
	    TouchAction action = new TouchAction(driver);
	    action.longPress(longPressOptions).release().perform();
		return longpress;

}
}
