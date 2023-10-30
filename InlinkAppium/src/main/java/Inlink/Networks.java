package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Networks extends AppiumBaseClass {
	
	@Test
	public void networks() throws InterruptedException {
	
	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 
	 WebElement networksModule = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Networks\"]/android.widget.FrameLayout/android.widget.ImageView"));
	 networksModule.click();
	 
	 WebElement companySearch = driver.findElement(By.id("com.peoplelink.inlink:id/menu_action_search"));
	 companySearch.click();
	 
	 WebElement enterCompanyName = driver.findElement(By.id("com.peoplelink.inlink:id/search_src_text"));
	 enterCompanyName.sendKeys("Funnl");
	 
	 WebElement followBtn = driver.findElement(By.id("com.peoplelink.inlink:id/followBtn"));
	 //followBtn.click();
	 
	 WebElement connectBtn = driver.findElement(By.id("com.peoplelink.inlink:id/connect"));
	 connectBtn.click();
	 
	 WebElement relationdropdown = driver.findElement(By.id("com.peoplelink.inlink:id/relationSpinner"));
	 relationdropdown.click();
	 
	 WebElement relationSelect = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]"));
	 relationSelect.click();
	 
	 WebElement relationManagerSearch = driver.findElement(By.id("com.peoplelink.inlink:id/searchEmployee"));
	 relationManagerSearch.click();
	 
	 
	 
	 
	 
	 
	 
	 
	 	 
	 
	 
	 
	 
	}

}
;