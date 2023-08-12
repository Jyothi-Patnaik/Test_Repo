package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CertificationViewcertificate extends AppiumBaseClass {
	
	@Test
	public void viewCertificate() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.widget.FrameLayout/android.widget.ImageView")));
		menu.click();
		
		WebElement certificationProgramme = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.TextView")));
		certificationProgramme.click();
		
				
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/search_button")));
		search.click();
		
		WebElement searchTxt = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/search_src_text")));
		searchTxt.sendKeys("dfsa");
		searchTxt.clear();
		searchTxt.sendKeys("Movies");
		
	    Thread.sleep(2000);
		
		WebElement viewCertificate = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/viewCertificate")));
		viewCertificate.click();

		Thread.sleep(2000);
		WebElement dwnldPdf =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")));
		dwnldPdf.click();
		
		
		
//		WebElement collapse =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.printspooler:id/expand_collapse_handle")));
		//collapse.click();
//		
//		WebElement savePdf =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.printspooler:id/page_content")));
//		savePdf.click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[6]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout")).click();
		driver.navigate().back();
//			
	}

}
