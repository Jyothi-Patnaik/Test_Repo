package Inlink;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PeopleIndividualCalls extends AppiumBaseClass {
	
	@Test
	public void audioCall() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"People\"]/android.view.ViewGroup/android.widget.TextView")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/selectContact")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/audioCall")).click();
	    driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("com.peoplelink.inlink:id/muteAudioAfterConnect")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/speakerAfterConnect")).click();
	    Thread.sleep(15000);
	    driver.findElement(By.id("com.peoplelink.inlink:id/endAudioCallAfterConnect")).click();
	    
	}
	
	

}
