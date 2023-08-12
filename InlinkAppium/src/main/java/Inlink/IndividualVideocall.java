package Inlink;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.StaleElementReferenceException;

public class IndividualVideocall extends AppiumBaseClass {
	
	@Test
	public void videoCall() throws InterruptedException {
		
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"People\"]/android.view.ViewGroup/android.widget.TextView")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/selectContact")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[1]")).click();
	    //driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.peoplelink.inlink:id/switchCamera")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/bottomLayout")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/muteVideo")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/remoteSurfaceView")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/muteAudio")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.id("com.peoplelink.inlink:id/remoteSurfaceView")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/endCall")).click();
		
	}

}
