package assign_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign4_1 {
	
	@Test
	public void excelFile() throws IOException,FileNotFoundException, InterruptedException {
		    
		//DataRetreiving from File
			
			FileInputStream fis = new FileInputStream("C:/Users/admin/OneDrive/Desktop/Book1.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0); // Replace with the actual sheet name
			
			/*int rowCount= sheet.getLastRowNum();
			for (int i = 0; i <= rowCount; i++) { // Assuming the first row contains headers
			    XSSFRow row = sheet.getRow(i);*/
			
			    String cell1Value = sheet.getRow(0).getCell(0).getStringCellValue(); // Replace 0 with the column index you want to retrieve
			    String cell2Value = sheet.getRow(1).getCell(0).getStringCellValue(); // Replace 1 with the column index for the second column, and so on
			    
			    // Process the data as needed
			    System.out.println("Cell 1 Value: " + cell1Value);
			    System.out.println("Cell 2 Value: " + cell2Value);
			    
		//DataFromExcelSheet
			    WebDriver driver;
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demo.guru99.com/V4/");
				driver.findElement(By.name("uid")).sendKeys(cell1Value);
				driver.findElement(By.name("password")).sendKeys(cell1Value);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(3000);
				Alert alert = driver.switchTo().alert();

				// Get the text from the alert
				String alertText = alert.getText();
				System.out.println("Text on Prompt : " + alertText);
				// Accept the alert (click OK)
				alert.accept();
			
		driver.close();
		}
	}


