package Excel;

	import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.Browser;
import Pages.Login;
import Screenshot.Takescreenshot;
import okhttp3.Cookie;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.errorprone.annotations.Var;

import Browser.Browser;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.errorprone.annotations.Var;

import Browser.Browser;

	public class Login_Excel extends Browser {
		public static void testdata() throws IOException, InterruptedException {
			
			
			
			FileInputStream file = new FileInputStream("C:\\Users\\H3TJL13.cgi\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\HRM_Final\\src\\main\\resources\\Login_Details.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet ws = wb.getSheet("Sheet1"); // Sheet1
			Row row1 = null;
			Iterator<Row> itr = ws.iterator();
			
			ArrayList<String> excel_data = new ArrayList<String>();
					
					Map<String, Integer> headers = new HashMap<String, Integer>();
					
					row1 = itr.next();
					
					Iterator<Cell> cellIterator = row1.cellIterator();
					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();

						switch (cell.getCellType()) {
						case STRING: // field that represents string cell type
							headers.put(cell.getStringCellValue(), cell.getColumnIndex());

							break;
						case NUMERIC: // field that represents number cell type
							headers.put(String.valueOf((cell.getNumericCellValue())), cell.getColumnIndex());
							break;
						default:
						}
					}
					
					
					
					
					while (itr.hasNext()) {
						// System.out.println("reading defect data: row: "+ row.getRowNum());
						//System.out.println("1st done");
						row1 = itr.next();
						excel_data.clear();
						for (int i = 0; i < headers.size(); i++) {
							if (row1.getCell(i) != null) {
								excel_data.add(row1.getCell(i).toString());
								
								
						}
							
							else
								excel_data.add("");

						}

						System.out.println(excel_data);
									
					//}
					
					
					
						
							
					
					
//					for (int i=0;i<rowcount;i++)
//					{
						
//					XSSFRow celldata=ws.getRow(i+1);
//					String mail=celldata.getCell(1).getStringCellValue();
						String username=excel_data.get(headers.get("Username"));
						
						try {
							WebElement loginheading_username_field=driver.findElement(By.xpath("//*[@id=\"customer[email]\"]"));
							loginheading_username_field.isDisplayed();
							loginheading_username_field.click();
							loginheading_username_field.clear();
							loginheading_username_field.sendKeys(username);
					
							String password=excel_data.get(headers.get("Password"));
							
							WebElement loginheading_password_field=driver.findElement(By.xpath("//*[@id=\"customer[password]\"]"));
							loginheading_password_field.click();
							loginheading_password_field.clear();
							loginheading_password_field.sendKeys(password);
							
							Takescreenshot.screenShot(2);
							
							WebElement LoginButton_Heading = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/button"));
							LoginButton_Heading.click();
							
							
						}
						catch(Exception e) {
							WebElement username_field=driver.findElement(By.xpath("//*[@id=\"login-customer[email]\"]"));
							username_field.isDisplayed();
							username_field.click();
							username_field.clear();
							username_field.sendKeys(username);
					
							String password=excel_data.get(headers.get("Password"));
							
							WebElement password_field=driver.findElement(By.xpath("//*[@id=\"login-customer[password]\"]"));
							password_field.click();
							password_field.clear();
							password_field.sendKeys(password);
							Login.getLogin();
						}
						
						/*
						 * WebElement username_field=driver.findElement(By.xpath(
						 * "//*[@id=\"login-customer[email]\"]")); username_field.click();
						 * username_field.clear(); username_field.sendKeys(username);
						 * 
						 * String password=excel_data.get(headers.get("Password"));
						 * 
						 * WebElement password_field=driver.findElement(By.xpath(
						 * "//*[@id=\"login-customer[password]\"]")); password_field.click();
						 * password_field.clear(); password_field.sendKeys(password);
						 */
				       
				        
				        
				        
				        try{
				        	
				        	WebElement orderpage=driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div[2]/div[2]/div/div[1]/h1"));
				        	orderpage.isDisplayed();
				    
				        	break;
				        }
				        catch(Exception e){
				        	try {
				        		WebElement homepage=driver.findElement(By.xpath("//*[@id=\"shopify-section-collection-list\"]/section/div/header/h2"));
					        	homepage.isDisplayed();
					        	System.out.println("Creds. are not correct");
					        	continue;
					        	
				        	}
				        	catch(Exception ee) {
				        		WebElement loginheading=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/header/h1"));
				        		loginheading.isDisplayed();
				        		System.out.println("Creds. are not correct");
					        	continue;
				        	}
				        	
				     
				        }
					
}
					 
}}