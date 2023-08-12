package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PeopleGroupEmployees extends AppiumBaseClass {
	
	@Test
	public void groupChatEmployees() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Thread.sleep(1000);
		WebElement people = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"People\"]/android.widget.FrameLayout/android.widget.ImageView")));
		people.click();
		
		
		//driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"People\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Groups\"]/android.widget.TextView")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	    
		WebElement empTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc=\"Employees\"]/android.widget.TextView")));
		empTab.click();
		
		WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/checkbox")));
		checkBox.click();
		

		WebElement nxtBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/next")));
		nxtBtn.click();
		Thread.sleep(3000);
		
		WebElement empGrupName = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/etGroupName")));
		empGrupName.sendKeys("Group1");
		
		WebElement empGrupCreate = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/create_group")));
		empGrupCreate.click();
		
		//sendMessage
	    /*WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")));
	    message.click();
	    WebElement send = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageButton")));
	    send.click();
	    
	    //sendAttachment
	 
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton[1]")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
	    driver.findElement(By.id("com.android.documentsui:id/icon_thumb")).click();
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
        
        //cameraPic
	    
	    WebElement camOption = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/takePicture")));
	    camOption.click();
	    WebElement permission = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_button")));
	    permission.click();
	    WebElement shutterButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.camera2:id/shutter_button")));
	    shutterButton.click();
	    WebElement doneButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.camera2:id/done_button")));
	    doneButton.click();
	    WebElement msgInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/messageInput")));
	    msgInput.sendKeys("CamPic");
	    Thread.sleep(1000);
	    WebElement sendButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.ImageButton")));
	    sendButton.click();
	    Thread.sleep(2000);
	    
        //clearChat
	    WebElement moreOptn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/menuMoreActions")));
	    moreOptn.click();
	    WebElement clearChat = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")));
	    clearChat.click();
	    WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/checkBox")));
	    checkBox.click();
	    WebElement clrOptn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/tv_clear")));
	    clrOptn.click();
	    //delChat
	    WebElement delContactName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[1]")));
	    delContactName.click();
	    WebElement moreOptn1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/menuMoreActions")));
	    moreOptn1.click();
	    WebElement delChat = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")));
	    delChat.click();
	    WebElement delOptn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")));
	    delOptn.click();*/
	    
	}

		
		
		
		
		

	}

