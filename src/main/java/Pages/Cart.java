package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

import Browser.Browser;
import Screenshot.Takescreenshot;

public class Cart extends Browser {
	public static String Product;
     public static void getCart() throws InterruptedException 
     {
    	 driver.findElement(By.xpath("//*[@class='header__logo-image']")).click();
    	WebElement SearchBox = driver.findElement(By.xpath("//*[@aria-label='Search...']"));
 		SearchBox.clear();
 		Actions builder = new Actions(driver);
 		Actions seriesOfActions = builder.moveToElement(SearchBox).click().sendKeys(SearchBox, "Books");
 		seriesOfActions.perform();

 		WebElement dropdown =driver.findElement(By.xpath("(//*[@class='search-bar__item-title'])[2]"));
 		dropdown.click();
    	 
 		String Product = driver.findElement(By.xpath("//*[@class='product-meta__title heading h1']")).getText();
     }
 		public static void AddToCart() throws Exception
 		{
 		WebElement AddToCart = driver.findElement(By.xpath("//*[@class='product-form__payment-container']/button"));
 		if (AddToCart.isDisplayed()) {
 			System.out.println("AddToCart");
 			AddToCart.click();
 		}
 		else
 		{
 			System.out.println("AddToCart is not displayed");
 		}
 		
 		Thread.sleep(3000);
 		
 		Takescreenshot.screenShot(7);
       	driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
 		}
 		public static void ViewCart() throws InterruptedException
 		{
       	WebElement ViewCart =driver.findElement(By.xpath("//*[@class='button button--secondary']"));
       	if (ViewCart.isDisplayed()) {
 			System.out.println("ViewCart");
 			ViewCart.click();
 		}
 		else
 		{
 			System.out.println("ViewCart is not displayed");
 		}
       		
       	WebElement MyCart = driver.findElement(By.xpath("//*[@class='page__title heading h1']"));
		String ActualTitle1 = driver.findElement(By.xpath("//*[@class='page__title heading h1']")).getText();
		String ExpectedTitle1 = "My cart";
		Assert.assertEquals(ExpectedTitle1, ActualTitle1);
		Verify.verify(true, ExpectedTitle1, 0);
		System.out.println("MyCart");
		
		String ProductDetails= driver.findElement(By.xpath("//*[@class='line-item__title link text--strong']")).getText();
		Thread.sleep(3000);
		if(Product == ProductDetails )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
			
		Thread.sleep(8000);
 		}
		public static void IncreaseQty() throws Exception
		{
		WebElement IncreaseQuantity = driver.findElement(By.xpath("(//*[@class='quantity-selector__button'])[4]"));
		IncreaseQuantity.click();
		Thread.sleep(3000);
		Takescreenshot.screenShot(8);
		
		String Quantity = driver.findElement(By.xpath("(//*[@class=\"quantity-selector__value\"])[2]")).getText();
		int Q=Quantity.length();
		System.out.println(Q);
		System.out.println(Quantity);
		String Expected_Quantity = Quantity;
		if(Expected_Quantity == Quantity)
			System.out.println("Quantity");
		else
			System.out.println("Quantity is not displaying");
		}

		public static void Checkout() throws InterruptedException
		{
		WebElement CheckOut = driver.findElement(By.xpath("//*[@class='cart-recap__checkout button button--primary button--full button--large']"));
		CheckOut.click();
		Thread.sleep(3000);
		//driver.quit();
		}
     
}