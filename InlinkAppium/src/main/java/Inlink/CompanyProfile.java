package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CompanyProfile extends AppiumBaseClass {
	
	@Test
	public void companyProfile() throws InterruptedException {
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView")));
			menu.click();
			
			WebElement profileDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/myProfileLayout")));
			profileDropdown.click();
			
			WebElement companyProfile = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/company_profile")));
			companyProfile.click();
			
			WebElement updateProfilePic = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_logo_btn")));
			updateProfilePic.click();
			
			WebElement uploadImage = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/upload_image")));
			uploadImage.click();
			
			WebElement selectImgFolder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]")));
			selectImgFolder.click();
			
			WebElement selectImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@content-desc=\"Photo taken on Jul 12, 2023 10:50:50 AM\"]")));
			selectImage.click();
			
			WebElement uploadDone = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/menu_crop")));
			uploadDone.click();
			
			WebElement updateBannerPic = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/profileBanner")));
			updateBannerPic.click();
			
			WebElement uploadBannerImg = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/upload_image")));
			uploadBannerImg.click();
			
			WebElement selectBannerImgFolder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]")));
			selectBannerImgFolder.click();
			
			WebElement selectBannerImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@content-desc=\"Photo taken on Jul 12, 2023 10:49:36 AM\"]")));
			selectBannerImage.click();
			
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
