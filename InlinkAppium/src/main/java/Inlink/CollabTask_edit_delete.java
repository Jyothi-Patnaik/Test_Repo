package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CollabTask_edit_delete extends AppiumBaseClass {
	
	@Test
	public void collaborationEdit_Delete() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.widget.FrameLayout/android.widget.ImageView")));
		menu.click();
		
		WebElement collaboration = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/textViewCommunication")));
		collaboration.click();
		
		WebElement task = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/tvTask")));
		task.click();
		
		WebElement viewTask = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.TextView")));
		viewTask.click();
		
		WebElement editTask = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/ivEdit")));
		editTask.click();
		
		WebElement assignTo = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/searchView")));
	    assignTo.sendKeys("reethu");
	    
	    WebElement subject = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")));
	    subject.clear();
	    subject.sendKeys("Android updated Task");
	    
	    WebElement startTime =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/startTime")));
	    startTime.click();
	    
	    WebElement date =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"11 July 2023\"]")));
	    date.click();
	    
	    WebElement okbtn =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
	    okbtn.click();
	    
	    WebElement hrsTime =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"12\"]")));
	    hrsTime.click();
	    
	    WebElement minTime =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"20\"]")));
	    minTime.click();
	    
	    WebElement am_pm =wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/am_label")));
	    am_pm.click();
	    
	    	    
	    WebElement okbtn1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
	    okbtn1.click();
	    
	    WebElement endTime =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/endTime")));
	    endTime.click();
	    
	    WebElement endDate =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"12 July 2023\"]")));
	    endDate.click();
	    
	    WebElement okbtn2 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
	    okbtn2.click();
	    
	    WebElement hrsTime1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"9\"]")));
	    hrsTime1.click();
	    
	    WebElement minTime1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"55\"]")));
	    minTime1.click();
	    
	    
	    WebElement am_pm1 =wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/am_label")));
	    am_pm1.click();
	    
	    WebElement okbtn3 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
	    okbtn3.click();

	    Utill.scrollUp(1, driver);
	    Thread.sleep(1000);
	    WebElement remTime =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/remainderTime")));
	    remTime.click();
	    
	    WebElement remDate =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"11 July 2023\"]")));
	    remDate.click();
	    
	    WebElement remOkbtn =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
	    remOkbtn.click();
	    
	    WebElement remHrs =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"6\"]")));
	    remHrs.click();
	    
	    WebElement remMin =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"0\"]")));
	    remMin.click();
	    
	    WebElement remam_pm =wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/am_label")));
	    remam_pm.click();
	    
	    
	    WebElement remok2 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
	    remok2.click();
	    
	    WebElement selectDropdown =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/text_input_end_icon")));
	    selectDropdown.click();
	    
	    WebElement selectPriority =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/remainderTimeTextInputLayout")));
	    selectPriority.click();
	    
	    WebElement updateBtn =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/createBtn")));
	    updateBtn.click();
	    
	    //Delete
	    WebElement deleteBtn =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/ivDelete")));
	    deleteBtn.click();
	    
//	    WebElement confirmDelete =wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
//	    confirmDelete.click();
//	    
	    WebElement cancelDelete =wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button2")));
	    cancelDelete.click();
	    
	    driver.navigate().back();
		
	    
	    
	    
		
		
		
	}

}
