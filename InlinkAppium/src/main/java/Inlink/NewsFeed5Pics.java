package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewsFeed5Pics extends AppiumBaseClass {
	
	@Test
	public void newsFeed5() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement createPost = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/create_post")));
		createPost.click();
		
		WebElement moreoptn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/more")));
		moreoptn.click();
		
		WebElement gallery = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/galleryView")));
		gallery.click();
		
		WebElement pic1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.TextView")));
		pic1.click();
		
		WebElement pic2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.TextView")));
		pic2.click();
		
		WebElement pic3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[7]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.TextView")));
		pic3.click();
		
		WebElement pic4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[8]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.TextView")));
		pic4.click();
		
		WebElement pic5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[9]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.TextView")));
		pic5.click();
		
		WebElement pic6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[11]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.TextView")));
		pic6.click();
		
		WebElement doneBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.TextView")));
		doneBtn.click();
		
		
		WebElement description = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/feed_description")));
		description.sendKeys("5 images upload");
		
		WebElement post = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/post_feed_btn")));
		post.click();
		
		WebElement profieView = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/user_profile_pic")));
		profieView.click();
		
		
		

		
	}

}
