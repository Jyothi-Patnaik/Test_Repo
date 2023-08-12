package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CompanyProfile_Details extends AppiumBaseClass{

@Test
public void companyProfileDetails() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView")));
		menu.click();
		
		WebElement profileDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/myProfileLayout")));
		profileDropdown.click();
		
		WebElement companyProfile = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/company_profile")));
		companyProfile.click();
		
		//EditOfficialDetails
		
		/*WebElement editOfficialDetails = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_official_details")));
		editOfficialDetails.click();
		
		WebElement companyName = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/nameOfCompany")));
		companyName.sendKeys("Hexagon Industries Limited");
		
		WebElement searchIndustry = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/industry_type_et")));
		searchIndustry.sendKeys("retail");
		
		WebElement searchIndustryName = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/industriesName")));
		searchIndustryName.click();
		
		WebElement typeOfOrganization = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/organizationType")));
		typeOfOrganization.sendKeys("Manufacturer");
		
		WebElement foundedYear = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/dataOfBirth")));
		foundedYear.click();
		
		WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"01 July 2023\"]")));
		date.click();
		
		WebElement okBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
		okBtn.click();
		
		WebElement website = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/website")));
		website.sendKeys("https://www.hexagon.com");
		
		WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/saveBtn")));
		saveBtn.click();
		
		//FollowersList
		
		WebElement followersBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/followersBtn")));
		followersBtn.click();
		
		WebElement followBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/follow")));
		followBtn.click();
		
		WebElement followersSearch = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/search_list_edit_text")));
		followersSearch.sendKeys("delta");
		
		Thread.sleep(1000);
		
		WebElement followingTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc=\"3 Following\"]/android.widget.TextView")));
		followingTab.click();
		
		WebElement followingSearch = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/search_list_edit_text")));
		followingSearch.sendKeys("delta");
		Thread.sleep(1000);
		
		WebElement mutualTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc=\"2 Mutual\"]/android.widget.TextView")));
		mutualTab.click();
		
		WebElement mutualSearch = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/search_list_edit_text")));
		mutualSearch.sendKeys("delta");
		
		WebElement mailClick = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/mailIdView")));
		mailClick.click();
		driver.navigate().back();
		
		WebElement websiteClick = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/website_link")));
		websiteClick.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		//EditOverView
		
		WebElement overviewEdit = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_over_view_btn")));
		overviewEdit.click();
		
		WebElement companyDescription = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/companyDesc")));
		companyDescription.sendKeys("Software and IT industry");
		
		WebElement address = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/addressEt")));
		address.sendKeys("Banglore");
		
		WebElement countryDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/presentCountrySinner")));
		countryDropdown.click();
		
		WebElement stateDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/presentStateSinner")));
		stateDropdown.click();
		
		WebElement cityDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/presentCitySinner")));
		cityDropdown.click();
		
		WebElement pinCode = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/pincodeEt")));
		pinCode.sendKeys("890097");
		
		WebElement pHno = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/phoneNumber")));
		pHno.sendKeys("7789654321");
		
		WebElement domainName = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/domainName")));
		domainName.sendKeys("yopmail.com");
		
		Utill.scrollUp(1, driver);
		WebElement contactPerson = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/contactPerson")));
		contactPerson.sendKeys("Srithan");
		
		WebElement saveBtnOverview = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/saveBtn")));
		saveBtnOverview.click();*/
		
		//Awards
		
		Utill.scrollUp(3, driver);
		
		/*WebElement addawardsBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_awards_btn")));
		addawardsBtn.click();
		
		WebElement uploadAward = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/upload_image")));
		uploadAward.click();
		
		WebElement selectImgFolder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]")));
		selectImgFolder.click();
		
		WebElement selectImg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@content-desc=\"Photo taken on Jul 12, 2023 2:36:59 PM\"]")));
		selectImg.click();
		
		WebElement awardTitle = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/award_title")));
		awardTitle.sendKeys("First Award");
		
		WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/saveBtn")));
		saveBtn.click();
		
		WebElement clickAward = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/awardsImageView")));
		clickAward.click();
		
		WebElement editAward = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.ImageView")));
		editAward.click();
		
		WebElement editAwardImage = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/back_image")));
		editAwardImage.click();
		
		WebElement selectImgFolder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]")));
		selectImgFolder.click();
		
	    WebElement selectImg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@content-desc=\"Photo taken on Jul 12, 2023 2:36:30 PM\"]")));
	    selectImg.click();
		
	    WebElement awardTitle = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/award_title")));
	    awardTitle.sendKeys("First Awards");
	    
	    WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/saveBtn")));
		saveBtn.click();
		
	    WebElement delAwardBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView")));
	    delAwardBtn.click();

	    WebElement delAward =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/tvYes")));
	    delAward.click();
	    
	    //SocialMediaLinkks
	    
	    WebElement editSocialMedia = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_social_media_btn")));
		editSocialMedia.click();
		
		WebElement dropDownSocialMedia = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/socialMediaSpinner")));
		dropDownSocialMedia.click();
		
		//WebElement selectSocialMedia = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_social_media_btn")));
		//selectSocialMedia.click();
		
		WebElement enterSocialMedia = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/socialMediaLinkEt")));
		enterSocialMedia.sendKeys("https://www.instagram.com");
		
		WebElement socialSaveBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/saveBtn")));
		socialSaveBtn.click();*/
		

		WebElement viewResources = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/resourcesView")));
		viewResources.click();
		
		driver.navigate().back();
        
        WebElement viewCertifications = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/certificationTv")));
        viewCertifications.click();
        
        driver.navigate().back();
        
        WebElement viewNetworks = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/networksTv")));
        viewNetworks.click();
        
        //driver.navigate().back();
        
        WebElement menu1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView")));
		menu1.click();
		
		WebElement profileDropdown1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/myProfileLayout")));
		profileDropdown1.click();
		
		WebElement companyProfile1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/company_profile")));
		companyProfile1.click();
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

		
		

		

		



		
		
		
		
		
		
		
		
		
		
		
		

		

		
		


//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
