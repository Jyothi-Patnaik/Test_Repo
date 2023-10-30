package Inlink;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyProfile_Details extends AppiumBaseClass{
	
	@Test
	public void myProfileDetails() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.widget.FrameLayout/android.widget.ImageView")));
		menu.click();
		
		WebElement profileDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/myProfileLayout")));
		profileDropdown.click();
		
		WebElement myProfile = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/my_profile")));
		myProfile.click();
		
		WebElement overView = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_official_details")));
		overView.click();
		
		WebElement overViewText = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/overView")));
		Thread.sleep(2000);
		overViewText.clear();
		overViewText.sendKeys("I am an enthusiastic, self-motivated, reliable, responsible and hard working person. I am a mature team worker and adaptable to all challenging situations. ");
		
		WebElement overViewSave = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/saveBtn")));
		overViewSave.click();
		Thread.sleep(3000);
		Utill.scrollUp(2, driver);
		
		//PersonalDetails
		
		WebElement editPersonalDetails = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.ImageView")));
		editPersonalDetails.click();
		
//	    WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")));
//	    firstName.click();
	    
	    WebElement inputField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")); // Replace "inputFieldId" with your actual element locator
	    String currentText = inputField.getText();
	    char letterToRemove = 'k'; // Replace 'a' with the particular letter you want to remove
	    String updatedText = currentText.replace(Character.toString(letterToRemove), "p"); // Replace the letter with an empty string
	    //inputField.clear(); // Clear the input field
	    inputField.sendKeys(updatedText); // Enter the updated text
		
		WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")));
		lastName.sendKeys("Kuppili");
		
		// Locate the input field or text area
        WebElement emailwordInput = driver.findElement(By.id("com.peoplelink.inlink:id/emailIdET"));
        
        // Retrieve the current value of the word
        String currentWord = emailwordInput.getText();

        // Append the desired letter to the word
        String updatedWord = currentWord + "m"; // Change "A" to the desired letter

        // Set the updated word value back to the input field
        emailwordInput.clear();
        emailwordInput.sendKeys(updatedWord);
		
//		WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/emailIdET")));
//		email.sendKeys("m");
		
		WebElement countryCode = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/countryCodeET")));
		countryCode.click();
		
		WebElement searchCountry = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/searchView")));
		searchCountry.sendKeys("India");
		
		WebElement selectCountry = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout")));
		Thread.sleep(5000);
		selectCountry.click();
		
		WebElement phno = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/phoneNumberET")));
		phno.sendKeys("9908765123");
		
		WebElement genderMale = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/male")));
		genderMale.click();
		
		WebElement genderFemale = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/female")));
		genderFemale.click();
		
		WebElement doB = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/dataOfBirth")));
		doB.click();
		
		WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"01 July 2023\"]")));
		date.click();
		
		WebElement okBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
		okBtn.click();
		

		WebElement unmarried = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/unmarried")));
		unmarried.click();
		

		//WebElement married = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/married")));
		//married.click();
		

		WebElement bloodgroupdropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/bloodGroupSpinner")));
		bloodgroupdropdown.click();
		
		WebElement bloodgroupSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")));
		bloodgroupSelect.click();
		
		Utill.scrollUp(1, driver);
		
		WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/saveBtn")));
		saveBtn.click();
		
		//Education Details
		
		WebElement educationEdit = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_education_btn")));
		educationEdit.click();

		
		WebElement degreeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")));
		degreeBtn.sendKeys("BE");

		
		WebElement specialization = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")));
		specialization.sendKeys("ECE");

		
		WebElement university = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")));
		university.sendKeys("Osmania");
		
		WebElement saveEdu = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/saveBtn")));
		saveEdu.click();
		
		//Address Details
		
		WebElement editAddress = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_address_btn")));
		editAddress.click();
		
		WebElement enterAddress = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")));
		enterAddress.sendKeys("Cyber towers,Hyderabad");
		
		WebElement countrydropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/presentCountrySinner")));
		countrydropdown.click();
		
		WebElement statedropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/presentStateSinner")));
		statedropdown.click();
		
		WebElement citydropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/presentCitySinner")));
		citydropdown.click();
		
		WebElement pinCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText")));
		pinCode.sendKeys("500070");
		
		WebElement addressSave = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/saveBtn")));
		addressSave.click();
		
		//SocialMediaLinks
		
		WebElement editSocialMedia = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_social_media_btn")));
		editSocialMedia.click();
		
		WebElement dropDownSocialMedia = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/socialMediaSpinner")));
		dropDownSocialMedia.click();
		
		//WebElement selectSocialMedia = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/edit_social_media_btn")));
		//selectSocialMedia.click();
		
		WebElement enterSocialMedia = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/socialMediaLinkEt")));
		enterSocialMedia.sendKeys("https://www.instagram.com");
		
		WebElement socialSaveBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/saveBtn")));
		socialSaveBtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
