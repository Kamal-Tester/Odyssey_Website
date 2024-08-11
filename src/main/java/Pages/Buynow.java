package Pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Browser.Browser;
import Screenshot.Takescreenshot;

public class Buynow extends Browser {
	public static String product;
	public static String price;
	public static String product_title;
	public static void buynow() throws InterruptedException
	{
		WebElement SearchBox = driver.findElement(By.xpath("//*[@aria-label='Search...']"));
	    Actions builder = new Actions(driver);
	    Actions seriesOfActions = builder.moveToElement(SearchBox).click().sendKeys(SearchBox, "Toys");
	    seriesOfActions.perform();
	    
	    WebElement dropdown =driver.findElement(By.xpath("(//*[@class='search-bar__item-title'])[2]")); 
	    dropdown.click();
	    
	   String product = driver.findElement(By.xpath("//h1[@class='product-meta__title heading h1']")).getText();
	   System.out.println(product + product.length());
	   
	   String price = driver.findElement(By.xpath("(//span[@class='price price--highlight'])[1]")).getText();
	   System.out.println(price);
	   WebElement cart= driver.findElement(By.xpath("//Button[@data-action='add-to-cart']"));
	   WebElement buy= driver.findElement(By.xpath("//Button[@class='shopify-payment-button__button shopify-payment-button__button--unbranded']"));
	   
	   if (cart.isDisplayed() && buy.isDisplayed()) {
		   System.out.println("Cart button is displayed");
		   System.out.println("Buy button is displayed");
		   buy.click();
	   }
	   
	   else {
		   System.out.println("No button is present");
	   }
		  
	}
	public static void delivery() throws Exception{
		try {
		String product_title=driver.findElement(By.xpath("(//div/p[@class='_1x52f9s1 _1fragemir _1x52f9so _1fragemkv'])[1]")).getText();
		System.out.println(product_title + product_title.length());

		
		Thread.sleep(5000);
		
		if(product==product_title ) {
			System.out.println("Product title is matching.");
		}
		else {
			System.out.println("Product title is not matching.");
			
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		String randomaddress = RandomStringUtils.randomAlphabetic(20);
		
		WebElement address= driver.findElement(By.xpath("//input[@id='TextField3']"));
		address.click();
		address.sendKeys(randomaddress);
		
        String randomcity = RandomStringUtils.randomAlphabetic(10);
		
		WebElement city= driver.findElement(By.xpath("//input[@id='TextField5']"));
		city.click();
	    city.sendKeys(randomcity);
	    int Start_pincode=3;
	    int Start_mobile=9;
String randompincode = "302017";

		Select state= new Select(driver.findElement(By.xpath("//select[@id='Select1']")));
		state.selectByVisibleText("Rajasthan");
		
		WebElement pincode= driver.findElement(By.xpath("//input[@id='TextField6']"));
		pincode.click();
		pincode.sendKeys(randompincode);
		System.out.println(randompincode);
		
String randommobile = RandomStringUtils.randomNumeric(9);
		
		WebElement mobile= driver.findElement(By.xpath("//input[@id='TextField7']"));
		mobile.click();
		mobile.sendKeys(Start_mobile + randommobile);
		
		Takescreenshot.screenShot(9);
	}
	public static void payment() throws InterruptedException{
		
		WebElement Paynow=driver.findElement(By.xpath("//button[@id='checkout-pay-button']"));
		Paynow.click();
		
		Thread.sleep(3000);
		String errormessage="Available shipping methods have been updated. Confirm your choice before checking out.";
		if(driver.getPageSource().contains(errormessage)){
			Paynow.click();
		
		}

	}
		
			/*
			 * if(pincodeerror.isDisplayed()) { System.out.println("kamal");
			 * pincode.clear(); pincode.sendKeys(randompincode); Paynow.click(); continue; }
			 * else { break; }
			 */
			
		
		/*catch (Exception e){
			System.out.println("Payment page is displayed of catch");
		}*/
		 
	public static void Cancel_Transaction() throws Exception{
		Thread.sleep(5000);
			System.out.println("Payment page is displayed");
			WebElement QR=new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"instrument-checked label__L2Gx2\"]")));
			WebElement cancel = driver.findElement(By.xpath("//*[@class='b2bHeaderCloseWrapper__yf9AW']"));
			
			Takescreenshot.screenShot(11);
			cancel.click();
			
			
			/*
			 * Alert alert= driver.switchTo().alert();
			 * //*[@id=\"container\"]/div[3]/div/div/div/a[2] alert.accept();
			 */
			new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='actions-bar__xT4Ox']/a[2]"))).click();
			
			driver.navigate().back();
			driver.quit();
		
		 }
	

		
		
		
	
	}
