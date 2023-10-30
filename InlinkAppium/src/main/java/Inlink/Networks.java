package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidKeyCode;

public class Networks extends AppiumBaseClass {
	
	@Test
	public void networks() throws InterruptedException {
	
	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 
	 WebElement networksModule = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Networks\"]/android.widget.FrameLayout/android.widget.ImageView"));
	 networksModule.click();
	 
//	 WebElement companySearch = driver.findElement(By.id("com.peoplelink.inlink:id/menu_action_search"));
//	 companySearch.click();
//	 
//	 WebElement enterCompanyName = driver.findElement(By.id("com.peoplelink.inlink:id/search_src_text"));
//	 enterCompanyName.sendKeys("Funnl");
//	 
//	 WebElement followBtn = driver.findElement(By.id("com.peoplelink.inlink:id/followBtn"));
//	 //followBtn.click();
//	 
//	 WebElement connectBtn = driver.findElement(By.id("com.peoplelink.inlink:id/connect"));
//	 connectBtn.click();
//	 
//	 WebElement relationdropdown = driver.findElement(By.id("com.peoplelink.inlink:id/relationSpinner"));
//	 relationdropdown.click();
//	 
//	 WebElement relationSelect = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]"));
//	 relationSelect.click();
//	 
//	 WebElement relationManagerSearch = driver.findElement(By.id("com.peoplelink.inlink:id/searchEmployee"));
//	 relationManagerSearch.click();
//	 
//	 relationManagerSearch.sendKeys("Jyothi");
//	 
//	 driver.pressKeyCode(AndroidKeyCode.BACK);
//	 
//	 WebElement rMClick = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]"));
//	 rMClick.click();
//	 
//	 WebElement broadcastCheckbox = driver.findElement(By.id("com.peoplelink.inlink:id/terms_conditions"));
//	 broadcastCheckbox.click();
//	 
////	 WebElement cancelBtn = driver.findElement(By.id("com.peoplelink.inlink:id/cancelBtn"));
////	 cancelBtn.click();
//	 
//	 WebElement connecttBtn = driver.findElement(By.id("com.peoplelink.inlink:id/connectBtn"));
//	 connecttBtn.click();
//	 
//	 WebElement okBtn = driver.findElement(By.id("com.peoplelink.inlink:id/ok"));
//	 okBtn.click();
	 
	 WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.widget.FrameLayout/android.widget.ImageView")));
	 menu.click();
	 
	 WebElement logOut = driver.findElement(By.id("com.peoplelink.inlink:id/logout_btn"));
	 logOut.click();
	 
	 WebElement yesBtn = driver.findElement(By.id("android:id/button1"));
	 yesBtn.click();
	 
	
	 
	 driver.findElement(By.id("com.peoplelink.inlink:id/emailET")).sendKeys("funnl@yopmail.com");
	 driver.findElement(By.id("com.peoplelink.inlink:id/passwordET")).sendKeys("Inlink@123");
	 driver.findElement(By.id("com.peoplelink.inlink:id/text_input_end_icon")).click();
	 driver.findElement(By.id("com.peoplelink.inlink:id/loginBtn")).click();
	 
	 WebElement networksModule1 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Networks\"]/android.widget.FrameLayout/android.widget.ImageView"));
	 networksModule1.click();
	 
	 WebElement threeDot = driver.findElement(By.id("com.peoplelink.inlink:id/ivDotsMenu"));
	 threeDot.click();
	 
	 WebElement pendingBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
	 pendingBtn.click();
	
	 
	 	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 	 
	 
	 
	 
	 
	}

}
;