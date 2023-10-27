
package Inlink;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class SignUp extends OpenApp {
	//public static AndroidDriver driver;
	
	@Test
	public void signUp() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("com.peoplelink.inlink:id/signupBtn")).click();
		driver.findElement(By.id("com.peoplelink.inlink:id/company_signup")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.peoplelink.inlink:id/companyNameET")).sendKeys("Texas Pvt Ltd");
		driver.findElement(By.id("com.peoplelink.inlink:id/searchIndustriesEt")).click();
		driver.findElement(By.id("com.peoplelink.inlink:id/searchView")).click();
		driver.findElement(By.id("com.peoplelink.inlink:id/searchView")).sendKeys("Software");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")).click();
		driver.findElement(By.id("com.peoplelink.inlink:id/contactNameET")).sendKeys("Jyothi");
		driver.findElement(By.id("com.peoplelink.inlink:id/emailIdET")).sendKeys("tata58@yopmail.com");
		//driver.findElement(By.id("com.peoplelink.inlink:id/emailIdET")).click();
		//driver.findElement(By.id("com.peoplelink.inlink:id/phoneNumberET")).click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement signupbtn = driver.findElement(By.xpath("com.peoplelink.inlink:id/register_button"));
//		js.executeScript("arguments[0].scrollIntoView(true);", signupbtn);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		 WebElement phno=driver.findElement(By.id("com.peoplelink.inlink:id/phoneNumberET"));
		 phno.sendKeys("9998706543");
		 

		/*WebElement country=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.Spinner"));
		 //country.click();
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.Spinner")).click();
			
		 Select s = new Select(driver.findElement(By.id("com.peoplelink.inlink:id/presentCountrySinner")));
		 s.selectByVisibleText("New Zealand");*/
		
		 
		 //driver.findElement(By.id("com.peoplelink.inlink:id/phoneNumberET")).click();
		 //phno.sendKeys(Keys.ENTER);
		 driver.findElement(By.id("com.peoplelink.inlink:id/passwordET")).sendKeys("Inlink@123");
		 Thread.sleep(1000);
		 Utill.scrollUp(1, driver);
		 driver.findElement(By.id("com.peoplelink.inlink:id/confirmationPasswordET")).sendKeys("Inlink@123");
		 //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
		 
		 driver.findElement(By.id("com.peoplelink.inlink:id/terms_conditions")).click();
		 
		//WebElement signupbtn = driver.findElement(By.xpath("com.peoplelink.inlink:id/register_button"));
		//signupbtn.click();
	}

}
