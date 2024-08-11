package Excel;

	import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.Browser;
import Pages.CreateAccount;
import Screenshot.Takescreenshot;

	public class CreateAccountExcel extends Browser {
		public static void testdata() throws IOException, InterruptedException {


			Thread.sleep(3000);
			FileInputStream file = new FileInputStream("C:\\\\Users\\\\H3TJL13.cgi\\\\Documents\\\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\\\HRM_Final\\\\src\\\\main\\\\resources\\demo_create_account.xlsx");
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


						} else {
								excel_data.add("");
							}

						}

						System.out.println(excel_data);






						try {
							String firstname_create=excel_data.get(headers.get("Username"));
							WebElement Create_firstname=driver.findElement(By.xpath("//*[@id='register-customer[first_name]']"));
							Create_firstname.isDisplayed();
							Create_firstname.click();
							Create_firstname.clear();
							Create_firstname.sendKeys(firstname_create);

							String lastname_create=excel_data.get(headers.get("Password"));

							WebElement Create_lastname=driver.findElement(By.xpath("//*[@id='register-customer[last_name]']"));
							Create_lastname.isDisplayed();
							Create_lastname.click();
							Create_lastname.clear();
							Create_lastname.sendKeys(lastname_create);


							String email_create=excel_data.get(headers.get("Email"));
							WebElement Create_email=driver.findElement(By.xpath("//*[@id='register-customer[email]']"));
							Create_email.isDisplayed();
							Create_email.click();
							Create_email.clear();
							Create_email.sendKeys(email_create);

							String password_create=excel_data.get(headers.get("Password"));

							WebElement Create_password=driver.findElement(By.xpath("//*[@id='register-customer[password]']"));
							Create_password.isDisplayed();
							Create_password.click();
							Create_password.clear();
							Create_password.sendKeys(password_create);

							Takescreenshot.screenShot(1);
							WebElement TTCreateAccount = driver.findElement(By.xpath("//*[@id=\"create_customer\"]/button"));
							TTCreateAccount.click();
							CreateAccount.CreateAccount_button_HomePage();


						}

						catch(Exception e) {
							String firstname=excel_data.get(headers.get("Username"));
							WebElement Create_firstname=driver.findElement(By.xpath("//*[@id='customer[first_name]']"));
							Create_firstname.isDisplayed();
							Create_firstname.click();
							Create_firstname.clear();
							Create_firstname.sendKeys(firstname);

							String lastname=excel_data.get(headers.get("Password"));

							WebElement Create_lastname=driver.findElement(By.xpath("//*[@id='customer[last_name]']"));
							Create_lastname.isDisplayed();
							Create_lastname.click();
							Create_lastname.clear();
							Create_lastname.sendKeys(lastname);


							String email=excel_data.get(headers.get("Email"));
							WebElement Create_email=driver.findElement(By.xpath("//*[@id='customer[email]']"));
							Create_email.isDisplayed();
							Create_email.click();
							Create_email.clear();
							Create_email.sendKeys(email);

							String password=excel_data.get(headers.get("Password"));

							WebElement Create_password=driver.findElement(By.xpath("//*[@id='customer[password]']"));
							Create_password.isDisplayed();
							Create_password.click();
							Create_password.clear();
							Create_password.sendKeys(password);


							WebElement CreateAccount = driver.findElement(By.xpath("(//*[@id='create_customer']/button)[2]"));
							CreateAccount.click();

						}




				        try{

				        	WebElement CreatedAccount=driver.findElement(By.xpath("//*[@aria-label='My account']"));
				        	CreatedAccount.isDisplayed();
				        	WebElement MyOrders=driver.findElement(By.xpath("//*[@id='account-popover']/div/div/a[1]"));
				        	MyOrders.isDisplayed();

				        	break;
				        }
				        catch(Exception e){
				        	try {
				        		WebElement accountHeading=driver.findElement(By.xpath("//*[@id='create_customer']/header/h1"));
				        		accountHeading.isDisplayed();
					        	System.out.println("Creds. are not correct");
					        	continue;

				        	}
				        	catch(Exception ee) {
				        		WebElement homepage=driver.findElement(By.xpath("//*[@id='shopify-section-collection-list']/section/div/header/h2"));
				        		homepage.isDisplayed();
				        		System.out.println("Creds. are not correct");
					        	continue;
				        	}


				        }

}


		}
		}