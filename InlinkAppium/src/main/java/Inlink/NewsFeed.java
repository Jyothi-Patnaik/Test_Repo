package Inlink;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;

public class NewsFeed extends AppiumBaseClass {
	
	@Test
	public void createFeed() throws InterruptedException {
	Thread.sleep(2000);
	//imageUpload	
	driver.findElement(By.id("com.peoplelink.inlink:id/create_post")).click();
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();

	driver.findElement(By.id("com.peoplelink.inlink:id/more")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/galleryView")).click();
	driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]")).click();
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.TextView")).click();
    driver.findElement(By.id("com.peoplelink.inlink:id/feed_description")).sendKeys("Android Feed");
	driver.findElement(By.id("com.peoplelink.inlink:id/post_feed_btn")).click();
	
	//bookmark
		//image
		//driver.findElement(By.id("com.peoplelink.inlink:id/ic_menu")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")).click();
		driver.findElement(By.id("com.peoplelink.inlink:id/bookmarkTitle")).click();
	
	//videoUpload
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
	
	driver.findElement(By.id("com.peoplelink.inlink:id/more")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.TextView")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.TextView")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/feed_description")).sendKeys("Video Feed");
	driver.findElement(By.id("com.peoplelink.inlink:id/post_feed_btn")).click();
	

	//video
	
	driver.findElement(By.id("com.peoplelink.inlink:id/ic_menu")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/bookmarkTitle")).click();
	
	//utubeURLUpload
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/create_post")).click();
	//driver.findElement(By.id("com.peoplelink.inlink:id/create_post")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/more")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.TextView")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/youtube_url")).sendKeys("https://youtu.be/mAylNVddfJc");
	driver.findElement(By.id("com.peoplelink.inlink:id/save")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/feed_description")).sendKeys("YoutubeURL Feed");
	driver.findElement(By.id("com.peoplelink.inlink:id/post_feed_btn")).click();
	
	//url
	driver.findElement(By.id("com.peoplelink.inlink:id/ic_menu")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/bookmarkTitle")).click();
	
    //ScrollDownTo posts
	/*JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);", name);
	name.click();
	WebElement name= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView"));
    driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(true);"));
    //WebElement click1 =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView"));
	Thread.sleep(2000);
	name.click();*/
	
	//Like
	driver.findElement(By.id("com.peoplelink.inlink:id/like_unlike_btn")).click();
	Thread.sleep(1000);
	//comment
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/tvComment")).sendKeys("Hello");
	driver.findElement(By.id("com.peoplelink.inlink:id/post_comment")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageButton")).click();
	//share
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView")).click();
	driver.findElement(By.id("android:id/chooser_copy_button")).click();
	//driver.findElement(By.id("android:id/contentPanel")).click();
	
	

    //Camera
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/camera_picker")).click();
	driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
	driver.findElement(By.id("com.android.camera2:id/done_button")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/feed_description")).sendKeys("Camera Feed");
    //relation selection
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView[2]")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/apply_preference")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/post_feed_btn")).click();
	
	
	//Draftpost
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();

	driver.findElement(By.id("com.peoplelink.inlink:id/feed_description")).sendKeys("Draft post");
	driver.navigate().back();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")).click();
	//discardPost
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/feed_description")).sendKeys("Discard post");
	driver.navigate().back();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView")).click();	
	//continueEditing
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/feed_description")).sendKeys("Continue editing post");
	driver.navigate().back();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/feed_description")).sendKeys("Continue editing post again");
	driver.findElement(By.id("com.peoplelink.inlink:id/post_feed_btn")).click();
	
	//EditPost
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/feed_description")).sendKeys("Continue editing post again for all");
	driver.findElement(By.id("com.peoplelink.inlink:id/post_feed_btn")).click();
	
	//DeletePost
	driver.findElement(By.id("com.peoplelink.inlink:id/ic_menu")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.TextView")).click();
	driver.findElement(By.id("com.peoplelink.inlink:id/tv_delete")).click();

	
 }
	
	
}