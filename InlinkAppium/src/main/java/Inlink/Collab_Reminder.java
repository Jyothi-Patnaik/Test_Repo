package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Collab_Reminder extends AppiumBaseClass{
	
	@Test
	public void reminder() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.widget.FrameLayout/android.widget.ImageView")));
		menu.click();
		
		WebElement collaboration = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/textViewCommunication")));
		collaboration.click();
		
		WebElement reminder = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/tvReminders")));
	    reminder.click();
	    
	    WebElement viewReminder = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/viewRemainder")));
	    viewReminder.click();
	    
	    WebElement profileClick = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/user_profile_pic1")));
	    profileClick.click();
	    
	    WebElement profileClose = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/close_sheet")));
	    profileClose.click();
	    
	    driver.navigate().back();
	    
	    //Filter
	    WebElement filterBy = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/filterBy")));
	    filterBy.click();
	    
//	    WebElement all = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout")));
//	    all.click();
//	    
//	    WebElement assignedByMe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")));
//	    assignedByMe.click();
	    
	    WebElement assignedToMe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout")));
	    assignedToMe.click();
	    
	    
	     
	    
	    
		
	}

}
