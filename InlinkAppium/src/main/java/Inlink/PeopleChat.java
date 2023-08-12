package Inlink;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class PeopleChat extends AppiumBaseClass {
	
	@Test
	public void people() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"People\"]/android.view.ViewGroup/android.widget.TextView")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/selectContact")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")).click();
	    Thread.sleep(3000);
	    //SendMessage
	    driver.findElement(By.id("com.peoplelink.inlink:id/messageInput")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).sendKeys("Hii");
	    driver.findElement(By.id("com.peoplelink.inlink:id/voiceRecordingOrSend")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).sendKeys("Hello");
		driver.findElement(By.id("com.peoplelink.inlink:id/voiceRecordingOrSend")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).sendKeys("Good Morning");
	    driver.findElement(By.id("com.peoplelink.inlink:id/voiceRecordingOrSend")).click();

	    //sendAttachment
	    driver.findElement(By.id("com.peoplelink.inlink:id/addAttachment")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/messageInput")).sendKeys("Certificate1");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("com.peoplelink.inlink:id/sendBtn")).click();
	    Thread.sleep(1000);
	    //cameraAttachment
	    driver.findElement(By.id("com.peoplelink.inlink:id/addAttachment")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")).click();
	    driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
	    driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
	    driver.findElement(By.id("com.android.camera2:id/done_button")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/messageInput")).sendKeys("cameraAttachment");
	    driver.findElement(By.id("com.peoplelink.inlink:id/sendBtn")).click();
	    
	    //Gallery
	    driver.findElement(By.id("com.peoplelink.inlink:id/addAttachment")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView")).click();
	    //driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
	    driver.findElement(By.id("com.android.gallery3d:id/gl_root_view")).click();
	    //driver.findElement(By.id("com.android.gallery3d:id/gl_root_view")).click();
	    Thread.sleep(2000);
        driver.findElement(By.id("com.peoplelink.inlink:id/messageInput")).sendKeys("Gallery");
        driver.findElement(By.id("com.peoplelink.inlink:id/sendBtn")).click();
        
        //CameraPic
        driver.findElement(By.id("com.peoplelink.inlink:id/takePicture")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
	    driver.findElement(By.id("com.android.camera2:id/done_button")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/messageInput")).sendKeys("cameraPicture");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.ImageButton")).click();
	    Thread.sleep(2000);
	    
	    //clearChat
	    driver.findElement(By.id("com.peoplelink.inlink:id/menuMoreActions")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/checkBox")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/tv_clear")).click();
	    //deleteChat
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/menuMoreActions")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")).click();
	
	    
	    //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]")).click();
	    
	    //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.TextView")).click();
	}
	
	

}
