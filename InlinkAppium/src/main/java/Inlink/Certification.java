package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Certification extends AppiumBaseClass {
	
	@Test
	public void certification() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.widget.FrameLayout/android.widget.ImageView")));
		menu.click();
		
		WebElement certificationProgramme = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.TextView")));
		certificationProgramme.click();
		
		Utill.scrollUp(2, driver);
		
		WebElement getCertificate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.TextView[10]")));
		getCertificate.click();
		
		//Thread.sleep(2000);
		
		WebElement checkBox =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/checkBox")));
		checkBox.click();
		
		WebElement takeTest =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/takeTest")));
		takeTest.click();
		
		Thread.sleep(8000);
		
		WebElement dwnld =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/downloadCertificate")));
		dwnld.click();
		
		Thread.sleep(3000);
		//com.peoplelink.inlink:id/goForMoreCertificates
		WebElement dwnldPdf =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")));
		dwnldPdf.click();
		
		WebElement collapse =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.printspooler:id/expand_collapse_handle")));
		collapse.click();
		
		WebElement savePdf =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.printspooler:id/page_content")));
		savePdf.click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[6]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout")).click();
		driver.navigate().back();
		
	}

}
