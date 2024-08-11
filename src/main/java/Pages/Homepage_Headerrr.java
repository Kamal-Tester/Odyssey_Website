package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;
import Screenshot.Takescreenshot;

import org.testng.Assert;

public class Homepage_Headerrr extends Browser {
	
public static void menu_item() throws Exception {
	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='shopify-section-header']/section[@data-section-id='header']/header[@role='banner']/div[@class='container']/div[@class='header__inner']/nav[@class='header__desktop-nav hidden-pocket']/button[@aria-label='Open menu']/span[1]")));
	 WebElement menuicon= driver.findElement(By.xpath("//body/div[@id='shopify-section-header']/section[@data-section-id='header']/header[@role='banner']/div[@class='container']/div[@class='header__inner']/nav[@class='header__desktop-nav hidden-pocket']/button[@aria-label='Open menu']/span[1]")); 
	  menuicon.click();
	  
	  Actions builder= new Actions(driver);
	  builder.moveToElement(menuicon).build().perform();
	Takescreenshot.screenShot(3);
	
	String expectedMenuItem1 = "Books"; 
	String expectedMenuItem2 = "Toys & Games"; 
	String expectedMenuItem3 = "Art & Craft"; 
	String expectedMenuItem4 = "Stationery"; 
	String expectedMenuItem5 = "Gift Cards"; 
	
	String actualmenuheading1 =driver.findElement(By.xpath("//*[@id='dropdown-desktop-menu-0']/li[1]/a")).getText(); 
	  Assert.assertEquals(actualmenuheading1, expectedMenuItem1);
	  System.out.println("Books"); 
	 String actualmenuheading2 =driver.findElement(By.xpath("//*[@id='dropdown-desktop-menu-0']/li[2]/a")).getText(); 
	  Assert.assertEquals(actualmenuheading2, expectedMenuItem2);
	  System.out.println("Toys & Games");  
	  String actualmenuheading3 =driver.findElement(By.xpath("//*[@id='dropdown-desktop-menu-0']/li[3]/a")).getText(); 
	  Assert.assertEquals(actualmenuheading3, expectedMenuItem3);
	  System.out.println("Art & Craft"); 
	 String actualmenuheading4 =driver.findElement(By.xpath("//*[@id='dropdown-desktop-menu-0']/li[4]/a")).getText(); 
	  Assert.assertEquals(actualmenuheading4, expectedMenuItem4);
	  System.out.println("Stationery");  
	 String actualmenuheading5 =driver.findElement(By.xpath("//*[@id='dropdown-desktop-menu-0']/li[5]/a")).getText(); 
	  Assert.assertEquals(actualmenuheading5, expectedMenuItem5);
	  System.out.println("Gift Cards");  
	
	
	// Seacrh filters
	  String expectedItem1 = "All categories"; 
	  String expectedItem2 = "Art & Craft"; 
	  String expectedItem3 = "Arts & Crafts"; 
	  String expectedItem4 = "book"; 
	  String expectedItem5 = "Books"; 
	  String expectedItem6 = "Gift Card"; 
	  String expectedItem7 = "Gifts & Home Accents"; 
	  String expectedItem8 = "Health & Wellness"; 
	  String expectedItem9 = "Hobby Products"; 
	  
	  
	  
	  WebElement header =driver.findElement(By.xpath("//*[@id='shopify-section-header']")); 
	  header.getText();
	  System.out.println(header);
	  String actualheading1 =driver.findElement(By.xpath("//*[@id='search-product-type']/option[1]")).getText(); 
	  Assert.assertEquals(actualheading1, expectedItem1);
	  System.out.println("All categories"); 
	  String actualheading2 =driver.findElement(By.xpath("//*[@id='search-product-type']/option[2]")).getText(); 
	  Assert.assertEquals(actualheading2, expectedItem2);
	  System.out.println("Art & Craft"); 
	  String actualheading3 =driver.findElement(By.xpath("//*[@id='search-product-type']/option[3]")).getText(); 
	  Assert.assertEquals(actualheading3, expectedItem3);
	  System.out.println("book"); 
	  String actualheading4 =driver.findElement(By.xpath("//*[@id='search-product-type']/option[4]")).getText(); 
	  Assert.assertEquals(actualheading4, expectedItem4);
	  System.out.println("Books"); 
	  String actualheading5 =driver.findElement(By.xpath("//*[@id='search-product-type']/option[5]")).getText(); 
	  Assert.assertEquals(actualheading5, expectedItem5);
	  System.out.println("Gifts & Home Accents"); 
	  String actualheading6 =driver.findElement(By.xpath("//*[@id='search-product-type']/option[6]")).getText(); 
	  Assert.assertEquals(actualheading6, expectedItem6);
	  System.out.println("Health & Wellness"); 
	  String actualheading7 =driver.findElement(By.xpath("//*[@id='search-product-type']/option[7]")).getText(); 
	  Assert.assertEquals(actualheading7, expectedItem7);
	  System.out.println("Hobby Products"); 
	  
		
	}

	public static void headings() throws InterruptedException {
		
		
		  //WebElement menuicon=driver.findElement(By.
		  //xpath("//*[@class='icon icon--hamburger-mobile']")); menuicon.click();
		  
		  
		  String expectedItem1 = "Discover our products"; 
		  String expectedItem2 = "ODYSSEY BOOK OF THE WEEK - AT PRICE MATCHING OR BETTER THAN OTHER ONLINE SITES"; 
		  String expectedItem3 = "Noted Indian Authors"; 
		  String expectedItem4 = "Noted International Authors"; 
		  String expectedItem5 = "Collections based on Popular Characters / Series"; 
		  String expectedItem6 = "Books By Genre"; 
		  String expectedItem7 = "Stationery & Art Products"; 
		  String expectedItem8 = "Toys & Games"; 
		  String expectedItem9 = "The Odyssey Blog - Read about What's New and Whats Happening at your favourite bookstore in Chennai"; 
		  String actualheading1 =driver.findElement(By.xpath("//h2[normalize-space()='Discover our products']")).getText(); 
		  String actualheading2 = driver.findElement(By.xpath("(//*[@class=\"section__title heading h3\"])[2]")).getText();
		  String actualheading3 = driver.findElement(By.xpath("//h2[normalize-space()='Noted Indian Authors']")).getText();
		  String actualheading4 =driver.findElement(By.xpath("//h2[normalize-space()='Noted International Authors']")).getText(); 
		  String actualheading5 = driver.findElement(By.xpath("//h2[normalize-space()='Collections based on Popular Characters / Series']")).getText();
		  String actualheading6 = driver.findElement(By.xpath("//h2[normalize-space()='Books By Genre']")).getText();
		  String actualheading7 = driver.findElement(By.xpath("//h2[normalize-space()='Stationery & Art Products']")).getText();
		  String actualheading8 = driver.findElement(By.xpath("//h2[normalize-space()='Toys & Games']")).getText();
		  String actualheading9 = driver.findElement(By.xpath("//div[@id='shopify-section-1601020282978']//h2[@class='section__title heading h3']")).getText();
		  Assert.assertEquals(actualheading1, expectedItem1);
		  System.out.println("Discover our products"); 
		  Assert.assertEquals(actualheading2,expectedItem2); 
		  System.out.println("CHILDREN'S BOOKS");
		  Assert.assertEquals(actualheading3, expectedItem3);
		  System.out.println("Noted Indian Authors"); 
		  Assert.assertEquals(actualheading4,expectedItem4); 
		  System.out.println("Noted International Authors");
		  Assert.assertEquals(actualheading5, expectedItem5);
		  System.out.println("Collections based on Popular Characters / Series"); 
		  Assert.assertEquals(actualheading6,expectedItem6); 
		  System.out.println("Books By Genre");
		  Assert.assertEquals(actualheading7, expectedItem7);
		  System.out.println("Stationery & Art Products"); 
		  Assert.assertEquals(actualheading8,expectedItem8); 
		  System.out.println("Toys & Games");
		  Assert.assertEquals(actualheading9,expectedItem9); 
		  System.out.println("The Odyssey Blog - Read about What's New and Whats Happening at your favourite bookstore in Chennai");
		 
	}
	
	public static void myaccount() throws Exception {
		
		WebElement myaccount = driver.findElement(By.xpath("//a[@class='header__action-item-link hidden-pocket hidden-lap']"));
		myaccount.click();
		Takescreenshot.screenShot(4);
		
		String expectedaccountItem1 = "My orders"; 
		String expectedaccountItem2 = "My addresses"; 
		String expectedaccountItem3 = "Store credit"; 
		String expectedaccountItem4 = "Logout"; 
		
		String actualaccountheading1 =driver.findElement(By.xpath("//a[normalize-space()='My orders']")).getText(); 
		  Assert.assertEquals(actualaccountheading1, expectedaccountItem1);
		  System.out.println("My orders"); 
		 String actualaccountheading2 =driver.findElement(By.xpath("//a[normalize-space()='My addresses']")).getText(); 
		  Assert.assertEquals(actualaccountheading2, expectedaccountItem2);
		  System.out.println("My addresses");  
		  String actualaccountheading3 =driver.findElement(By.xpath("//a[@id='Rise-account-page-button']")).getText(); 
		  Assert.assertEquals(actualaccountheading3, expectedaccountItem3);
		  System.out.println("Store credit"); 
		 String actualaccountheading4 =driver.findElement(By.xpath("//a[normalize-space()='Logout']")).getText(); 
		  Assert.assertEquals(actualaccountheading4, expectedaccountItem4);
		  System.out.println("Logout");  
	}
	
	public static void VerifyImages() throws Exception {
		
		WebElement first_img = driver.findElement(By.xpath("//a[@href='/collections/books']//div[@class='collection-item__image-wrapper collection-item__image-wrapper--rounded']//div[@class='aspect-ratio']//img[@class='image--fade-in lazyautosizes ls-is-cached lazyloaded']"));
		WebElement second_img = driver.findElement(By.xpath("(//img[@class='image--fade-in lazyautosizes ls-is-cached lazyloaded'])[2]"));
		WebElement third_img = driver.findElement(By.xpath("(//img[@class='image--fade-in lazyautosizes ls-is-cached lazyloaded'])[3]"));
		WebElement fourth_img = driver.findElement(By.xpath("(//img[@class='image--fade-in lazyautosizes ls-is-cached lazyloaded'])[4]"));
		// Javascript executor to check image
		Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", first_img);
  
		//Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0","return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", first_img);
	      Boolean q = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", second_img);
	      Boolean r = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", third_img);
	      Boolean s = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", fourth_img);

	      //verify if status is true
	      if (p) {
	         System.out.println("First image is present in homepage");
	      } else {
	         System.out.println("First image is not present in homepage");
	      }
	      if (q) {
		         System.out.println("Second image is present in homepage");
		      } else {
		         System.out.println("Second image is not present in homepage");
		      }
	      if (r) {
		         System.out.println("Third image is present in homepage");
		      } else {
		         System.out.println("Third image is not present in homepage");
		      }
	      if (s) {
		         System.out.println("Fouth image is present in homepage");
		      } else {
		         System.out.println("Fourth image is not present in homepage");
		      }
	      //driver.quit();
	}
	
}