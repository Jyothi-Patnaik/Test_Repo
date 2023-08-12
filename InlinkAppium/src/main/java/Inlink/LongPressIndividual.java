package Inlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LongPressIndividual extends AppiumBaseClass {

	
	@Test
	public void longPressIndividual() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
	//People
	driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"People\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
	WebElement individual = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc=\"Chat\"]/android.widget.TextView")));
	individual.click();
    //driver.findElement(By.xpath ("//*[contains(@text, ‘Super’)]"));
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
    //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]")).click();
    
	LongPress.longPressFunction(1, driver);
	
	WebElement reply = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView")));
    reply.click();
    
    WebElement replyTxt = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/messageInput")));
    replyTxt.sendKeys("replymsg");
    
    WebElement snd = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/voiceRecordingOrSend")));
    snd.click();
    
//    LongPress.longPressFunction(1, driver);
//    
//    WebElement copy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView")));
//    copy.click();
//    
    
    LongPress.longPressFunction(1, driver);
    
    WebElement forward = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.TextView")));
    forward.click();
    
    WebElement forwardContact1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")));
    forwardContact1.click();
    
    WebElement forwardContact2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")));
    forwardContact2.click();
    
    WebElement sndForward = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/next")));
    sndForward.click();
    
    //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
    
    
    //task
    
    LongPress.longPressFunction(1, driver);
    
    WebElement taskClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]/android.widget.TextView")));
    taskClick.click();
    
    //WebElement assignTo = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/searchView")));
    //assignTo.sendKeys("reethu");
    
    WebElement subject = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")));
    subject.sendKeys("Android Task");
    
    WebElement startTime =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/startTime")));
    startTime.click();
    
    WebElement date =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"07 July 2023\"]")));
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
    
    WebElement endDate =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"07 July 2023\"]")));
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
    
    //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true));"));
    //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
//    
//    String locator = "UiScrollable(\"className(\"com.peoplelink.inlink:id/durationInHours".scrollIntoView(resourceId("com.peoplelink.inlink:id/remainderTime"));
//    driver.findElement(MobileBy.AndroidUIAutomator(locator)).click();
//    

    
    Utill.scrollUp(1, driver);
    Thread.sleep(1000);
    WebElement remTime =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/remainderTime")));
    remTime.click();
    
    WebElement remDate =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"07 July 2023\"]")));
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
    
    WebElement createBtn =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/createBtn")));
    createBtn.click();
    
    LongPress.longPressFunction(1, driver);

    //AddToRem
   WebElement addToRem =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/addToRemainder")));
    addToRem.click();
    
    WebElement subRem =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/taskSubject")));
    subRem.sendKeys("Android Reminder");
    
    WebElement remTime1 =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/remainderTime")));
    remTime1.click();
    
    WebElement dateRem =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"07 July 2023\"]")));
    dateRem.click();
    
    WebElement dateOk =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
    dateOk.click();
    
    WebElement hrsTimeRem =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"6\"]")));
    hrsTimeRem.click();
    
    WebElement minTimeRem =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"0\"]")));
    minTimeRem.click();
    
    WebElement okTime =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
    okTime.click();
    
    //WebElement remMe =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id")));
    //remMe.click();
    
    WebElement remInThisConvo =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/radio1")));
    remInThisConvo.click();
    
    WebElement remOthers =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/radio2")));
    remOthers.click();
    
    WebElement addRem =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/addBtn")));
    addRem.click();
    
    WebElement contact1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView")));
    contact1.click();
    
    WebElement contact2 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView")));
    contact2.click();
    
    WebElement nxtOptn =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/next")));
    nxtOptn.click();
    
    WebElement saveOptn =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/createBtn")));
    saveOptn.click();
    
    LongPress.longPressFunction(1, driver);
    
    WebElement starOptn =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[6]/android.widget.TextView")));
    starOptn.click();
    
    LongPress.longPressFunction(1, driver);
    
    WebElement delOptn =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[7]/android.widget.TextView")));
    delOptn.click();
    
    //WebElement deleteMsg =wait.until(ExpectedConditions.elementToBeClickable(By.id("com.peoplelink.inlink:id/tv_clear")));
    //deleteMsg.click();
	}
}
