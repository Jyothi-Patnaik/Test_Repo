package Inlink;

import java.awt.Dimension;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utill {

	public static WebElement scrollToElement(By by,AndroidDriver driver) {
		WebElement element = null;
		int numberOfTimes = 10;
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		int anchor = (int)(size.width / 2);
		//Swipe up to scroll down
		int startPoint = (int)(size.height - 10);
		int endPoint = 10;

		for (int i = 0; i < numberOfTimes; i++) {
		try {
		new TouchAction(driver)
		.longPress(PointOption.point(anchor, startPoint)) //.press(point(anchor, startPoint)) if used press need proper waiting time
		//.waitAction(waitOptions(ofMillis(miliseconds)))
		.moveTo(PointOption.point(anchor, endPoint)).release().perform();
		element = (WebElement) driver.findElement(by);
		i = numberOfTimes;
		} catch (NoSuchElementException ex) {
		System.out.println(String.format("Element not available. Scrolling (%s) timesÖ", i + 1));
		}
		}
		return element;
		}
	
	
//	public static void scrollDown(AndroidDriver driver) {
//	    //if pressX was zero it didn't work for me
//	    int pressX = driver.manage().window().getSize().width / 2;
//	    // 4/5 of the screen as the bottom finger-press point
//	    int bottomY = driver.manage().window().getSize().height * 4/5;
//	    // just non zero point, as it didn't scroll to zero normally
//	    int topY = driver.manage().window().getSize().height / 8;
//	    //scroll with TouchAction by itself
//	    scroll(pressX, bottomY, pressX, topY,driver);
//	}



	public static void scroll(int fromX, int fromY, int toX, int toY, AndroidDriver driver) {
    TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
	}
//	
//	
	
	public static void scrollUp(int howManySwipes,AndroidDriver driver) {
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		// calculate coordinates for vertical swipe
		int startVerticalY = (int) (size.height * 0.8);
		int endVerticalY = (int) (size.height * 0.21);
		int startVerticalX = (int) (size.width / 2.1);
		  try {
		      for (int i = 1; i <= howManySwipes; i++) {
						new TouchAction(driver).press(PointOption.point(startVerticalX, startVerticalY))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(startVerticalX, endVerticalY)).release()
								.perform();
					}
				} catch (Exception e) {
					//print error or something
				}
	}


	public static void scroll(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
//	
	public static void scrollDown(int howManySwipes,AndroidDriver driver) {
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		// calculate coordinates for vertical swipe
		int startVerticalY = (int) (size.height * 0.8);
		int endVerticalY = (int) (size.height * 0.21);
		int startVerticalX = (int) (size.width / 2.1);
		  try {
		      for (int i = 1; i <= howManySwipes; i++) {
						new TouchAction(driver).press(PointOption.point(startVerticalX, startVerticalY))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(startVerticalX, endVerticalY)).release()
								.perform();
					}
				} catch (Exception e) {
					//print error or something
				}
	}


}
