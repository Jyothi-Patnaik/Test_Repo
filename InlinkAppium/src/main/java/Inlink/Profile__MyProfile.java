package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Profile__MyProfile extends AppiumBaseClass {
	
	@Test
	public void myProfile() throws InterruptedException {
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.widget.FrameLayout/android.widget.ImageView")));
			menu.click();
			
			WebElement profileDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/myProfileLayout")));
			profileDropdown.click();
			
			WebElement myProfile = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/my_profile")));
			myProfile.click();
			
			WebElement updateProfilePic = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_logo_btn")));
			updateProfilePic.click();
			
			WebElement uploadImage = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/upload_image")));
			uploadImage.click();
			
			//----->//imagepath
			
			WebElement uploadDone = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/menu_crop")));
			uploadDone.click();
			
			WebElement updateBannerPic = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/profileBanner")));
			updateBannerPic.click();
			
			WebElement uploadBannerImg = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/upload_image")));
			uploadBannerImg.click();
			
			WebElement uploadBannerDone = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/menu_crop")));
			uploadBannerDone.click();
			
			Thread.sleep(2000);
			updateProfilePic.click();
			
			WebElement removeImage = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/remove_image")));
			removeImage.click();
			
			Thread.sleep(2000);
			updateBannerPic.click();
			
            WebElement removeImageB = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/remove_image")));
			removeImageB.click();
			
			
			
			
			
			
			
	}

}
