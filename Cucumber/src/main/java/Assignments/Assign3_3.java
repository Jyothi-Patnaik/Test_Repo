package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign3_3 {
	
	WebDriver driver;

	@BeforeMethod
		public void openBrowser() throws InterruptedException
		{

		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/");
		}
	@Test(groups= {"Smoke Test"})
	public void form() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement form = driver.findElement(By.xpath("//h5[text()='Forms']"));
		js.executeScript("arguments[0].scrollIntoView(true)", form);
		form.click();
		//driver.findElement(By.xpath("(//div[@class='header-wrapper'])[2]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		WebElement widget = driver.findElement(By.xpath("//div[text()='Widgets']"));
		js1.executeScript("arguments[0].scrollIntoView(true)", widget);
		
		//practiceForm.click();
		Thread.sleep(2000);
		WebElement practiceForm = driver.findElement(By.xpath("//span[text()='Practice Form']"));	
		js.executeScript("arguments[0].click();", practiceForm);
	}
	
		@Test(groups= {"Regression"})
		public void formFilling() throws InterruptedException {
			form();
			WebElement firstName = driver.findElement(By.id("firstName"));
			firstName.sendKeys("Jyothi");
			WebElement lastName = driver.findElement(By.id("lastName"));
			lastName.sendKeys("Patnaik");
			WebElement email = driver.findElement(By.id("userEmail"));
			email.sendKeys("jyothipatnaik@gmail.com");
			WebElement gender = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
			gender.click();
			WebElement phNo = driver.findElement(By.id("userNumber"));
			phNo.sendKeys("9876543210");
			JavascriptExecutor js2 = (JavascriptExecutor)driver;
			WebElement doB = driver.findElement(By.id("dateOfBirthInput"));
			js2.executeScript("arguments[0].scrollIntoView(true)", doB);
			doB.click();
			WebElement month = driver.findElement(By.xpath("//div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select']"));
			Select monthName = new Select(month);
			// Select an option by visible text
			monthName.selectByValue("OCTOBER");
			WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
			Select years = new Select(month);
			// Select an option by visible text
			years.selectByValue("1998");
			WebElement date=driver.findElement(By.xpath("//div[text()='31']"));
			date.click();
			WebElement subject=driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
			subject.sendKeys("Maths");
			WebElement hobbies=driver.findElement(By.xpath("//label[normalize-space()='Music']"));
			hobbies.click();
			WebElement chooseFile=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
			chooseFile.click();
			chooseFile.sendKeys("C:\\Users\\admin\\OneDrive\\Pictures\\001.png");
			WebElement currentAdress=driver.findElement(By.id("currentAddress"));
			currentAdress.sendKeys("Hitech city, Cyber towers");
			WebElement state=driver.findElement(By.xpath("//div[@id='state']//div[@class=' css-1hwfws3']"));
			state.sendKeys("Telangana");
			WebElement city=driver.findElement(By.xpath("//div[@id='city']//div[contains(@class,'css-1hwfws3')]"));
			city.sendKeys("Hyderabad");
			
			
			
			
			
		}
			
			
			
		
		

	}
//	@AfterMethod
//	public void close() {
//		driver.quit();
//	}


