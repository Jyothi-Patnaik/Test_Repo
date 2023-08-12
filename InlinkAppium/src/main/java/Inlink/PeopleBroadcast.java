package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PeopleBroadcast extends AppiumBaseClass {
	
	@Test
	public void broadCast() throws InterruptedException {
		//AndroidDriver<MobileElement> driver=null;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		

				
		//People
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"People\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
		
        WebElement broadCast = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc=\"Broadcast\"]/android.widget.TextView")));
        broadCast.click();
        
        WebElement broadCastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[1]")));
        broadCastName.click();
        
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
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/messageInput")).sendKeys("Certificate1");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("com.peoplelink.inlink:id/sendBtn")).click();
	    Thread.sleep(1000);
        
	    //cameraAttachment
	    driver.findElement(By.id("com.peoplelink.inlink:id/addAttachment")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")).click();
	    //driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
	    //driver.findElement(By.id("com.android.camera:id/shutter_button")).click();
	    //driver.findElement(By.id("com.android.camera:id/done_button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("com.peoplelink.inlink:id/messageInput")).sendKeys("BroadCast cameraAttachment");
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.peoplelink.inlink:id/sendBtn")).click();
	    
	  //Gallery
	    driver.findElement(By.id("com.peoplelink.inlink:id/addAttachment")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView")).click();
	    //driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
	    driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Photo taken on Jul 4, 2023 6:41:58 PM\"]")).click();
	    Thread.sleep(2000);
        driver.findElement(By.id("com.peoplelink.inlink:id/messageInput")).sendKeys("Gallery");
        driver.findElement(By.id("com.peoplelink.inlink:id/sendBtn")).click();
	    
        
      //CameraPic
        driver.findElement(By.id("com.peoplelink.inlink:id/takePicture")).click();
//        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
//        driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
//	    driver.findElement(By.id("com.android.camera2:id/done_button")).click();
        Thread.sleep(3000);
	    driver.findElement(By.id("com.peoplelink.inlink:id/messageInput")).sendKeys("cameraPicture");
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.peoplelink.inlink:id/sendBtn")).click();
	    Thread.sleep(2000);
	    
	    //clearChat
	    driver.findElement(By.id("com.peoplelink.inlink:id/menuMoreActionsBroadCast")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/checkBox")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/tv_clear")).click();
	    //deleteChat
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")).click();
	    driver.findElement(By.id("com.peoplelink.inlink:id/menuMoreActionsBroadCast")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")).click();
	
	    

	}	
		
}
	
	
