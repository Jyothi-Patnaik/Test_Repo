package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CollabReminder_edit_Del extends AppiumBaseClass {
	
	@Test
	public void reminder_Edit_Del() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.widget.FrameLayout/android.widget.ImageView")));
		menu.click();
		
		WebElement collaboration = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/textViewCommunication")));
		collaboration.click();
		
		WebElement reminder = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/tvReminders")));
	    reminder.click();
	    
	    WebElement moreOptions = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/reminderMenu")));
	    moreOptions.click();
	    
	    
	    WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")));
	    edit.click();
	    
	    WebElement remTitle = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/remainderTitleET")));
	    remTitle.clear();
	    remTitle.sendKeys("Android Reminder Test");
	    
	    
	    WebElement subRem =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/taskSubject")));
	    subRem.clear();
	    subRem.sendKeys("Android updated Reminder");
	    
	    WebElement remTime1 =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/remainderTime")));
	    remTime1.click();
	    
	    WebElement dateRem =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"11 July 2023\"]")));
	    dateRem.click();
	    
	    WebElement dateOk =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
	    dateOk.click();
	    
	    WebElement hrsTimeRem =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"7\"]")));
	    hrsTimeRem.click();
	    
	    WebElement minTimeRem =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"0\"]")));
	    minTimeRem.click();
	    
	    WebElement okTime =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
	    okTime.click();
	    
	    //WebElement remMe =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id")));
	    //remMe.click();
	    
	    WebElement remOthers =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/radio2")));
	    remOthers.click();
	    
	    WebElement addRem =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/addBtn")));
	    addRem.click();
	    
	    WebElement contact1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView")));
	    contact1.click();
	    
	    WebElement contact2 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView")));
	    contact2.click();
	    
	    WebElement removeContact =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")));
	    removeContact.click();
	    
	    WebElement nxtOptn =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/next")));
	    nxtOptn.click();
	    
	    WebElement saveOptn =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/createBtn")));
	    saveOptn.click();
	    
	    //Delete
	    Thread.sleep(2000);
	    moreOptions.click();
	    
	    WebElement delOptn =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")));
	    delOptn.click();
	    
	    WebElement cancelOptn =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/tvCancel")));
	    cancelOptn.click();
	    
//	    WebElement delBtn =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/tvDelete")));
//	    delBtn.click();
	    
	    driver.navigate().back();
	    
	   
	    
	    
	    
	    
	}
}
