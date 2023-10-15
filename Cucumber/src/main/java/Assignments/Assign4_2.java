package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class Assign4_2 {
	
	@Test
	public void excelFile() throws InterruptedException, IOException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory/");
		
		System.out.println("Headers");
		List<WebElement> headers = driver.findElements(By.xpath("//ul[@class='navigation-menu nav-right ']"));
		for (WebElement element : headers) {
		    String text = element.getText(); // Get the text of the element
		    System.out.println(text);
		    //click on work-products
		    
		  WebElement Work=driver.findElement(By.xpath("(//span[@class='menu-arrow'])[5]"));
		  Work.click();
		  WebElement products=driver.findElement(By.xpath("//span[text()='products']"));
		  products.click();
		  Thread.sleep(3000);
		  //scroll to Products-vDoctor
		    JavascriptExecutor js =  (JavascriptExecutor)driver;
		    WebElement whiteLableSolution = driver.findElement(By.xpath("(//div[@class='content_case_study'])[2]"));
		    js.executeScript("arguments[0].scrollIntoView(true)", whiteLableSolution);
		    whiteLableSolution.click();
		    Thread.sleep(2000);
		    
		    
		    String mainWindowHandle = driver.getWindowHandle();
		    String firstChildWindowHandle = driver.getWindowHandle();
		    String secondChildWindowHandle =null;
		    Set<String> windowHandles = driver.getWindowHandles();

		    // Switch to the first child window
		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		            break;
		        }
		    }

	        // Switch to the first child window
	        //driver.switchTo().window(firstChildWindowHandle);

	        // Now you're in the first child window and can interact with its elements
	        JavascriptExecutor js1 =  (JavascriptExecutor)driver;
		    WebElement vDoctor = driver.findElement(By.xpath("(//div[@class='demos-box new-demo rounded shadow text-center overflow-hidden border-0'])[6]"));
		    js1.executeScript("arguments[0].scrollIntoView(true)", vDoctor);
		    vDoctor.click();

		    
		 String secondChildWindowHandle1 = driver.getWindowHandles().toArray()[2].toString();

		 // Switch to the second child window
		 driver.switchTo().window(secondChildWindowHandle1);

	        // Now you're in the second child window and can interact with its elements
	        WebElement features = driver.findElement(By.xpath("//a[text()='Features']"));
		    features.click();
	        // Perform actions in the second child window
	        // ...
		    
		    //feature elements
		    System.out.println("Feature Elements");
		    List<WebElement> featureele = driver.findElements(By.xpath("//div[@class='row justify-content-center align-items-center']"));
			for (WebElement feaelement : featureele) {
			    String textFea = feaelement.getText(); // Get the text of the element
			    System.out.println(textFea);
			    
			    
		}
			WebElement Technologies=driver.findElement(By.xpath("//a[normalize-space()='Technology']"));
			Technologies.click();
			
			System.out.println("Technology Elements");
			List<WebElement> Techele = driver.findElements(By.xpath("//body/section[@class='section pt-0 bg-light']/div[@class='container']/div[4]/div[1]/div[1]"));
			for (WebElement Techelement : Techele) {
			    String textTech = Techelement.getText(); // Get the text of the element
			    System.out.println(textTech);
			   
		}
			Thread.sleep(2000);
			WebElement GetQuote = driver.findElement(By.xpath("//div[@class='buy-button']//a[@class='btn btn-primary'][normalize-space()='Get Quote']"));
			GetQuote.click();
			
			FileInputStream fis = new FileInputStream("C:/Users/admin/OneDrive/Desktop/Book2.xlsx");
			XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
			XSSFSheet sheet1 = workbook1.getSheetAt(0); // Replace with the actual sheet name
			
			 String nameCell = sheet1.getRow(0).getCell(0).getStringCellValue(); // Replace 0 with the column index you want to retrieve
			    String emailCell = sheet1.getRow(1).getCell(0).getStringCellValue(); // Replace 1 with the column index for the second column, and so on
			    long contactCell = (long) sheet1.getRow(2).getCell(0).getNumericCellValue();
			    String messageCell = sheet1.getRow(3).getCell(0).getStringCellValue();
			    // Process the data as needed
			    /*try {
					String stringValue = Double.toString(contactCell);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			    System.out.println("Cell 1 Value: " + nameCell);
			    System.out.println("Cell 2 Value: " + emailCell);
			    System.out.println("Cell 3 Value: " + contactCell);
			    System.out.println("Cell 4 Value: " + messageCell);

			
			/*int rowCount= sheet.getLastRowNum();
			for (int i = 0; i <= rowCount; i++) { // Assuming the first row contains headers
			    XSSFRow row = sheet.getRow(i);*/
			
			   
			    
			    
	
		   WebElement name=driver.findElement(By.xpath("//input[@id='FIRSTNAME']"));
		   name.sendKeys(nameCell);
		   
		   WebElement email=driver.findElement(By.xpath("//input[@id='EMAIL']"));
		   email.sendKeys(emailCell);
		   
		   WebElement contact=driver.findElement(By.xpath("//input[@id='PHONE']"));
		   contact.sendKeys(""+contactCell);
		   
		   WebElement interest=driver.findElement(By.xpath("//select[@id='SF_REQUIREMENT']"));
		   //interest.click();
		   Select dropDown = new Select(interest);
		   dropDown.selectByIndex(2);
		   
		   WebElement message=driver.findElement(By.xpath("//textarea[@id='MESSAGE']"));
		   message.sendKeys(messageCell);
		   
		 //button[@id='submit']
		   WebElement submit=driver.findElement(By.xpath(" //button[@id='submit']"));
		   submit.click();
		   
}
}
}
		
	
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    /*Set<String> windowHandles = driver.getWindowHandles();

	        // Switch to the child window
	        for (String windowHandle : windowHandles) {
	            if (!windowHandle.equals(driver.getWindowHandle())) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }

	       //click elements in the child window
	        JavascriptExecutor js1 =  (JavascriptExecutor)driver;
		    WebElement vDoctor = driver.findElement(By.xpath("(//div[@class='demos-box new-demo rounded shadow text-center overflow-hidden border-0'])[6]"));
		    js1.executeScript("arguments[0].scrollIntoView(true)", vDoctor);
		    vDoctor.click();
		    
		    Set<String> windowHandles1 = driver.getWindowHandles();

	        // Iterate through the handles to find the third window (not parent or first child)
	        String thirdWindowHandle = driver.getWindowHandle();
	        //String thirdWindowHandle = null;
	        for (String handle : windowHandles1) {
	            if (!handle.equals(driver.getWindowHandle())) {
	                thirdWindowHandle = handle;
	                break;
	            }
	        }

	        // Switch to the third window
	        driver.switchTo().window(thirdWindowHandle);
		    
	        
	        WebElement features = driver.findElement(By.xpath("//a[normalize-space()='Features']"));
		    features.click();*/
		    
		    
		    
		    
		    
		    
		 
		    //driver.quit();
		
	


