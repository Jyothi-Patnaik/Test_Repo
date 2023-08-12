package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GroupAudioCall extends AppiumBaseClass {
	
	@Test
	public void audioCallGroup() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Thread.sleep(1000);
		WebElement people = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"People\"]/android.widget.FrameLayout/android.widget.ImageView")));
		people.click();
		
		WebElement groups = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Groups\"]/android.widget.TextView"));
	    groups.click();
	    
	    WebElement contactSel=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[1]"));
	    contactSel.click();
		WebElement audioCalloptn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/audioCall")));
	    audioCalloptn.click();
	    WebElement permission = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_button")));
	    permission.click();
	    WebElement videoOffbtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
	    videoOffbtn.click();
	    WebElement nametextBox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.EditText"));
	    nametextBox.sendKeys("Jyothi");
	    WebElement joinbtn= driver.findElement(By.id("	joinButton"));
	    joinbtn.click();
	    
	    /*Thread.sleep(5000);
	    WebElement mute = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/muteAudioAfterConnect")));
	    mute.click();
	    WebElement speakerbtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/speakerAfterConnect")));
	    speakerbtn.click();
	    WebElement endCall = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/endAudioCallAfterConnect")));
	    endCall.click();*/
	    
	
	
	
	
	
	
	
	
	
	}
	

}
