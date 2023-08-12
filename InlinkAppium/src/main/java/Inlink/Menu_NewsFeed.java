package Inlink;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Menu_NewsFeed extends AppiumBaseClass {
	
	
	    @Test
	    public void newsFeedMenu() throws InterruptedException {
	    	
	    	//MENU--NewsFeed
		//driver.findElement(By.id("com.peoplelink.inlink:id/navigation_bar_item_large_label_view")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
		//Thread.sleep(2000);
		//NewsFeedDropdown
		driver.findElement(By.id("com.peoplelink.inlink:id/news_feed_text")).click();
		driver.findElement(By.id("com.peoplelink.inlink:id/my_feeds")).click();
		driver.navigate().back();
		driver.findElement(By.id("com.peoplelink.inlink:id/my_drafts")).click();
		driver.navigate().back();
		driver.findElement(By.id("com.peoplelink.inlink:id/my_bookmarks")).click();
		driver.navigate().back();
	    }	

}
