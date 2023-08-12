package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CollabTask_CompletedTab extends AppiumBaseClass {
	
	@Test
	public void collaboration_Completed() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.widget.FrameLayout/android.widget.ImageView")));
		menu.click();
		
		WebElement collaboration = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/textViewCommunication")));
		collaboration.click();
		
		WebElement task = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/tvTask")));
		task.click();
		
		WebElement completedTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc=\"Completed\"]")));
		completedTab.click();
		

		WebElement viewTask = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/viewTask")));
		viewTask.click();
		
		WebElement comment = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/messageInput")));
		comment.sendKeys("Completed Task successfully");
		
		WebElement sendComment = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/sendButton")));
		sendComment.click();
		 
		driver.navigate().back();
		
		//Filter
		
		WebElement filterBy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView")));
		filterBy.click();
		
		WebElement allOptn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout")));
		allOptn.click();
		
		WebElement assignedByMe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")));
		assignedByMe.click();
		Thread.sleep(2000);
		WebElement assignedToMe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout")));
		assignedToMe.click();
		assignedByMe.click();
	
		WebElement applyFilter = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/apply_filter")));
		applyFilter.click();
		
		
		
		
		

	}
}
